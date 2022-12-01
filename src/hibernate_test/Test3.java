package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            List<Employee> e = session.createQuery("from Employee")
                            .getResultList();
            for (Employee em:e) {
                System.out.println(em);
                
            }
            session.getTransaction().commit();

            System.out.println("Done");
        }
        finally {
            factory.close();
        }


    }
}
