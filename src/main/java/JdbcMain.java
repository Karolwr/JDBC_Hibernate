import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JdbcMain {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Person3 person = new Person3("Jan", "Kowalski", 3500);
        Adres4 adres = new Adres4("Bydgoszcz", "Kawiatowa", "85-200");

        entityManager.getTransaction().begin();
        entityManager.persist(adres);
        entityManager.persist(person);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
