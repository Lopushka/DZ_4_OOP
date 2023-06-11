package StudentService;

import java.util.List;

/**
 * Интерфейс сервиса пользователей
 */
public interface iUserService<T> {

    List<T> getAll();

    void create(String lastName, String firstName, int age);
}