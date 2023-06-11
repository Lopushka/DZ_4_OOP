package Controllers;

import StudentDomen.User;
// интерфейс контроллера
public interface iUserController<T extends User> {
    void create(String firstName, String secondName, int age);

}
