package com.marcopollivier.xmen.queue.rabbitmq.consumer.vivo.tmp;

public class PropriedadeException extends Exception {

    private static final long serialVersionUID = 1L;

    private String propriedade;

    private String nomeArquivo;

    public PropriedadeException(Throwable t, String nomeArquivo, String propriedade) {
        super("Falha ao ler propriedade [" + propriedade + "] arquivo [" + nomeArquivo + "] ", t);
        this.nomeArquivo = nomeArquivo;
        this.propriedade = propriedade;
    }

    public PropriedadeException(Throwable t, String message, String nomeArquivo, String propriedade) {
        super(message, t);
        this.nomeArquivo = nomeArquivo;
        this.propriedade = propriedade;
    }

    public PropriedadeException(String mensagem, String nomeArquivo, String propriedade) {
        super("Falha ao ler propriedade [" + propriedade + "] arquivo [" + nomeArquivo + "] " + mensagem);

        this.nomeArquivo = nomeArquivo;
        this.propriedade = propriedade;
    }

    public PropriedadeException(String nomeArquivo, String propriedade) {
        super("Falha ao ler propriedade [" + propriedade + "] arquivo [" + nomeArquivo + "]");

        this.nomeArquivo = nomeArquivo;
        this.propriedade = propriedade;
    }

    public String getPropriedade() {
        return this.propriedade;
    }

    public String getNomeArquivo() {
        return this.nomeArquivo;
    }
}
