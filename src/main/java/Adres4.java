import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Adres4 {
    @Id
    @GeneratedValue
    private Long Id;
    private String locality;
    private String street;
    private String zipCode;
}
