package com.github.marcopollivier.app.route;

import com.github.marcopollivier.adapter.messaging.RabbitMQPublisher;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spi.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by marcoollivier on 22/05/17.
 */
@Component
public class ArquivoCobrancaRoute extends RouteBuilder {

    private static final String ROUTEID = "LeituraArquivoCobranca";

    private DataFormat dataFormat;

    private RabbitMQPublisher publisher;

    private String fileURI;

    @Autowired
    public ArquivoCobrancaRoute(RabbitMQPublisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void configure() throws Exception {
        from(fileURI)
                .routeId(ROUTEID)
                .split(body()).streaming()
                .process(exchange -> {
                    publisher.publish("mensagem");
                })
                .end()
                .log("Finalizado processamento do arquivo de cobranca.");
    }

    @Value("${icatu.arquivo.entrada.cobranca.uri}")
    public void setFileURI(String fileURI) {
        this.fileURI = fileURI;
    }

}