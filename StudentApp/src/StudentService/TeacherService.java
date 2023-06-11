package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.PersonComparator;
import StudentDomen.Teacher;
/**
 * Сервис Уч
 */

public class TeacherService implements iUserService<Teacher> {
    private int cnt;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String lastName, String firstName, int age) {
        Teacher ter = new Teacher(firstName, lastName, age, cnt++, "");
        teachers.add(ter);
    }

    /**
     * сортировка Студ по ФИ
     * 
     * @return newStudList возвращение отсортированного списка
     */
    public List<Teacher> getSortedByFIOTeacher() {
        List<Teacher> newStudList = new ArrayList<Teacher>(teachers);
        newStudList.sort(new PersonComparator<Teacher>());
        return newStudList;
    }

}
