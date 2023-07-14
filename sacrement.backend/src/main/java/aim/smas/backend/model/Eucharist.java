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
@Table(name = "eucharist")
public class Eucharist extends LifeCycle{
	
	@Column(name = "eucharist_date", nullable = false)
	private String eucharistDate;
	
	@Column(name = "eucharist_number", nullable = false)
	private String eucharistNumber;

}
