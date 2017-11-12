package com.marcopollivier.xmen.queue.rabbitmq.consumer.vivo.tmp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import sun.invoke.util.VerifyAccess;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4ClassRunner.class)
public class ValidadorTest {

    Validador target;

    @Test
    public void validarProdutoCartao() throws Exception {
        target.validarProdutoCartao("CREDITO");
    }

    @Test
    public void validarListaContemDDD() throws Exception {
        List<String> dddsValidos = Arrays.asList("21", "22", "23");
        target.validarListaContemDDD("22", dddsValidos);

    }

    @Test(expected = RegraDeNegocioException.class)
    public void validarListaContemDDDException() throws Exception {
        List<String> dddsValidos = Arrays.asList("21", "22", "23");
        target.validarListaContemDDD("11", dddsValidos);

    }

}
