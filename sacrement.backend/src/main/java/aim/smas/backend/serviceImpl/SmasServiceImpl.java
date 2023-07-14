package aim.smas.backend.serviceImpl;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import aim.smas.backend.model.Baptism;
import aim.smas.backend.model.Confirmation;
import aim.smas.backend.model.Eucharist;
import aim.smas.backend.model.Marriage;
import aim.smas.backend.model.Ordination;
import aim.smas.backend.model.Reconsiliation;
import aim.smas.backend.repository.BaptismRepository;
import aim.smas.backend.repository.ConfirmationRepository;
import aim.smas.backend.repository.EucharistRepository;
import aim.smas.backend.repository.MarriageRepository;
import aim.smas.backend.repository.OrdinationRepository;
import aim.smas.backend.repository.ReconsiliationRepository;
import aim.smas.backend.service.SmasService;


@Service
public class SmasServiceImpl implements SmasService{ 
	
	private BaptismRepository baptismRepository;
	private ConfirmationRepository confirmationRepository;
	private EucharistRepository eucharistRepository;
	private MarriageRepository marriageRepository;
	private OrdinationRepository ordinationRepository;
	private ReconsiliationRepository reconsiliationRepository;

		
	public SmasServiceImpl(BaptismRepository baptismRepository, ConfirmationRepository confirmationRepository,
			EucharistRepository eucharistRepository, MarriageRepository marriageRepository,
			OrdinationRepository ordinationRepository, ReconsiliationRepository reconsiliationRepository) {
		super();
		this.baptismRepository = baptismRepository;
		this.confirmationRepository = confirmationRepository;
		this.eucharistRepository = eucharistRepository;
		this.marriageRepository = marriageRepository;
		this.ordinationRepository = ordinationRepository;
		this.reconsiliationRepository = reconsiliationRepository;

	}
	




	@Override
	public Baptism saveBaptism(Baptism baptism) {
		return baptismRepository.save(baptism);
	}

	@Override
	public Confirmation saveConfirmation(Confirmation confirmation) {
		return confirmationRepository.save(confirmation);
	}

	@Override
	public Eucharist saveEucharist(Eucharist eucharist) {
		return eucharistRepository.save(eucharist);
	}

	@Override
	public Marriage saveMarriage(Marriage marriage) {
		return marriageRepository.save(marriage);
	}

	@Override
	public Ordination saveOrdination(Ordination ordination) {
		return ordinationRepository.save(ordination);
	}

	@Override
	public Reconsiliation saveReconsiliation(Reconsiliation reconsiliation) {
		return reconsiliationRepository.save(reconsiliation);
	}

	@Override
	public List<Baptism> getAllBaptisms() {
		return baptismRepository.findAll();
	}

	@Override
	public List<Confirmation> getAllConfirmations() {
		return confirmationRepository.findAll();
	}

	@Override
	public List<Eucharist> getAllEucharists() {
		return eucharistRepository.findAll();
	}

	@Override
	public List<Marriage> getAllMarriages() {
		return marriageRepository.findAll();
	}

	@Override
	public List<Ordination> getAllOrdinations() {
		return ordinationRepository.findAll();
	}

	@Override
	public List<Reconsiliation> getAllReconsiliations() {
		return reconsiliationRepository.findAll();
	}

	@Override
	public List<Baptism> findAll(String Keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBaptism(Long id) {
		Baptism baptism = baptismRepository.findById(id).get();
		baptismRepository.delete(baptism);
		return true;
	}





	@Override
	public boolean deleteConfirmation(Long id) {
		Confirmation confirmation = confirmationRepository.findById(id).get();
		confirmationRepository.delete(confirmation);
		return true;
	}





	@Override
	public boolean deleteEucharist(Long id) {
		Eucharist eucharist = eucharistRepository.findById(id).get();
		eucharistRepository.delete(eucharist);
		return true;
	}





	@Override
	public boolean deleteMarriage(Long id) {
		Marriage marriage = marriageRepository.findById(id).get();
		marriageRepository.delete(marriage);
		return true;
	}





	@Override
	public boolean deleteOrdination(Long id) {
		Ordination ordination = ordinationRepository.findById(id).get();
		ordinationRepository.delete(ordination);
		return true;
	}





	@Override
	public boolean deleteReconsiliation(Long id) {
		Reconsiliation reconsiliation = reconsiliationRepository.findById(id).get();
		reconsiliationRepository.delete(reconsiliation);
		return true;
	}






}
