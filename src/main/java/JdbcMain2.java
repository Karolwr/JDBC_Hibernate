import javax.persistence.*;
import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.List;

public class JdbcMain2 {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;

    public static void main(String[] args) {
        entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        entityManager = entityManagerFactory.createEntityManager();
        //odpalimy aby dodac kilak osob
        addSomePerson();
        //podano typ oiektu ktory ma nam zwracac
        //p caly obiekt Person4 gdzie p.lastName jest Kwiatkowski
   //     TypedQuery<Person4> query = entityManager.createQuery("select p from Person4 p where p.lastName like'Kwiatkowski'", Person4.class);
        //na tym obiekcie robimy kilka metod
   //     Person4 person = query.getSingleResult();

  //      System.out.println(person);

//        TypedQuery<Person4> query = entityManager.createQuery("select p from Person4 p where p.lastName like'Smyk'", Person4.class);
//        //lista 4 0sob
//        List<Person4> persons = query.getResultList();
//        //kazdy person bedzie typu persoms
//        for (Person4 person:persons){
//            System.out.println(person);

            Query query = entityManager.createQuery("select concat(p.firstName,' ',p.lastName), p.salary * 0.2 from Person4 p where p.firstName like ?1 order by p.lastName");
            query.setParameter(1, "Piotr");
        //iteratorem ustaw sie na pierwszy wiersz i zwroc jakis obiekt
        Iterator iterator = query.getResultList().iterator();
        //item rzutujemy od index 0
        while (iterator.hasNext()) {
            Object[] item = (Object[]) iterator.next();
            String name = (String) item[0];
            Double tax = (Double) item[1];
            System.out.println(name +" ma podatek "+ tax);
        }
            //lista 4 0sob
//            List<Person4> persons = query.getResultList();
            //kazdy person bedzie typu persoms
//            for (Person4 person:persons){
//                System.out.println(person);
//        }

        entityManager.close();
        entityManagerFactory.close();
    }
    //metoda ktora dodaje kikla osb do basy
    private static void addSomePerson(){
        addPerson("Piotr", "Kwiatkowski", 4000);
        addPerson("Kasia", "Smyk", 4000);
        addPerson("Roma", "Smyk", 4500);
        addPerson("Filip", "Guzik", 6000);
        addPerson("Kuba", "Poniatowski", 5000);
    }


        //metoda na dodawanie osoby do bazy danej
    private static void addPerson(String firstName, String lasrName, double salary){
        Person4 person=new Person4(firstName,lasrName,salary);
        //otweramy tarnsakcje zapisujemy i zamykamy
        entityManager.getTransaction().begin();
        entityManager.persist(person);
        entityManager.getTransaction().commit();
    }
}
