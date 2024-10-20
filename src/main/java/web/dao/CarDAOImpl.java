package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Toyota Yaris Z 4WD 1.5L", "White", 2021, 1_750_000.00));
        carList.add(new Car("Opel Corsa D 1.4L", "Black", 2007, 380_000.00));
        carList.add(new Car("KIA Bongo Frontier", "White", 2001, 380_000.00));
        carList.add(new Car("Hyundai Porter II", "White", 2008, 600_000.00));
        carList.add(new Car("VIS 2349 SpecialRefrigerator", "White", 2021,200_000_0.00));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
