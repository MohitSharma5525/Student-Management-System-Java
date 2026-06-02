package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import database.DatabaseConnection;
import model.Student;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

        public void addStudent(Student s) {

                String sql =

                                "INSERT INTO students VALUES(?,?,?)";

                try (

                                Connection con =

                                                DatabaseConnection
                                                                .getConnection();

                                PreparedStatement ps =

                                                con.prepareStatement(sql)

                ) {

                        ps.setInt(

                                        1,
                                        s.getId());

                        ps.setString(

                                        2,
                                        s.getName());

                        ps.setDouble(

                                        3,
                                        s.getMarks());

                        ps.executeUpdate();

                        System.out.println(

                                        "Student Saved To Database!");
                }

                catch (SQLException e) {

                        System.out.println(
                                        "Database Error : "
                                                        + e.getMessage());
                }
        }

        public void viewStudents() {

                String sql =

                                "SELECT * FROM students";

                try (

                                Connection con =

                                                DatabaseConnection
                                                                .getConnection();

                                PreparedStatement ps =

                                                con.prepareStatement(sql);

                                ResultSet rs =

                                                ps.executeQuery()

                ) {

                        while (rs.next()) {

                                System.out.println(

                                                "ID : "
                                                                + rs.getInt("id"));

                                System.out.println(

                                                "Name : "
                                                                + rs.getString("name"));

                                System.out.println(

                                                "Marks : "
                                                                + rs.getDouble("marks"));

                                System.out.println(
                                                "---------------");
                        }
                }

                catch (SQLException e) {

                        System.out.println(
                                        "Database Error : "
                                                        + e.getMessage());
                }
        }

        public void searchStudent(int id) {

                String sql =

                                "SELECT * FROM students WHERE id=?";

                try (

                                Connection con =

                                                DatabaseConnection
                                                                .getConnection();

                                PreparedStatement ps =

                                                con.prepareStatement(sql)

                ) {

                        ps.setInt(
                                        1,
                                        id);

                        ResultSet rs =

                                        ps.executeQuery();

                        if (rs.next()) {

                                System.out.println(

                                                "ID : "
                                                                + rs.getInt("id"));

                                System.out.println(

                                                "Name : "
                                                                + rs.getString("name"));

                                System.out.println(

                                                "Marks : "
                                                                + rs.getDouble("marks"));
                        }

                        else {

                                System.out.println(
                                                "Student Not Found");
                        }
                }

                catch (SQLException e) {

                        System.out.println(
                                        "Database Error : "
                                                        + e.getMessage());
                }
        }

        public void deleteStudent(int id) {

                String sql =

                                "DELETE FROM students WHERE id=?";

                try (

                                Connection con =

                                                DatabaseConnection
                                                                .getConnection();

                                PreparedStatement ps =

                                                con.prepareStatement(sql)

                ) {

                        ps.setInt(
                                        1,
                                        id);

                        int rows =

                                        ps.executeUpdate();

                        if (rows > 0) {

                                System.out.println(

                                                "Student Deleted!");
                        }

                        else {

                                System.out.println(

                                                "Student Not Found");
                        }
                }

                catch (SQLException e) {

                        System.out.println(
                                        "Database Error : "
                                                        + e.getMessage());
                }
        }

        public void updateStudent(

                        int id,
                        String newName,
                        double newMarks

        ) {

                String sql =

                                "UPDATE students " +

                                                "SET name=?, marks=? " +

                                                "WHERE id=?";

                try (

                                Connection con =

                                                DatabaseConnection
                                                                .getConnection();

                                PreparedStatement ps =

                                                con.prepareStatement(sql)

                ) {

                        ps.setString(
                                        1,
                                        newName);

                        ps.setDouble(
                                        2,
                                        newMarks);

                        ps.setInt(
                                        3,
                                        id);

                        int rows =

                                        ps.executeUpdate();

                        if (rows > 0) {

                                System.out.println(

                                                "Student Updated!");
                        }

                        else {

                                System.out.println(

                                                "Student Not Found");
                        }
                }

                catch (SQLException e) {

                        System.out.println(
                                        "Database Error : "
                                                        + e.getMessage());
                }
        }

        public void sortByMarks() {

                String sql =

                                "SELECT * FROM students " +

                                                "ORDER BY marks DESC";

                try (

                                Connection con =

                                                DatabaseConnection
                                                                .getConnection();

                                PreparedStatement ps =

                                                con.prepareStatement(sql);

                                ResultSet rs =

                                                ps.executeQuery()

                ) {

                        while (rs.next()) {

                                System.out.println(
                                                "ID : " +
                                                                rs.getInt("id"));

                                System.out.println(
                                                "Name : " +
                                                                rs.getString("name"));

                                System.out.println(
                                                "Marks : " +
                                                                rs.getDouble("marks"));

                                System.out.println(
                                                "---------------");
                        }
                }

                catch (SQLException e) {

                        System.out.println(
                                        "Database Error : "
                                                        + e.getMessage());
                }
        }

        public void sortByName() {

                String sql =

                                "SELECT * FROM students " +

                                                "ORDER BY name ASC";

                try (

                                Connection con =

                                                DatabaseConnection
                                                                .getConnection();

                                PreparedStatement ps =

                                                con.prepareStatement(sql);

                                ResultSet rs =

                                                ps.executeQuery()

                ) {

                        while (rs.next()) {

                                System.out.println(
                                                "ID : " +
                                                                rs.getInt("id"));

                                System.out.println(
                                                "Name : " +
                                                                rs.getString("name"));

                                System.out.println(
                                                "Marks : " +
                                                                rs.getDouble("marks"));

                                System.out.println(
                                                "---------------");
                        }
                }

                catch (SQLException e) {

                        System.out.println(
                                        "Database Error : "
                                                        + e.getMessage());
                }
        }
}