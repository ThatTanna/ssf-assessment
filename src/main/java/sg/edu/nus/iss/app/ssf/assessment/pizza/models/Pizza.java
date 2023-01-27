package sg.edu.nus.iss.app.ssf.assessment.pizza.models;

import java.io.Serializable;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class Pizza implements Serializable {

    @NotNull(message = "Pizza cannot be null")
    private String type;

    @NotNull(message = "Size cannot be null")
    private String size;

    @NotNull
    @Min(value = 1, message="Must order at least 1.")
    @Max(value = 10, message="Must order below 10.")
    private int noOfPizza;

    public Pizza() {
    }

    public Pizza(String type, String size, int noOfPizza) {
        this.type = type;
        this.size = size;
        this.noOfPizza = noOfPizza;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNoOfPizza() {
        return noOfPizza;
    }

    public void setNoOfPizza(int noOfPizza) {
        this.noOfPizza = noOfPizza;
    }

    @Override
    public String toString() {
        return "Pizza [type=" + type + ", size=" + size + ", noOfPizza=" + noOfPizza + "]";
    }

}
