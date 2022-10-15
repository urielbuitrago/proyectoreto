
package com.RETO3.CrudRepository;

import com.RETO3.model.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer>{
    
}
