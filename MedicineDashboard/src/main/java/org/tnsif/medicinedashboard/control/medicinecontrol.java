package org.tnsif.medicinedashboard.control;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.medicinedashboard.entities.medicine;
import org.tnsif.medicinedashboard.services.medicineservice;
@CrossOrigin(allowedHeaders="*",origins="*")

@RestController
public class medicinecontrol {
	
	@Autowired
	private medicineservice service;
	@PostMapping ("/registermedicine")
	public medicine createmedicine(@RequestBody medicine medicine)
	{
		return service.registeremedicine(medicine);
	}
	@PutMapping ("/updatemedicine")
	public medicine updatemedicine(@RequestBody medicine medicine)
	{
		return service.updatemedicine(medicine);
		}
	@GetMapping("/retrievemedicine")
	public List <medicine>getmedicine()
	{
		return service.getmedicine();
	}
	@DeleteMapping ("/deletemedicine/{id}")
	public void deletemedicine(@PathVariable Integer id)
	{
		service.deletemedicine(id);
	}

}
