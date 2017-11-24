package Project_2.model;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "CARS")
public class Cars {

    @Id
    @GeneratedValue(generator = "gen")
    @SequenceGenerator(name="gen", sequenceName = "author_seq")
    @Column(name = "Car_id")
    private int carid;

    @Column(name = "Brand", nullable = false)
    private String brand;

    @Column(name = "Model", nullable = false)
    private String model;

    @Column(name = "Fuel", nullable = false)
    private String fuel;

    @Column(name = "VIN", length = 17, nullable = false, unique = true)
    private String vin;

    @Column(name = "Serwis",  nullable = false)
    static ZonedDateTime Serwis;

    public Cars() {}

    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() { return fuel; }

    public void setFuel(String fuel) { this.fuel = fuel; }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public static void setSerwis(ZonedDateTime serwis) { Serwis = serwis; }

    public static ZonedDateTime getSerwis() { return Serwis; }
}
