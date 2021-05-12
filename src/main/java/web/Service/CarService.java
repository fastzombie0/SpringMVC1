package web.Service;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public List<Car> getCarList(Integer count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", 1, "black"));
        carList.add(new Car("Audi", 2, "white"));
        carList.add(new Car("Shkoda", 3, "yellow"));
        carList.add(new Car("Mers", 4, "green"));
        carList.add(new Car("Bugatti", 5, "blue"));
        if(count == null) {
            return carList.subList(0, carList.size());
        }
        if (count > 5) {
            return carList.subList(0, carList.size());
        }
        return carList.subList(0, count);
    }
}
