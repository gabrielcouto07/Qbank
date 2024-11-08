package com.example.Qbank;

import io.micronaut.context.ApplicationContext;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@MicronautTest
class QbankApplicationTests {

    @Test
    void contextLoads(ApplicationContext context) {
        // Verificar se o contexto de aplicação foi carregado corretamente
        assertTrue(context.isRunning(), "O contexto da aplicação não foi iniciado corretamente.");
    }
}
