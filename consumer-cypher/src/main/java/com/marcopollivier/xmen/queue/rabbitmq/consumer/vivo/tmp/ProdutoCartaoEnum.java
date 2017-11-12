package com.marcopollivier.xmen.queue.rabbitmq.consumer.vivo.tmp;

import java.util.Arrays;

/**
 * Created by lilianferesl on 24/08/17.
 */
public enum ProdutoCartaoEnum {
    CREDITO, DEBITO;

    public static ProdutoCartaoEnum findByName(String nome) throws RegraDeNegocioException {
        if (nome == null) {
            return null;
        }

        return Arrays.stream(ProdutoCartaoEnum.values())
                .filter(e -> e.name().equals(nome))
                .findFirst()
                .orElseThrow(() -> new RegraDeNegocioException(RespostaEnum.PRODUTO_CARTAO_INVALIDO));
    }

    public static void isValid(String produtoCartao) throws RegraDeNegocioException {
        findByName(produtoCartao);
    }
}
