import javax.persistence.*;

@Entity
public class Person2 {
    @Id
    @GeneratedValue
    public Long Id;
    private String FirstName;
    private String lastName;
    private double salary;
    //ponizej jest oiekt ktory bedzie tu dolaczony z innej klasy
    @Embedded
    private Adres2 adres;

}
