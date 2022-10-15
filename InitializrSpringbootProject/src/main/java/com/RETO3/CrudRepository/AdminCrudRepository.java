
package com.RETO3.CrudRepository;

import com.RETO3.model.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminCrudRepository extends CrudRepository<Admin, Integer>{
    
}
    

