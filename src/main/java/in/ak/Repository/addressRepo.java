package in.ak.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ak.Entity.Address;

public interface addressRepo  extends JpaRepository<Address, Integer>{

}
