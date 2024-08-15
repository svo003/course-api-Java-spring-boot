package segunofe.courseapidata.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //with this annotation, JPA knows to create a table called Topic and the table will have
// three text  columns named id, name, description
public class Topic {

    @Id // Saying id is the primary key for the database
    private String id;
    private String name;
    public String description;

    // nullconstructor
    public Topic() {
    }

    //constructor which takes those arguments and initializes the object
    public Topic(String id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    //getters and setters
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
