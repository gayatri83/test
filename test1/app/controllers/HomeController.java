package controllers;
import javafx.scene.control.ContentDisplay;
import javax.inject.Inject;
import play.data.Form;
import play.data.FormFactory;
import models.Login;
import play.mvc.Controller;
import play.mvc.Http;
import java.lang.Object;
import play.mvc.Result;
import javax.swing.text.AbstractDocument;
import play.mvc.Results;
import java.lang.String;
import views.html.index;
import views.html.main;
import views.html.login_page;
import play.libs.*;
import models.*;
import java.util.*;
import javax.swing.text.AbstractDocument;
import play.api.mvc.*;
import javafx.application.Application;
import play.db.*;
import io.ebean.Ebean;
import java.util.concurrent.CompletionStage;
/*import com.avaje.ebean.Model;*/

public class HomeController extends Controller {

    Form<Login> loginForm;
    @Inject
    public HomeController(FormFactory formFactory)
    {
        this.loginForm = formFactory.form(Login.class);
    }
    public Result index () {
        return ok(views.html.index.render());
    }
    public Result renderLoginPage ()
    {
        return ok(views.html.login_page.render(loginForm));
    }
    public Result submitLoginForm (Http.Request request) {
        Login filledFormDetails = loginForm.bindFromRequest(request).get();
        return ok(""+filledFormDetails.getEmail());

    }



}
