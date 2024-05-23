package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 Использование @Service помогает:
  -Обозначить бизнес-логику, отделяя ее от других слоев (например, контроллеров и репозиториев).
  -Указать Spring, что этот класс является сервисным компонентом, что облегчает его автосвязывание и конфигурирование.

 Особенности @Repository:
  -Обозначает класс, как компонент доступа к данным.
  -Позволяет Spring обрабатывать исключения базы данных и переводить их в единую иерархию DataAccessExceptio
 */
@Service
public class CarServiceImpl implements CarService {

    /*
    Создал поле для списка машин и инициализировал его.
    Использовал это поле в методе getCars, и удалил метод addCars.
    Использовал Stream API для фильтрации списка машин.
     */

    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("GEELY", 12, 1));
        cars.add(new Car("HAVAL", 34, 2));
        cars.add(new Car("CHERY", 56, 3));
        cars.add(new Car("CHANGAN", 78, 4));
        cars.add(new Car("OMODA", 910, 5));
    }
    // Использую Stream API для фильтрации списка машин
    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}