package step;

import com.itextpdf.text.DocumentException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RipleyHome;
import pages.Utilidades;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class StepRipley {

    WebDriver driver = new ChromeDriver();
    Utilidades utilidades = new Utilidades();
    RipleyHome ripley = new RipleyHome(driver);
    @Given("Cuando ingreso a la pagina de Ripley")
    public void cuandoIngresoALaPaginaDeRipley() {
    ripley.ingresar();
   }

    @When("Valido que efectivamente me encuentro en el menu de ripley")
    public void validoQueEfectivamenteMeEncuentroEnElMenuDeRipley() {
        ripley.ingresarClick();
    }

    @And("Ingreso correo {string} contrasena en el campo {string} en la pagina login")
    public void ingresoCorreoContrasenaEnElCampoEnLaPaginaLogin(String arg0, String arg1) {
        ripley.credencialesAcceso(arg0,arg1);
    }

    @And("presiono el boton de {string} posicionado en la pantalla de login")
    public void presionoElBotonDePosicionadoEnLaPantallaDeLogin(String arg0) {
        ripley.botonesPaginaRipley(arg0);
    }

    @Then("Verifico el siguiente texto de error en el login")
    public void verificoElSiguienteTextoDeErrorEnElLogin(String arg0) {
        ripley.visualizacionesTexto(arg0);
    }

    @And("Presiono el boton de {string} en la pantalla del login")
    public void presionoElBotonDeEnLaPantallaDelLogin(String arg0) {
        ripley.botonesPaginaRipley(arg0);
    }

    @And("Valido que me encuentro en la pantalla de {string}")
    public void validoQueMeEncuentroEnLaPantallaDe(String arg0) {
        ripley.visualizacionesTexto(arg0);
    }

    @And("Ingreso el {string} en la pantalla de recuperar cuenta")
    public void ingresoElEnLaPantallaDeRecuperarCuenta(String arg0) {
        ripley.ingresoRutOlvidoPass(arg0);
    }

    @And("presiono el boton de {string} en la pantalla de recuperar cuenta")
    public void presionoElBotonDeEnLaPantallaDeRecuperarCuenta(String arg0) {
        ripley.botonesPaginaRipley(arg0);
    }

    @Then("Valido que el cliente efectivamente no exista y se despliega el siguiente mensaje")
    public void validoQueElClienteEfectivamenteNoExistaYSeDespliegaElSiguienteMensaje(String arg0) {
        ripley.visualizacionesTexto(arg0);
    }

    @Then("Valido que el cliente efectivamente exista y se despliega el siguiente mensaje")
    public void validoQueElClienteEfectivamenteExistaYSeDespliegaElSiguienteMensaje(String arg0) {
        ripley.visualizacionesTexto(arg0);
    }

    @When("Valido que efectivamente me encuentro en la pagina principal de ripley")
    public void validoQueEfectivamenteMeEncuentroEnLaPaginaPrincipalDeRipley() {
        ripley.existePlaceholder();
    }

    @And("Ingreso el producto que deseo buscar en la barra principal {string}")
    public void ingresoElProductoQueDeseoBuscarEnLaBarraPrincipal(String arg0) {
        ripley.visualizacionesTexto(arg0);
    }

    @And("Selecciono el segundo elemento de la lista en la busqueda principal")
    public void seleccionoElSegundoElementoDeLaListaEnLaBusquedaPrincipal() {
        ripley.seleccionSegundoElementoLista();
    }

    @And("Presiono el boton anadir {string}")
    public void presionoElBotonAnadir(String arg0) {
        ripley.botonesPaginaRipley(arg0);
    }

    @And("Presiono el carrito en la parte superior de la pagina")
    public void presionoElCarritoEnLaParteSuperiorDeLaPagina() {
        ripley.clickCarrito();
    }

    @And("Presiono el boton de {string}")
    public void presionoElBotonDe(String arg0) {
        ripley.botonesPaginaRipley(arg0);
    }

    @Then("Valido el boton de {string} en el resumen de la compra")
    public void validoElBotonDeEnElResumenDeLaCompra(String arg0) {
        ripley.visualizacionesTexto(arg0);
    }

    @And("Selecciono el primer elemento de la lista en la busqueda del producto")
    public void seleccionoElPrimerElementoDeLaListaEnLaBusquedaDelProducto() {
        ripley.seleccionarMonarch();
    }

    @And("Selecciono {string} en la polera seleccionada")
    public void seleccionoEnLaPoleraSeleccionada(String arg0) {
        ripley.botonesPaginaRipley(arg0);
    }

    @And("Selecciono el perfume versace de la lista en la busqueda del producto")
    public void seleccionoElPerfumeVersaceDeLaListaEnLaBusquedaDelProducto() {
        ripley.SeleccionoPerfume();
    }
}