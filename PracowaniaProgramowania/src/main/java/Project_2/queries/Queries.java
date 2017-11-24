package Project_2.queries;

import Project_2.model.Cars;
import Project_2.model.Employees;
import Project_2.model.Offices;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class Queries {

    EntityManager entityManager;

    public Queries(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Employees> getEmployeeByFirstName(String fname) {
        TypedQuery<Employees> query = entityManager.createQuery(
                "SELECT c FROM Employees c WHERE c.firstname LIKE :firstname", Employees.class);
        return query.setParameter("firstname", fname).getResultList();
    }
    public List<Employees> getEmployeeByLastName(String lname) {
        TypedQuery<Employees> query = entityManager.createQuery(
                "SELECT c FROM Employees c WHERE c.lastname LIKE :lastname", Employees.class);
        return query.setParameter("lastname", lname).getResultList();
    }
    public List<Cars> getCarModel(String model) {
        TypedQuery<Cars> query = entityManager.createQuery(
                "SELECT c FROM Cars c WHERE c.model LIKE :model", Cars.class);
        return query.setParameter("model", model).getResultList();
    }
    public List<Cars> getCarFuel(String fuel) {
        TypedQuery<Cars> query = entityManager.createQuery(
                "SELECT c FROM Cars c WHERE c.fuel LIKE :fuel", Cars.class);
        return query.setParameter("fuel", fuel).getResultList();
    }
    public List<Offices> getOfficeLocalization(String location) {
        TypedQuery<Offices> query = entityManager.createQuery(
                "SELECT c FROM Offices c WHERE c.location LIKE :location", Offices.class);
        return query.setParameter("location", location).getResultList();
    }

    //public List<Employees> getAllEmployeeByPage(int pagenr) {
        //calculate total number
     //   Query queryTotal = entityManager.createQuery
     //           ("Select count(f) from Employees f");
     //   long countResult = (long)queryTotal.getSingleResult();

        //create query
     //   Query query = entityManager.createQuery("Select e FROM Employees e");
        //set pageSize
     //   int pageSize = 10;
        //calculate number of pages
     //   int pageNumber = (int) ((countResult / pageSize) + 1);

     //   if (pagenr > pageNumber) pagenr = pageNumber;
     //   query.setFirstResult((pagenr-1) * pageSize);
    //    query.setMaxResults(pageSize);

    //    return query.getResultList();}
}
