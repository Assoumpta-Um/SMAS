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

import aim.smas.backend.model.Reconsiliation;
import aim.smas.backend.service.SmasService;

/**
 * @author aimable
 *
 */
@RestController
@RequestMapping("/smas")
public class ReconsiliationController {
	
	private SmasService service;

	/**
	 * @param service
	 */
	public ReconsiliationController(SmasService service) {
		super();
		this.service = service;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/reconsiliation")
	public ResponseEntity<Reconsiliation> saveReconsiliation(@RequestBody Reconsiliation reconsiliation){
		return new ResponseEntity<Reconsiliation>(service.saveReconsiliation(reconsiliation), HttpStatus.CREATED);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/reconsiliation")
	public List<Reconsiliation> getAllReconsiliations(){
		return service.getAllReconsiliations();
	}
	
	@DeleteMapping("/reconsiliation/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteReconsiliation(@PathVariable Long id){
		boolean deleted = false;
		deleted = service.deleteReconsiliation(id);		
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted Sucessfully!!", deleted);
		return ResponseEntity.ok(response);
	}	

}
