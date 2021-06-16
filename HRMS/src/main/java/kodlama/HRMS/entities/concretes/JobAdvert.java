package kodlama.HRMS.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_adverts")
public class JobAdvert {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="job_advert_name")
	private String Job_advert_name;
	
	
	//@Column(name="job_position_id")
	//private int Job_position_id;
	
	
	//@JoinColumn(name="employer_id")
	//private int employer_id;
	
	
	//@JoinColumn(name="city_id")
	//private int City_id;
	
	@Column(name = "salary_max")
	private int salaryMax;
	
	@Column(name = "salary_min")
	private int salaryMin;

	@Column(name = "description")
	private String description;
	
	@Column(name = "open_position_count")
	private int openPositionCount;
	
	@Column(name = "application_deadline")
	private LocalDateTime applicationDeadline;
	
	@Column(name = "published_date")
	private LocalDateTime publishedDate;
	
	@Column (name = "is_open",columnDefinition="boolean default true")
	private boolean isOpen;
	
	@ManyToOne()
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City city;
			
}
