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

    public Adres4(String locality, String street, String zipCode) {
        this.locality = locality;
        this.street = street;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Adres4{" +
                "Id=" + Id +
                ", locality='" + locality + '\'' +
                ", street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
