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

    public Person3(String firstName, String lastName, double salary) {
        FirstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
            }

    @Override
    public String toString() {
        return "Person3{" +
                "Id=" + Id +
                ", FirstName='" + FirstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", adres=" + adres +
                '}';
    }
}
