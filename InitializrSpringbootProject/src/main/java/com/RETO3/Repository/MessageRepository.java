
package com.RETO3.Repository;


import com.RETO3.CrudRepository.MessageCrudRepository;
import com.RETO3.model.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {
    
    
     @Autowired
   private MessageCrudRepository messageCrudRepository;
 
   public List<Message> getAll(){
       return (List<Message>)messageCrudRepository.findAll();
   }
 
   public Optional<Message> getMessage(int idMessage){
       return messageCrudRepository.findById(idMessage);
   }
    
   public Message save(Message message){
       return messageCrudRepository.save(message);
   }
   
   public void delete(Message message){
       messageCrudRepository.delete(message);
   }
}
