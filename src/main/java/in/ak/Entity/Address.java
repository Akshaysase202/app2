package in.ak.Entity;

import jakarta.persistence.*;

@Entity
public class Address 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
  
    private String street;
    private String city;
    private String state;
    private String pincode;

    @ManyToOne
    @JoinColumn(name = "user_id") 
    private User user;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

    
    
}