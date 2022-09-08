package dio;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import java.time.LocalDateTime;
import java.time.LocalDate;


public class PessoaTest {

    @Test
    void validaIdade(){
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000,1,1, 15 ,0 ,0));
        Assertions.assertEquals(22, jessica.getIdade());
    }

    @Test
    void dizSeEMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000,1,1, 15 ,0 ,0));
        Assertions.assertTrue(jessica.maior());


    }
}
