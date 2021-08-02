package Lesson5;

public class mainClass {
    public static void main(String[] args){
        employeesPerson[] employees = new employeesPerson[5];
        employees[0] = new employeesPerson("Ivan", "Ivanov","Orlan1211@yahoo.com","Engineer", (int) 88005553535L, 23, 700000);
        employees[1] = new employeesPerson("Ivan", "Ivanov","Orlan1212@yahoo.com","Engineer", (int) 88005553535L, 25, 700000);
        employees[2] = new employeesPerson("Ivan", "Ivanov","Orlan1213@yahoo.com", "An electrician", (int) 88005553535L, 20, 400000);
        employees[3] = new employeesPerson("Ivan", "Ivanov","Orlan1214@yahoo.com","An electrician", (int) 88005553535L, 30, 400000);
        employees[4] = new employeesPerson("Ivan", "Ivanov","Orlan1215@yahoo.com","Master", (int) 88005553535L, 44, 500000);
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getAge() > 40 ){
                employees[i].printEmployees();
            }
        }
    }
}
