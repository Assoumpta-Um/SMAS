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
@Table(name = "marriage")
public class Marriage extends LifeCycle{

	@Column(name = "marriage_date", nullable = false)
	private String marriageDate;
	
	@Column(name = "marriage_number", nullable = false)
	private String marriageNumber;
	
	@Column(name = "spouse_names", nullable = false)
	private String spouseNames;
	
	@Column(name = "spouse_baptism_date", nullable = false)
	private String spouseBaptismDate;
	
	@Column(name = "spouse_baptism_number", nullable = false)
	private String spouseBaptismNumber;
	
}







