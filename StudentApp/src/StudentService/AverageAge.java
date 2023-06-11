package StudentService;

import java.util.List;

import StudentDomen.User;

/**
 * 
 * обобщенный класс AverageAge для подсчета среднего возраста
 */
public class AverageAge<T extends User> {
    public static <T extends User> void getAverageAge(List<T> list) {

        double s = 0.0;
        for (T user : list) {
            s = s + user.getAge();
        }
        s = s / list.size();
        System.out.println("Средний возраст = " + s);

    }

}
