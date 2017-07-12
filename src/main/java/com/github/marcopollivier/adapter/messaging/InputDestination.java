package com.github.marcopollivier.adapter.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

/**
 * Created by marcoollivier on 06/06/17.
 */
public interface InputDestination {

    @Input(QueueConstants.FATURA_CONVERTIDA_INPUT)
    MessageChannel inputFaturaConvertida();

    @Input(QueueConstants.CARTAO_CADASTRADO_INPUT)
    MessageChannel inputFaturaCartaoCadastrado();

    @Input(QueueConstants.FATURA_CANCELADA_INPUT)
    MessageChannel inputFaturaCancelada();

    @Input(QueueConstants.XMEN_FATURA_PROCESSADA_INPUT)
    MessageChannel inputFaturaProcessada();

    @Input(QueueConstants.XMEN_FATURA_CHARGEBACKED_INPUT)
    MessageChannel inputFaturaChargeback();

}
