package technartsHomework.customer;

import java.util.List;

import technartsHomework.car.Car;

public interface Rental {
    void rentalService(Car car);
    void getAvilableCars(List<Car> carList);
}