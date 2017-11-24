package Project_2.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="refId", scope= Project_2.model.Employees.class)
@Entity
@Table(name = "EMPLOYEES", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"First_name","Last_name"})})
public class Employees {

    @Id
    @GeneratedValue
    @Column(name = "Employee_id")
    private int employeeid;

    @JsonProperty("Imie")
    @Column(name = "First_name")
    private String firstname;

    @JsonProperty("Nazwisko")
    @Column(name = "Last_name")
    private String lastname;

    @JsonIgnore
    @Column(name = "PESEL", nullable = false, unique = true)
    private int pesel;

    @JsonProperty("Wynagrodzenie")
    @Column(name = "salary")
    private int salary;

    @ManyToMany(mappedBy = "subworkers", cascade = CascadeType.ALL)
    private List<Employees> managers = new ArrayList<Employees>();

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Employees>  subworkers = new ArrayList<>();

    public Employees() {}

    public List<Employees> getManagers() { return managers;}

    public void setManagers(List<Employees> managers) { this.managers = managers; }

    public List<Employees> getSubworkers() { return subworkers; }

    public void setSubworkers(List<Employees> subworkers) { this.subworkers = subworkers; }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int id ) {
        this.employeeid = employeeid;
    }

    public String getFirstName() { return firstname; }

    public void setFirstName(String first_name ) {
        this.firstname = first_name;
    }

    public String getLastName() { return lastname; }

    public void setLastName(String last_name ) {
        this.lastname = last_name;
    }

    public int getPesel() { return pesel; }

    public void setPesel(int pesel ) { this.pesel = pesel; }

    public int getSalary() { return salary; }

    public void setSalary(int salary ) {
        this.salary = salary;
    }

}package Project_2.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="refId", scope= Project_2.model.Employees.class)
@Entity
@Table(name = "EMPLOYEES", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"First_name","Last_name"})})
public class Employees {

    @Id
    @GeneratedValue
    @Column(name = "Employee_id")
    private int employeeid;

    @JsonProperty("Imie")
    @Column(name = "First_name")
    private String firstname;

    @JsonProperty("Nazwisko")
    @Column(name = "Last_name")
    private String lastname;

    @JsonIgnore
    @Column(name = "PESEL", nullable = false, unique = true)
    private int pesel;

    @JsonProperty("Wynagrodzenie")
    @Column(name = "salary")
    private int salary;

    @ManyToMany(mappedBy = "subworkers", cascade = CascadeType.ALL)
    private List<Employees> managers = new ArrayList<Employees>();

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Employees>  subworkers = new ArrayList<>();

    public Employees() {}

    public List<Employees> getManagers() { return managers;}

    public void setManagers(List<Employees> managers) { this.managers = managers; }

    public List<Employees> getSubworkers() { return subworkers; }

    public void setSubworkers(List<Employees> subworkers) { this.subworkers = subworkers; }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int id ) {
        this.employeeid = employeeid;
    }

    public String getFirstName() { return firstname; }

    public void setFirstName(String first_name ) {
        this.firstname = first_name;
    }

    public String getLastName() { return lastname; }

    public void setLastName(String last_name ) {
        this.lastname = last_name;
    }

    public int getPesel() { return pesel; }

    public void setPesel(int pesel ) { this.pesel = pesel; }

    public int getSalary() { return salary; }

    public void setSalary(int salary ) {
        this.salary = salary;
    }

}
