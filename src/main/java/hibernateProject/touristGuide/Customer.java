package hibernateProject.touristGuide;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
@Entity
public class Customer {
@Id	
private long customer_id;
@Column
private String Name;
@Column
private String Mobile_No;
@Column
private String email;
public long getCustomer_id() {
	return customer_id;
}
public void setCustomer_id(long customer_id) {
	this.customer_id = customer_id;
}

public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getMobile_No() {
	return Mobile_No;
}
public void setMobile_No(String mobile_No) {
	Mobile_No = mobile_No;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
