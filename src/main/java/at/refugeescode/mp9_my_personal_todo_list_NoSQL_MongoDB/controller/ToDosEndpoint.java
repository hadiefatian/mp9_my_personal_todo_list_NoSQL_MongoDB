package at.refugeescode.mp9_my_personal_todo_list_NoSQL_MongoDB.controller;

import at.refugeescode.mp9_my_personal_todo_list_NoSQL_MongoDB.persistance.model.ToDo;
import at.refugeescode.mp9_my_personal_todo_list_NoSQL_MongoDB.persistance.repository.ToDoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
public class ToDosEndpoint {

    private ToDoRepository toDoRepository;

    public ToDosEndpoint(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @GetMapping
    List<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    @GetMapping("/{id}")
    ToDo search(@PathVariable String id) {
        return toDoRepository.findById(id)
                .orElse(null);
    }

    @GetMapping("/{id}/done")
    ToDo done(@PathVariable String id) {
        Optional<ToDo> result = toDoRepository.findById(id);

        if (result.isPresent()) {
            ToDo isDone = result.get();
            isDone.setCheck(true);
            return toDoRepository.save(isDone);
        }
        return null;
    }

    @PostMapping
    ToDo save(@RequestBody ToDo todo) {
        return toDoRepository.save(todo);
    }
}
