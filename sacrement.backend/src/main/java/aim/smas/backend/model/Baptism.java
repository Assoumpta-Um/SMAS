/**
 * 
 */
package aim.smas.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author aimable
 *
 */
@Entity
@Getter
@Setter
@Table(name = "baptism")
public class Baptism extends LifeCycle{
	
	@Column(name = "baptism_date", nullable = false)
	private String baptismDate;
	
	@Column(name = "baptism_number", nullable = false)
	private String baptismNumber;
	
	

	public Baptism() {
		super();
	}



	public Baptism(String baptismDate, String baptismNumber) {
		super();
		this.baptismDate = baptismDate;
		this.baptismNumber = baptismNumber;
	}



	public String getBaptismDate() {
		return baptismDate;
	}



	public void setBaptismDate(String baptismDate) {
		this.baptismDate = baptismDate;
	}



	public String getBaptismNumber() {
		return baptismNumber;
	}



	public void setBaptismNumber(String baptismNumber) {
		this.baptismNumber = baptismNumber;
	}
	
	
	
}
