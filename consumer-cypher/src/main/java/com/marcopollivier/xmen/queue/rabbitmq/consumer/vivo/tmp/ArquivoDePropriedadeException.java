package com.marcopollivier.xmen.queue.rabbitmq.consumer.vivo.tmp;

public class ArquivoDePropriedadeException extends Exception {

    private static final long serialVersionUID = 1L;

    private String nomeArquivo;

    public ArquivoDePropriedadeException(Throwable t, String nomeArquivo) {
        super("Falha ao ler o arquivo[" + nomeArquivo + "]", t);
        this.nomeArquivo = nomeArquivo;
    }

    public ArquivoDePropriedadeException(String nomeArquivo) {
        super("Falha ao ler o arquivo[" + nomeArquivo + "]");
        this.nomeArquivo = nomeArquivo;
    }

    public String getNomeArquivo() {
        return this.nomeArquivo;
    }

}
