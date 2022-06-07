//package jm.task.core.jdbc.dao;
//
//import jm.task.core.jdbc.model.User;
//import jm.task.core.jdbc.util.Util;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class UserDaoJDBCImpl implements UserDao {
//
//
//    public UserDaoJDBCImpl() throws SQLException {
//
//    }
//
//    public void createUsersTable() {
//        System.out.println("Создаю таблицу пользователей");
//        try {
//            Statement statement = connection.createStatement();
//            statement.execute("CREATE TABLE IF NOT EXISTS users" +
//                    "(id BIGINT(19) NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
//                    "name VARCHAR(255) NOT NULL, lastname VARCHAR(255) NOT NULL, " +
//                    "age TINYINT UNSIGNED NOT NULL)");
//            System.out.println("Таблица создана");
//        } catch (SQLException e) {
//            System.out.println("Не удалось создать таблицу: " + e);
//        }
//
//    }
//
//    public void dropUsersTable() {
//        try {
//            String SQL = "DROP TABLE IF EXISTS users";
//            PreparedStatement statement = connection.prepareStatement(SQL);
//            statement.executeUpdate();
//            System.out.println("Таблица удалена");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
//    public void saveUser(String name, String lastName, byte age) {
//        try {
//            String SQL = "INSERT INTO users(name, lastname, age) VALUES (?, ?, ?)";
//            PreparedStatement statement = connection.prepareStatement(SQL);
//            statement.setString(1, name);
//            statement.setString(2, lastName);
//            statement.setByte(3, age);
//            statement.executeUpdate();
//            System.out.println("Пользователь сохранен");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public void removeUserById(long id) {
//        try {
//            String SQL = "DELETE FROM users WHERE id = (?)";
//            PreparedStatement statement = connection.prepareStatement(SQL);
//            statement.setLong(1, id);
//            statement.executeUpdate();
//            System.out.println("Пользователь удален");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public List<User> getAllUsers() {
//        List<User> userList = new ArrayList<>();
//        String SQL = "SELECT id, name, lastName, age FROM users";
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(SQL);
//
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("id"));
//                user.setName(resultSet.getString("name"));
//                user.setName(resultSet.getString("lastName"));
//                user.setAge(resultSet.getByte("AGE"));
//                userList.add(user);
//                System.out.println("Пользователь добавлен в лист пользователей");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return userList;
//    }
//
//    public void cleanUsersTable() {
//        String SQL = "TRUNCATE TABLE users";
//        try {
//            PreparedStatement statement = connection.prepareStatement(SQL);
//            statement.executeUpdate();
//            System.out.println("Таблица очищена");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
