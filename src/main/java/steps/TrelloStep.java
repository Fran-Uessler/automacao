package steps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pom.LoginPage;

public class TrelloStep {
    LoginPage loginPage;
    @Dado("^que eu esteja logado no trello$")
    public void queEuEstejaLogadoNoTrello() throws Throwable {
        loginPage = new LoginPage();
        loginPage.access();
        loginPage.doLogin( "francieleferreirauessler",  "franfm90");
        Assert.assertEquals("Página Inicial do Trello",
            loginPage.checkInitialPage());

     }

    @E("^acesse o board$")
    public void acesseOBoard()throws Throwable {
        System.out.println("acesseOBoard");
    }

    @Quando("^crio um card com nome \"([^\"]*)\"$")
    public void crioUmCardComNome(String arg0) throws Throwable {
        System.out.println("crioUmCardcomNome");
    }

    @E("^comento \"([^\"]*)\"$")
    public void comento(String arg0) throws Throwable {
        System.out.println("comento");
    }

    @Então("^o card deve estar na lista$")
    public void oCardDeveEstarNaLista() throws Throwable {
        System.out.println("oCardDeveEstarNaLista");
    }

    @Quando("^excluo o card$")
    public void excluoOCard() throws Throwable {
        System.out.println("escluoOCard");
        
    }

    @Então("^o card não existe mais$")
    public void oCardNãoExisteMais() throws Throwable {
        System.out.println("oCardNãoExisteMais");
    }
}
