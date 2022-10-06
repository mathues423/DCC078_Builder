import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Site_compraBuilderTest {

    @Test
    void deveRetornarExcecaoParaCPF(){
        try{
            Site_compraBuilder usuario = new Site_compraBuilder();
            usuario.setCpf("9999999991").setName("Nome").setEmail("n@mail.com").construtor();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Tamanho de CPF inválido.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaNome(){
        try{
            Site_compraBuilder usuario = new Site_compraBuilder();
            usuario.setCpf("999999999").setEmail("n@mail.com").construtor();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Nome inválido.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaEmail(){
        try{
            Site_compraBuilder usuario = new Site_compraBuilder();
            usuario.setCpf("999999999").setName("Nome").setEmail("n_mail.com").construtor();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("E-mail inválido.", e.getMessage());
        }
    }

    @Test
    void caminhoFeliz(){
        Site_compraBuilder usuario = new Site_compraBuilder();
        usuario.setCpf("999999999").setName("Nome").setEmail("n@mail.com").construtor();
    }
}