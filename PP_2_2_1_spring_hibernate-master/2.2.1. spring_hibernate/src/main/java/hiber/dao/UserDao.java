package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserDao {
   void addUser(User user);
   List<User> getListUsers();
   void addCar(Car car);
   List<Car> getListCars();
   User getUserByCar(String model, int series);
}
