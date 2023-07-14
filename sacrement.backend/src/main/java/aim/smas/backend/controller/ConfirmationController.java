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

import aim.smas.backend.model.Confirmation;
import aim.smas.backend.service.SmasService;

/**
 * @author aimable
 *
 */
@RestController
@RequestMapping("/smas")
public class ConfirmationController {

	private SmasService service;

	public ConfirmationController(SmasService service) {
		super();
		this.service = service;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/confirmation")
	public ResponseEntity<Confirmation> saveConfirmation(@RequestBody Confirmation confirmation){
		return new ResponseEntity<Confirmation>(service.saveConfirmation(confirmation), HttpStatus.CREATED);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/confirmation")
	public List<Confirmation> getAllConfirmations(){
		return service.getAllConfirmations();
	}
	
	@DeleteMapping("/confirmation/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteConfirmation(@PathVariable Long id){
		boolean deleted = false;
		deleted = service.deleteConfirmation(id);		
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted Sucessfully!!", deleted);
		return ResponseEntity.ok(response);
	}	
	
	
}










