package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Column(name = "model")
    private String model;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "series")
    private int series;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
