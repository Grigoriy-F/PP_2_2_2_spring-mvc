package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(List<Car> cars, int count) {
        if (count >= 6) {
            return cars;
        }

        List<Car> res = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            res.add(cars.get(i));
        }
        return res;
    }


    @Override
    public List<Car> addCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("GEELY", 12, 1));
        cars.add(new Car("HAVAL", 34, 2));
        cars.add(new Car("CHERY", 56, 3));
        cars.add(new Car("CHANGAN", 78, 4));
        cars.add(new Car("OMODA", 910, 5));
        return cars;
    }
}
