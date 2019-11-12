package service;



import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.models.Cargo;
import com.wipro.repositories.CargoRepository;
 

 
@Service
public class CargoService {
 
    @Autowired
    CargoRepository sampleRepo;
 
        public List<Cargo> getAll() {
        return sampleRepo.getAll();
    }
}