package at.refugeescode.mp9_my_personal_todo_list_NoSQL_MongoDB.persistance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ToDo {

    @Id
    private String id;

    private String name;

    private Boolean check;



    public ToDo(String name, Boolean check) {
        this.name = name;
        this.check = check;
    }

    public ToDo() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", check=" + check +
                '}';
    }
}
