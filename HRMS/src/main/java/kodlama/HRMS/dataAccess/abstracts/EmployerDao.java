package kodlama.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.HRMS.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{
	

}
