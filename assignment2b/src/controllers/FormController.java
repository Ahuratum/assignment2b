package controllers;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import beans.User;
/**
 * @author Nick
 *
 */
@ManagedBean
@ViewScoped
public class FormController {
	public String onSubmit() {
		// Get user data from form 
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		// Debug through console 
		System.out.println("onSubmit Clicked");
		System.out.println("User first name is " + user.getFirstName());
		System.out.println("User last name is " + user.getLastName());
		// Attach the user data to the request 
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		return "TestResponse.xhtml";
	}
	public String onFlash(User user) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);
		System.out.println("onFlash Clicked");
		return "TestResponse2.xhtml";
	}
}
