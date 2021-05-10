package web.Model;

import java.io.DataInputStream;

public class Car {
    private String model;
    private int age;
    private String color;

    public Car(String model, int age, String color) {
        this.model = model;
        this.age = age;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
