/**
 * 
 */
package aim.smas.backend.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

/**
 * @author aimable
 *
 */

@MappedSuperclass
@Getter
@Setter
public class LifeCycle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@Column(name = "father_name", nullable = false)
	private String fatherName;
	
	@Column(name = "mother_name", nullable = false)
	private String motherName;
	
	@Column(name = "patron_matron", nullable = false)
	private String patronMatron;
	
	@Column(name = "palce_of_summons", nullable = false)
	private String placeOfSummons;
	
	@Column(name = "province", nullable = false)
	private String province;
	
	@Column(name = "district", nullable = true)
	private String district;
	
	@Column(name = "sector", nullable = true)
	private String sector;
	
	
	
	

	public LifeCycle() {
		super();
	}

	public LifeCycle(Long id, String firstName, String lastName, String fatherName, String motherName,
			String patronMatron, String placeOfSummons, String province, String district, String sector) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.patronMatron = patronMatron;
		this.placeOfSummons = placeOfSummons;
		this.province = province;
		this.district = district;
		this.sector = sector;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getPatronMatron() {
		return patronMatron;
	}

	public void setPatronMatron(String patronMatron) {
		this.patronMatron = patronMatron;
	}

	public String getPlaceOfSummons() {
		return placeOfSummons;
	}

	public void setPlaceOfSummons(String placeOfSummons) {
		this.placeOfSummons = placeOfSummons;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
	
	
	
}
