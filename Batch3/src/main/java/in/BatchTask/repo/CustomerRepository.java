package in.BatchTask.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.BatchTask.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> {

}