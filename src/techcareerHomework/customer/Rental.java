package techcareerHomework.customer;

import java.util.List;

import techcareerHomework.car.Car;

public interface Rental {
    void rentalService(Car car);
    void getAvilableCars(List<Car> carList);
}