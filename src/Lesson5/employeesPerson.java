package Lesson5;

public class employeesPerson {
    protected String name;
    protected String firstName;
    protected String email;
    protected String position;
    protected int numberPhone;
    protected int age;
    protected int salary;

    public employeesPerson(String name, String firstName, String email, String position, int numberPhone, int age, int salary){
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.position = position;
        this.numberPhone = numberPhone;
        this.age = age;
        this.salary = salary;
    }

    public void printEmployees(){
        System.out.println("Имя: " + name + " " +"Фамилия: "+ firstName + " " + "Email: " + email + " " + "Должность: " + position + " " + "Номер телефона: " + numberPhone + " " + "Возвраст: " + age + " " + "Зарплата: " + salary);
    }

    public int getAge(){
        return age;
    }
}
