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
@Table(name = "ordination")
public class Ordination extends LifeCycle{
	
	@Column(name = "ordianation_date", nullable = false)
	private String ordinationDate;

	@Column(name = "ordianation_Number", nullable = false)
	private String ordinationNumber;
}
