package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.*;
/**
 * Сервис рабочих
 */

public class EmploeeService implements iUserService<Emploee> {

    // список рабочих
    private List<Emploee> emploees;
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }
    @Override
    public List<Emploee> getAll() {
        return emploees;
    }
    @Override
    public void create(String lastName, String firstName, int age) {
        Emploee per = new Emploee(firstName, lastName, age, "basic");
        emploees.add(per);
    }

    public List<Emploee> getSortedByFIOEmploee() {
        List<Emploee> newStudEmp = new ArrayList<Emploee>(emploees);
        newStudEmp.sort(new PersonComparator<Emploee>());
        return newStudEmp;
    }
}
