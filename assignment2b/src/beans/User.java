/**
 * @author Nicolas Hagen
 */
package beans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
@ManagedBean(name="user")
@ViewScoped 
public class User {
	private String firstName;
	private String lastName;
	public User() {
		firstName = "Nicolas";
		lastName = "Hagen";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}