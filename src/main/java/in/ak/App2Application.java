package in.ak;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ak.Entity.Address;
import in.ak.Entity.User;
import in.ak.Repository.UserRepo;

@SpringBootApplication
public class App2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App2Application.class, args);
		UserRepo userRepository = context.getBean(UserRepo.class);

	       
	        User user = new User();
	        user.setName("Akshay Sase");
	        user.setEmail("sase@gmail.com");
	        user.setPhone("9999999999");
	        user.setPincode("442401");

	       
	        Address a1 = new Address();
	        a1.setStreet("Manual Street");
	        a1.setCity("Pune");
	        a1.setState("Maharashtra");
	        a1.setPincode("411001");
	        a1.setUser(user);
	        
	        Address a2 = new Address();
	        a2.setStreet("Manual Street");
	        a2.setCity("Ammerpet");
	        a2.setState("Hyd");
	        a2.setPincode("411001");
	        a2.setUser(user);

	        user.setAddress(Arrays.asList(a1,a2));

	       
	        userRepository.save(user);

	        System.out.println(user);
	}

}
