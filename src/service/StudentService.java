package service;

import dao.StudentDAO;
import model.Student;

public class StudentService {

    private StudentDAO dao =
            new StudentDAO();

    // ADD

    public void addStudent(Student s){

        // ID Validation

        if(s.getId()<=0){

            System.out.println(
                    "Invalid ID!"
            );

            return;
        }

        // Name Validation

        if(s.getName().isBlank()){

            System.out.println(
                    "Name Cannot Be Empty!"
            );

            return;
        }

        // Marks Validation

        if(
            s.getMarks()<0
            ||
            s.getMarks()>100
        ){

            System.out.println(
                    "Marks Must Be 0-100!"
            );

            return;
        }

        dao.addStudent(s);

        System.out.println(
                "Student Added Successfully!"
        );
    }

    // VIEW

    public void viewStudents(){

        dao.viewStudents();
    }

    // SEARCH

    public void searchStudent(int id){

        dao.searchStudent(id);
    }

    // DELETE

    public void deleteStudent(int id){

        dao.deleteStudent(id);
    }

    // UPDATE

    public void updateStudent(

            int id,
            String newName,
            double newMarks

    ){

        dao.updateStudent(

                id,
                newName,
                newMarks
        );
    }
    public void sortByMarks(){

    dao.sortByMarks();
}

public void sortByName(){

    dao.sortByName();
}
}