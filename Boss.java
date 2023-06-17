/*
@autor Stanchu Vladislav
*/

//Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты
//        (сделать статическим) в класс руководителя, модифицируйте метод таким образом, чтобы он мог
//        поднять заработную плату всем, кроме руководителей. В основной программе создайте руководителя
//        и поместите его в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите,
//        чтобы зарплата руководителя не повысилась.

//(*) Сделать компараторы для Сотрудников на основе ЗП и Возраста


public class Boss extends Employee{
    public Boss(String surName, String firstName, String position, int age, int salary, Long phone) {
        super(surName, firstName, position, age, salary, phone);
    }
    public static void salaryUp(Employee[] employees){
        for (int i = 0; i < employees.length; i++){
            if (!(employees[i] instanceof Boss)){
                employees[i].setSalary(employees[i].getSalary() + 9999);
            }

        }
    }


}
