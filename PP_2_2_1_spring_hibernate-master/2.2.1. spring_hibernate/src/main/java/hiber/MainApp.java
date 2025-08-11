package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      userService.addUser(new User("User1", "Lastname1", "user1@mail.ru", new Car("BMW")));
      userService.addUser(new User("User2", "Lastname2", "user2@mail.ru", new Car("MB")));
      userService.addUser(new User("User3", "Lastname3", "user3@mail.ru", new Car("Audi")));
      userService.addUser(new User("User4", "Lastname4", "user4@mail.ru", new Car("Honda")));



      List<User> users = userService.getListUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println("Series car = "+user.getCar().getSeries());
         System.out.println("Model car = "+user.getCar().getModel());
         System.out.println();
      }

      User user = userService.getUserByCar("BMW", 1);
      if (user == null) {
         System.out.println("User not found");
      } else {
         System.out.println(user.toString());
      }

      context.close();
   }
}
