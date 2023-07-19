package org.tnsif.medicinedashboard.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.tnsif.medicinedashboard.entities.medicine;

@Repository
public interface medicinerepository extends CrudRepository<medicine,Integer>{

}
