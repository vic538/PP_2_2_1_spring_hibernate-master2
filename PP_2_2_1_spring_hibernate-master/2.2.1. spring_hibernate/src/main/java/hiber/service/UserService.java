package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getListUsers();
    void addCar(Car car);
    List<Car> getListCars();
    User getUserByCar(String model, int series);

}
