package at.refugeescode.mp9_my_personal_todo_list_NoSQL_MongoDB.initialize;

import at.refugeescode.mp9_my_personal_todo_list_NoSQL_MongoDB.persistance.model.ToDo;
import at.refugeescode.mp9_my_personal_todo_list_NoSQL_MongoDB.persistance.repository.ToDoRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToDoInitializer {

    @Bean
    ApplicationRunner initializeToDos(ToDoRepository toDoRepository) {
        return args -> {
            toDoRepository.deleteAll();
            toDoRepository.save(new ToDo("Coding", false));
        };
    }
}

