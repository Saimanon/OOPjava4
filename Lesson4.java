package less4;

import less4.controller.StudentController;
import less4.controller.TeacherController;
import less4.model.Student;
import less4.model.Teatcher;

import java.util.List;

public class Lesson4 {

    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.sendOnConsole(List.of(
                new Student(1, "Sasha", "Ivanov"),
                new Student(2, "Ira", "Ivanova")
        ));

        TeacherController teacherController = new TeacherController();
        teacherController.sendOnConsole(List.of(
                new Teatcher(1, "John", "Doe"),
                new Teatcher(2, "Jane", "Smith")
        ));
    }
}
