package Controllers;

import StudentDomen.Student;
import StudentService.StudentService;

/**
 * Класс Контроллер Стедентов
 */
public class StudentController implements iUserController<Student> {
    private final StudentService dataService = new StudentService();

    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, firstName, age);
    }
}
