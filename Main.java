package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 25);
        userService.saveUser("Petr", "Petrov", (byte) 30);
        userService.saveUser("Sergey", "Sergeev", (byte) 35);
        userService.saveUser("Andrey", "Andreev", (byte) 40);

        List<User> userList = userService.getAllUsers();
        System.out.println(userList);

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
