package Controllers;


import StudentDomen.Teacher;
import StudentService.TeacherService;

public class TeacherController implements iUserController<Teacher> {
    private final TeacherService tchServ = new TeacherService();

    @Override
    public void create(String firstName, String secondName, int age) {
        tchServ.create(firstName,secondName,age);
    }   
    
}
