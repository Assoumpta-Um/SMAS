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
@Table(name = "confirmation")
public class Confirmation extends LifeCycle{

	@Column(name = "confirmation_date", nullable = false)
	private String confirmationDate;
	
	@Column(name = "confirmation_number", nullable = false)
	private String confirmationNumber;
}
