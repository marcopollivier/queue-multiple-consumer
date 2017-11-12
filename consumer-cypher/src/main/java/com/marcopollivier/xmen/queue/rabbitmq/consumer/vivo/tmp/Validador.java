package com.marcopollivier.xmen.queue.rabbitmq.consumer.vivo.tmp;

import java.util.List;
import java.util.regex.Pattern;

public final class Validador {
    
    private static final String PROP_REGEX_MSISDN_NOVE_DIGITOS = "regex.msisdn.nove.digitos";
	private static final String PROP_REGEX_MSISDN_OITO_DIGITOS = "regex.msisdn.oito.digitos";
	public static final String REGEX_SOMENTE_DIGITOS = "^\\d+$";
    
    private Validador() {
    }

    public static void validarComMascara(String valorEntrada, String mascara, RespostaEnum erroObrigatorio, RespostaEnum erroInvalido)
            throws RegraDeNegocioException {
        validarNaoPermitindoNulo(valorEntrada, erroObrigatorio);
        Pattern pattern = Pattern.compile(mascara);
        if (!pattern.matcher(valorEntrada).matches()) {
            throw new RegraDeNegocioException(erroInvalido);
        }
    }

    public static void validarComMascaraPermitindoNulo(String valorEntrada, String mascara, RespostaEnum erro)
            throws RegraDeNegocioException {
        if (valorEntrada != null) {
            validarComMascara(valorEntrada, mascara, null, erro);
        }
    }

    public static void validarNaoPermitindoNulo(Object valorEntrada, RespostaEnum erroObrigatorio) throws RegraDeNegocioException {
        if (isNull(valorEntrada)) {
            throw new RegraDeNegocioException(erroObrigatorio);
        }
    }

    public static void validarNaoPermitindoNulo(String valorEntrada, RespostaEnum erroObrigatorio) throws RegraDeNegocioException {
        if (isNull(valorEntrada) || isEmpty(valorEntrada)) {
            throw new RegraDeNegocioException(erroObrigatorio);
        }
    }

    public static boolean isNull(Object o) {
        return o == null;
    }

    public static boolean isEmpty(String text) {
        return text.isEmpty();
    }

    public static boolean isNullOrEmpty(String text) {
        return isNull(text) || isEmpty(text);
    }

    public static void validarProdutoCartao(String produtoCartao) throws RegraDeNegocioException {

        if (isNullOrEmpty(produtoCartao)) {
            throw new RegraDeNegocioException(RespostaEnum.PRODUTO_CARTAO_OBRIGATORIO);
        }
        ProdutoCartaoEnum.isValid(produtoCartao);
    }

    public static void validarDDD(String ddd, List<String> listaDDDs) throws RegraDeNegocioException {

        if (isNullOrEmpty(ddd)) {
            throw new RegraDeNegocioException(RespostaEnum.DDD_OBRIGATORIO);
        }

        if(listaDDDs == null || listaDDDs.isEmpty()){
            throw new RegraDeNegocioException("Lista de DDDs nula ou vazia", RespostaEnum.ERRO_INTERNO);
        }

        if(!listaDDDs.contains(ddd)){
            throw new RegraDeNegocioException(RespostaEnum.DDD_INVALIDO_PARA_OPERACAO);
        }

    }

}