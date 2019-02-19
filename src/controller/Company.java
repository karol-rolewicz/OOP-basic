package controller;

import model.Employee;

public class Company {
    Employee employees [] = new Employee[10];
    int index = 0;

    public void addEmployee (String name,
                             String surname,
                             String PESEL,
                             String birth_date,
                             String empl_date,
                             double salary_net) {

        // utworzenie obiektu pracownika
        Employee e1 = new Employee( name, surname, PESEL, birth_date, empl_date, salary_net);

        // zapisanie pracownika do listy pracowników
        employees[index] = e1;
        // inkrementacja indeksu
        index++;
        // wyświetlanie danych zapisanego pracownika

        System.out.println("Dodano pracownika: " + e1);


    }
    public void getAllEmployees () {
        System.out.println("Lista pracowników:");
        for (int i = 0; i < index; i++){
            System.out.println(employees[i]);
        }
    }

    public Employee getEmplayeeByPESEL (String PESEL_search) {
        for (int i = 0; i < index; i++){
            if(employees[i].PESEL.equals(PESEL_search)){
                    return employees[i];
                }
            }
            return null;
    }

    public Employee getEmplayeeByPESEL (String PESEL_search, double newSalary) {
        for (int i = 0; i < index; i++){
            if(employees[i].PESEL.equals(PESEL_search)){
                employees[i].salary_net = newSalary ;
            }
        }
        return null;
    }



    public static void main(String[] args) {
        Company c = new Company();
        // wywołanie metod
        c.addEmployee("A", "K", "666666666", "2000-02-20", "2018-11-22", 1600);
        c.addEmployee("B", "L", "125456789", "1990-05-20", "2018-11-22", 1600);
        c.addEmployee("A", "I", "126456789", "1990-03-20", "2018-11-22", 1600);
        c.getAllEmployees();
//        System.out.println("Czy jest pesel");
//        System.out.println(c.getEmplayeeByPESEL("666666666"));
//        System.out.println(c.getEmplayeeByPESEL("56789"));
        System.out.println(c.getEmplayeeByPESEL("666666666", 2500));
        c.getAllEmployees();
    }
}


