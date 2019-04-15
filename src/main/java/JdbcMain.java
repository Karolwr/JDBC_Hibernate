import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JdbcMain {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //   Person3 person = new Person3("Jan", "Kowalski", 3500);
        Person4 person = new Person4("Jan", "Kowalski", 3500);
        Person4 person2 = new Person4("Piotr", "Nowak", 2000);
        //  Adres4 adres = new Adres4("Bydgoszcz", "Kawiatowa", "85-200");

        entityManager.getTransaction().begin();
        //  entityManager.persist(adres);
        entityManager.persist(person);
        entityManager.persist(person2);
        entityManager.getTransaction().commit();

        System.out.println(person);

        person.setSalary(4000);

        entityManager.getTransaction().begin();
        entityManager.persist(person);
        entityManager.getTransaction().commit();

        System.out.println(person);

        entityManager.getTransaction().begin();
        Person4 person4 = entityManager.find(Person4.class, 2L);
        entityManager.remove(person4);
        entityManager.getTransaction().commit();

        System.out.println(person4);


        entityManager.close();
        entityManagerFactory.close();
    }
}
