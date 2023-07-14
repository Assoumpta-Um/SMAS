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

import aim.smas.backend.model.Ordination;
import aim.smas.backend.service.SmasService;

/**
 * @author aimable
 *
 */
@RestController
@RequestMapping("/smas")
public class OrdinationController {
	
	private SmasService service;

	public OrdinationController(SmasService service) {
		super();
		this.service = service;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/ordination")
	public ResponseEntity<Ordination> saveOrdination(@RequestBody Ordination ordination){
		return new ResponseEntity<Ordination>(service.saveOrdination(ordination), HttpStatus.CREATED);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/ordination")
	public List<Ordination> getAllOrdinations(){
		return service.getAllOrdinations();
	}
	
	@DeleteMapping("/ordination/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteOrdination(@PathVariable Long id){
		boolean deleted = false;
		deleted = service.deleteOrdination(id);		
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted Sucessfully!!", deleted);
		return ResponseEntity.ok(response);
	}	

}
