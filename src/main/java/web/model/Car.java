package web.model;

public class Car {
    private String model;
    private int serial;
    private int id;

    public Car() {
    }

    public Car(String model, int serial, int id) {
        this.model = model;
        this.serial = serial;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelCar='" + model + '\'' +
                ", serialCar='" + serial + '\'' +
                ", idCar=" + id +
                '}';
    }
}
