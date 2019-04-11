import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue
    public Long Id;
    private String FirstName;
    private String lastName;
    private double salary;
}