package Homework4;

public class Teacher {

    private String firstName;
    private String lastName;
    private String middleName;
    private int id;

    // Конструктор класса

    public Teacher(int id, String firstName, String lastName, String middleName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    // Методы для получения данных

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    // Методы для установки данных

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    // Метод для преобразования

    public String toString() {
        return "id " + id + " " + lastName + " " + firstName + " " + middleName;
    }

}
