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

import aim.smas.backend.model.Marriage;
import aim.smas.backend.service.SmasService;

/**
 * @author aimable
 *
 */
@RestController
@RequestMapping("/smas")
public class MarriageController {

	private SmasService service;

	public MarriageController(SmasService service) {
		super();
		this.service = service;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/marriage")
	public ResponseEntity<Marriage> saveMarriage(@RequestBody Marriage marriage){
		return new ResponseEntity<Marriage>(service.saveMarriage(marriage), HttpStatus.CREATED);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/marriage")
	public List<Marriage> getAllMarriages(){
		return service.getAllMarriages();
	}
	
	@DeleteMapping("/marriage/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteMarriage(@PathVariable Long id){
		boolean deleted = false;
		deleted = service.deleteMarriage(id);		
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted Sucessfully!!", deleted);
		return ResponseEntity.ok(response);
	}	
}






