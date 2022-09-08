package dio.junit;
import java.util.logging.Logger;

public class BandoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BandoDeDados.class.getName());

    public static void iniciarConexao(){
        //
        LOGGER.info("Connected");
    }

    public static void finalizarConexao(){
        //
        LOGGER.info("Disconnected");
    }
    public static void insereDados(Pessoa pessoa){
        LOGGER.info("Inseriu dado");
    }

    public static void removeDados(Pessoa pessoa){
        LOGGER.info("Remove dado");
    }

}
