package at.refugeescode.mp9_my_personal_todo_list_NoSQL_MongoDB.persistance.repository;

import at.refugeescode.mp9_my_personal_todo_list_NoSQL_MongoDB.persistance.model.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ToDoRepository extends MongoRepository<ToDo, String> {

    List<ToDo> findByName(String name);

}
