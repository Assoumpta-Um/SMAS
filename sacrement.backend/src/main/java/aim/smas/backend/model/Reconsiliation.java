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
@Setter
@Getter
@Table(name = "reconsiliation")
public class Reconsiliation extends LifeCycle{
	
	@Column(name = "reconsiliation_date", nullable = false)
	private String reconsiliationDate;
	
	@Column(name = "reconsiliation_number", nullable = false)
	private String reconsiliationNumber;

}
