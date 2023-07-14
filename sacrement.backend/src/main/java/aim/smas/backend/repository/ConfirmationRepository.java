/**
 * 
 */
package aim.smas.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import aim.smas.backend.model.Confirmation;

/**
 * @author aimable
 *
 */
public interface ConfirmationRepository extends JpaRepository<Confirmation, Long> {

}
