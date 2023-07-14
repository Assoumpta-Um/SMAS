/**
 * 
 */
package aim.smas.backend.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aim.smas.backend.exception.ResourceNotFoundException;
import aim.smas.backend.model.Baptism;
import aim.smas.backend.model.LifeCycle;
import aim.smas.backend.repository.BaptismRepository;
import aim.smas.backend.service.SmasService;

/**
 * @author aimable
 *
 */
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/smas")
public class BaptismController {
	
	@Autowired
	private BaptismRepository baptismRepository;

	private SmasService service;

	public BaptismController(SmasService service) {
		super();
		this.service = service;
	}
	

	//POST BAPTISM 
	
	@PostMapping("/baptism")
	public ResponseEntity<Baptism> saveBaptism(@RequestBody Baptism baptism){
		return new ResponseEntity<Baptism>(service.saveBaptism(baptism), HttpStatus.CREATED);
	}
	
	//GET BAPTISM	
	@GetMapping("/baptism")
	public List<Baptism> getAllBaptisms(){
		return service.getAllBaptisms();
	}
	
	//POST BAPTISM BY ID	
	@GetMapping("/baptism/{id}")
	public ResponseEntity<Baptism> getBaptismById(@PathVariable Long id) {
		Baptism baptism = baptismRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Baptism Not found With Id" + id));
		return ResponseEntity.ok(baptism);
	}
	
	//uPDATE BAPTISM 
//	@PutMapping("/baptism/{id}")
//	public ResponseEntity<Baptism> updateBaptism(@PathVariable Long id, @RequestBody Baptism baptismDetails, LifeCycle lifeCycle){
//		Baptism baptism = baptismRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Baptism Not found With Id" + id));
//		
//		baptism.setFirstName(lifeCycle.getFirstName());
//		baptism.setLastName(lifeCycle.getLastName());
//		baptism.setFatherName(lifeCycle.getFatherName());
//		baptism.setMotherName(lifeCycle.getMotherName());
//		baptism.setPatronMatron(lifeCycle.getPatronMatron());
//		baptism.setPlaceOfSummons(lifeCycle.getPlaceOfSummons());
//		baptism.setDistrict(lifeCycle.getDistrict());
//		baptism.setSector(lifeCycle.getSector());
//		baptism.setBaptismDate(baptismDetails.getBaptismDate());
//		baptism.setProvince(lifeCycle.getProvince());
//		baptism.setBaptismNumber(baptismDetails.getBaptismNumber());
//		
//		Baptism updatedBaptism = baptismRepository.save(baptism);
//		return ResponseEntity.ok(baptism);
//	}
//	
	@DeleteMapping("/baptism/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteBaptism(@PathVariable Long id){
		boolean deleted = false;
		deleted = service.deleteBaptism(id);		
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted Sucessfully!!", deleted);
		return ResponseEntity.ok(response);
	}	
		
	}
	

	






