package aim.smas.backend.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;


import aim.smas.backend.model.Baptism;
import aim.smas.backend.model.Confirmation;
import aim.smas.backend.model.Eucharist;
import aim.smas.backend.model.Marriage;
import aim.smas.backend.model.Ordination;
import aim.smas.backend.model.Reconsiliation;

public interface SmasService {
	
	/*    SAVING 		*/
	Baptism saveBaptism( Baptism baptism);
	Confirmation saveConfirmation( Confirmation confirmation);
	Eucharist saveEucharist( Eucharist eucharist);
	Marriage saveMarriage(Marriage marriage);
	Ordination saveOrdination( Ordination ordination);
	Reconsiliation saveReconsiliation(Reconsiliation reconsiliation);
	
	/* GET ALL 	*/
	List<Baptism> getAllBaptisms();
	List<Confirmation> getAllConfirmations();
	List<Eucharist> getAllEucharists();
	List<Marriage> getAllMarriages();
	List<Ordination> getAllOrdinations();
	List<Reconsiliation> getAllReconsiliations();
	
	/* Delete By Id*/
	
	boolean deleteBaptism(Long id);
	boolean deleteConfirmation(Long id);
	boolean deleteEucharist(Long id);
	boolean deleteMarriage(Long id);
	boolean deleteOrdination(Long id);
	boolean deleteReconsiliation(Long id);
	
	
	
	
	/* Search USING KEYWORD */
	
	@Query("SELECT b FROM Baptism b WHERE b.firstName LIKE %?1%")
	public List<Baptism> findAll(String Keyword);
	
	

}
