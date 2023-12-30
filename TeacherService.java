package Homework4;

import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class TeacherService<T extends Teacher> implements Comparator<Teacher> {

    // Метод для сортировки списка учителей

    @Override
    public int compare(Teacher teacher1, Teacher teacher2) {
        if (teacher1.getLastName().equals(teacher2.getLastName())) {
            if (teacher1.getFirstName().equals(teacher2.getFirstName())) {
                return teacher1.getMiddleName().compareTo(teacher2.getMiddleName());
            }
            return teacher1.getFirstName().compareTo(teacher2.getFirstName());
        }
        return teacher1.getLastName().compareTo(teacher2.getLastName());
    }

    public void sortTeachers(List<Teacher> teachers) {
        Collections.sort(teachers, new TeacherService<>());

    }
}
