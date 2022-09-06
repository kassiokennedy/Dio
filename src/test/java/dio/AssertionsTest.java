package dio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

    @Test
    void validarLancamento(){

        int[] primeiro = {1,2,3,4,5};
        int[] segundo = {1,2,3,4,5};

        Assertions.assertArrayEquals(primeiro, segundo);
    }
    @Test
    void validarNull(){
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);
    }

}
