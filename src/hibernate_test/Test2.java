package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Oleg", "Sidorov", "HR", 700);
            session.beginTransaction();
            session.save(emp);
//            session.getTransaction().commit();

            int MyId = emp.getId();

            System.out.println("Done!");
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employee = session.get(Employee.class,MyId);
            session.getTransaction().commit();
            System.out.println(employee);
        }
        finally {
            factory.close();
        }
    }
}
