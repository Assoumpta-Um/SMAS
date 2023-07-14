/**
 * 
 */
package aim.smas.backend.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import aim.smas.backend.model.Eucharist;
import aim.smas.backend.service.SmasService;

/**
 * @author aimable
 *
 */
@RestController
@RequestMapping("/smas")
public class EucharistController {
	
	private SmasService service;

	public EucharistController(SmasService service) {
		super();
		this.service = service;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/eucharist")
	public ResponseEntity<Eucharist> saveEucharist(@RequestBody Eucharist eucharist){
		return new ResponseEntity<Eucharist>(service.saveEucharist(eucharist), HttpStatus.CREATED);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/eucharist")
	public List<Eucharist> getAEucharists(){
		return service.getAllEucharists();
	}
	
	@DeleteMapping("/eucharist/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEucharist(@PathVariable Long id){
		boolean deleted = false;
		deleted = service.deleteEucharist(id);		
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted Sucessfully!!", deleted);
		return ResponseEntity.ok(response);
	}	
	

}









