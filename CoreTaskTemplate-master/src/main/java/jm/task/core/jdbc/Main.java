package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql. SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();
        userService.dropUsersTable();
        userService.createUsersTable();
        userService.saveUser("Петушок", "Петушанский", (byte) 22);
        userService.saveUser("Петушок", "Настоящий", (byte) 27);
        userService.saveUser("Петушок", "Настоящий", (byte) 27);
        System.out.println("Получаю всех пользователей");
        userService.getAllUsers();
   //      userService.removeUserById(3L);
//        userService.cleanUsersTable();
//        userService.removeUserById(1);
    }

}
