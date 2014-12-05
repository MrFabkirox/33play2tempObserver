package controllers;

import java.util.List;

import models.Mess;
import play.*;
import play.data.Form;
import play.db.ebean.Model;
import play.libs.Json;
import play.mvc.*;

public class Application extends Controller {

    public static Result index() {
        return ok(views.html.index.render("33play2tempObserver"));
    }
    public static Result page2() {
        return ok(views.html.page2.render(3456));
    }
    
    
    public static Form<Mess> messB = Form.form(Mess.class);
    
    public static Result page3() {
    	Form<Mess> messF = messB.bindFromRequest();
    	Mess messD = messF.get();
    	messD.save();
        return redirect(controllers.routes.Application.showMess());
    }
    
    public static Result showMess() {
    	List<Mess> messj = Mess.find.all();
    	return ok(Json.toJson(messj));
    }

}
