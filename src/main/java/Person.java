import javax.persistence.*;

//@Entity
//@Table(name = "Osoba")
//@SecondaryTable(name = "Adres", pkJoinColumns = @PrimaryKeyJoinColumn(name = "osobaId"))
public class Person {
    @Id
    @GeneratedValue
    public Long Id;
    private String FirstName;
    private String lastName;
    private double salary;

    @Column(table = "Adres")
    private String locality;
    @Column(table = "Adres")
    private String street;
    @Column(table = "Adres")
    private String zipCode;

}