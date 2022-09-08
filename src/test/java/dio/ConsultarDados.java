package dio;

import dio.junit.BandoDeDados;
import dio.junit.Pessoa;
import org.junit.After;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDados {

    @BeforeAll
    static void configConexao(){
        BandoDeDados.iniciarConexao();
        // System.out.println("inicinou");
    }
    @BeforeEach
    void insereDadosParaTeste(){
        BandoDeDados.insereDados(new Pessoa("joao", LocalDateTime.of(2000,1,1,13,00)));
    }
    @AfterEach
    void removeDadosDoTeste(){
        BandoDeDados.removeDados(new Pessoa("joao", LocalDateTime.of(2000,1,1,13,00)));
    }
    @Test
    void validarDados(){
        Assertions.assertTrue(true);
    }
    @Test
    void validarDados2(){
        Assertions.assertTrue(true);
    }
    @AfterAll
    static void finalizaConexao(){
        BandoDeDados.finalizarConexao();
        // System.out.println("terminou");
    }

}
