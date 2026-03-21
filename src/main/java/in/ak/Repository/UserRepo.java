package in.ak.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ak.Entity.User;

public interface UserRepo  extends JpaRepository<User, Integer>{

}
