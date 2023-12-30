package Homework4;

import java.util.List;

public class TeacherView<T extends Teacher> {

    // Метод для отображения всех учителей

    public void sendOnConsole(List<Teacher> items) {
        for (Teacher item : items) {
            System.out.println(
                    item.getId() + " " + item.getLastName() + " " + item.getFirstName() + " " + item.getMiddleName());
        }
    }
}
