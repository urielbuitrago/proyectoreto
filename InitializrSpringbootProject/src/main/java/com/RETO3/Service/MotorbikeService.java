
package com.RETO3.Service;


import com.RETO3.Repository.MotorbikeRepository;
import com.RETO3.model.Motorbike;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotorbikeService {
    
    @Autowired
    private MotorbikeRepository motorbikeRepository;
    
    public List<Motorbike> getAll(){
        return motorbikeRepository.getAll();
    }
    
    public Optional<Motorbike> getMotorbike(int idMotorbike){
        return motorbikeRepository.getMotorbike(idMotorbike);
    }
    
    public Motorbike save(Motorbike motorbike){
        if (motorbike.getIdMotorbike()== null) {
             return motorbikeRepository.save(motorbike);
           }else{
            Optional<Motorbike>Motorbike1= motorbikeRepository.getMotorbike(motorbike.getIdMotorbike());
            if (Motorbike1.isPresent()){
                return motorbikeRepository.save(motorbike);
            }else{
                return motorbike;
            }
        }
    }
    
    public Motorbike update(Motorbike motorbike){
        if (motorbike.getIdMotorbike()!=null) {
            Optional<Motorbike>q=motorbikeRepository.getMotorbike(motorbike.getIdMotorbike());
            if (!q.isPresent()) {
                if (motorbike.getIdMotorbike()!=null){
                    q.get().setIdMotorbike(motorbike.getIdMotorbike());
                }
                if (motorbike.getBrand()!=null) {
                    q.get().setBrand(motorbike.getBrand());
                }
                if (motorbike.getYear()!=null) {
                    q.get().setYear(motorbike.getYear());
                }
                if (motorbike.getCategory()!=null) {
                    q.get().setCategory(motorbike.getCategory());
                }
                if (motorbike.getName()!=null) {
                    q.get().setName(motorbike.getName());
                }
                if (motorbike.getDescription()!=null) {
                    q.get().setDescription(motorbike.getDescription());
                }
                return motorbikeRepository.save(q.get());
                
            }
            
        }
        return motorbike;
    }
    
    
}
