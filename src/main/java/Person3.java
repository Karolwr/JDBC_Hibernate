import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person3 {
    @Id
    @GeneratedValue
    public Long Id;
    private String FirstName;
    private String lastName;
    private double salary;
    @OneToOne
    private Adres4 adres;
}
