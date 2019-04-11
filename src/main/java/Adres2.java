import javax.persistence.Embeddable;
import javax.persistence.Embedded;

//taki ktory mozna osadzic
//moze byc osadzana wlaczana do innychj klas
@Embeddable
public class Adres2 {
    private String locality;
    private String street;
    private String zipCode;
    //ponizej jest oiekt ktory bedzie tu dolaczony z innej klasy
    @Embedded
    private Adres3 addNr;
}
