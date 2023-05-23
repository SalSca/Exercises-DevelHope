package co.SalSca.SpringProject.entities;

import org.springframework.lang.NonNull;

public class CarDTO {

    private int id;
    private String modelName;

    private double price;

    public CarDTO() {

    }

    public CarDTO(int id, String modelName, double price) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", price=" + price +
                '}';
    }
}
