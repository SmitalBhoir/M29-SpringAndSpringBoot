package org.tnsif.medicinedashboard.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.medicinedashboard.entities.medicine;
import org.tnsif.medicinedashboard.repository.medicinerepository;

import jakarta.transaction.Transactional;

@Service
@Transactional 
public class medicineservice {
	
	@Autowired
	private medicinerepository repo;
	
	public medicine registeremedicine(medicine medicine)
	{
		return repo.save(medicine);
	}
	
	public List<medicine>getmedicine()
	{
		return (List<medicine>) repo.findAll();
}
	
	public void deletemedicine(Integer id)
	{
		repo.deleteById(id);
	}
	
	public medicine updatemedicine(medicine medicine)
	{
		Integer id=medicine.getId();
		medicine m=repo.findById(id).get();
		m.setMedicinename(medicine.getMedicinename());
		m.setPrice(medicine.getPrice());
	return repo.save(m);
	}

}

