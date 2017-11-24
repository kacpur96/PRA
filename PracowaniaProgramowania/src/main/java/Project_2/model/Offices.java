package Project_2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "OFFICES")
public class Offices {

    @Id
    @GeneratedValue(generator = "gen")
    @SequenceGenerator(name="gen", sequenceName = "author_seq")
    @Column(name = "Office_id")
    private int officeid;

    @Column(name = "Location", nullable = false)
    private String location;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Car_ID", referencedColumnName = "Car_id")
    private Cars ocarid;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Employee_ID", referencedColumnName = "Employee_id")
    private Employees oemployeeid;

    public Offices() {}

    public int getOfficeid() {
        return officeid;
    }

    public void setOfficeid(int officeid) { this.officeid = officeid; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public Cars getOcarid() {
        return ocarid;
    }

    public void setOcarid(Cars ocarid) { this.ocarid = ocarid; }

    public Employees getOemployeeid() { return oemployeeid; }

    public void setOemployeeid(Employees oemployeeid) {this.oemployeeid = oemployeeid; }

}
