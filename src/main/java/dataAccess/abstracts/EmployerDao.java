package dataAccess.abstracts;

import entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployerDao extends JpaRepository<Employer, Integer > {

}
