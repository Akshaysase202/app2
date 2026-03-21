package in.ak.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User 
{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer ID;
 
 private String name;
 
  private List<Address> address;
	
 
}
