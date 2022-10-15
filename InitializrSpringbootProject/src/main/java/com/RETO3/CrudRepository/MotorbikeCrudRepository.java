
package com.RETO3.CrudRepository;

import com.RETO3.model.Motorbike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorbikeCrudRepository extends CrudRepository<Motorbike, Integer>{
    
}
