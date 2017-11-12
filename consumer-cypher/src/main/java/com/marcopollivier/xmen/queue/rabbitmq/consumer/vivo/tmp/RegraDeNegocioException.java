package com.marcopollivier.xmen.queue.rabbitmq.consumer.vivo.tmp;

public class RegraDeNegocioException extends Exception {

    private static final long serialVersionUID = -913746164396534311L;

    private RespostaEnum resposta;

    public RegraDeNegocioException(Throwable t) {
        super(t);
        if (t instanceof PropriedadeException) {
            resposta = RespostaEnum.PROPRIEDADE_NAO_ENCONTRADA;
        } else if (t instanceof ArquivoDePropriedadeException) {
            resposta = RespostaEnum.ARQUIVO_DE_PROPERTIES_NAO_ECONTRADO;
        } else {
            resposta = RespostaEnum.ERRO_INTERNO;
        }
    }

    public RegraDeNegocioException(RespostaEnum resposta) {
        super(resposta.toString());
        this.resposta = resposta;
    }

    public RegraDeNegocioException(String message, RespostaEnum resposta) {
        super(resposta.toString() + " message [" + message + "]");
        this.resposta = resposta;
    }

    public RegraDeNegocioException(String message, RespostaEnum resposta, Throwable t) {
        super(resposta.toString() + " message [" + message + "]", t);
        this.resposta = resposta;
    }

    public RegraDeNegocioException(RespostaEnum resposta, Throwable t) {
        super(resposta.toString(), t);
        this.resposta = resposta;
    }

    public RespostaEnum getResposta() {
        return resposta;
    }

    @Override
    public String getMessage() {

        StringBuilder sb = new StringBuilder();

        if (resposta != null) {
            sb.append("Codigo [").append(resposta.getCodigo()).append("]");
            sb.append(" Mensagem [").append(resposta.getDescricao()).append("] - ");
        }

        sb.append(super.getMessage());

        return sb.toString();
    }

    public static void handleException(Throwable t) throws RegraDeNegocioException {
        if (t instanceof RegraDeNegocioException) {
            throw (RegraDeNegocioException) t;
        }
        throw new RegraDeNegocioException(RespostaEnum.ERRO_INTERNO, t);
    }

}
