package Project_2;

import Project_2.model.Cars;
import Project_2.model.Employees;
import Project_2.model.Offices;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Random;

public class Manager {
        public static void main(String[] args) {

            System.out.println("Start");

            EntityManager entityManager = null;

            EntityManagerFactory entityManagerFactory = null;

            try {

                entityManagerFactory = Persistence.createEntityManagerFactory("hibernate-dynamic");
                entityManager = entityManagerFactory.createEntityManager();
                entityManager.getTransaction().begin();
                ZoneId zoneId = ZoneId.of("UTC+1");

                Offices off1 = new Offices();
                off1.setLocation("Poznan");

                Offices off2 = new Offices();
                off2.setLocation("Torun");

                Cars car1 = new Cars();
                car1.setBrand("Skoda");
                car1.setModel("Octavia");
                car1.setFuel("LPG");
                car1.setVin("AMSO134123F2758A5");
                ZonedDateTime zonedDateTimeC1 = ZonedDateTime.of(2018, 7, 16, 0, 0, 0, 0, zoneId);
                car1.setSerwis(zonedDateTimeC1);

                Cars car2 = new Cars();
                car2.setBrand("Ford");
                car2.setModel("Mondeo");
                car2.setFuel("DIESEL");
                car2.setVin("AMFM5475214963FG7");
                ZonedDateTime zonedDateTimeC2 = ZonedDateTime.of(2018, 9, 21, 0, 0, 0, 0, zoneId);
                car2.setSerwis(zonedDateTimeC2);

                Employees emp1 = new Employees();
                emp1.setFirstName("Jan");
                emp1.setLastName("Nowak");
                emp1.setPesel(new Random().nextInt());
                emp1.setSalary(100);

                Employees emp2 = new Employees();
                emp2.setFirstName("Roman");
                emp2.setLastName("Kowalski");
                emp2.setPesel(new Random().nextInt());
                emp2.setSalary(150);

                entityManager.persist(off1);
                entityManager.persist(off2);

                off1.setOcarid(car1);
                off2.setOcarid(car2);
                emp1.getSubworkers().add(emp2);

                entityManager.persist(car1);
                entityManager.persist(car2);
                entityManager.persist(emp1);
                entityManager.persist(emp2);

                Employees employees = entityManager.find(Employees.class, emp1.getEmployeeid());
                if (employees == null) {
                    System.out.println(emp1.getEmployeeid() + " not found! ");
                } else {
                    System.out.println("Found " + employees);
                }

                System.out.println("Employee " + employees.getEmployeeid() + " " + employees.getFirstName() + employees.getLastName());

                entityManager.getTransaction().commit();

                System.out.println("Done");

                entityManager.close();

            } catch (Throwable ex) {
                System.err.println("Initial SessionFactory creation failed." + ex);
            } finally {
                entityManagerFactory.close();
            }

        }
    }
