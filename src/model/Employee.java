package model;

public class Employee {
    public String name;
    public String surname;
    public String PESEL;
    public String birth_date;
    public String empl_date;
    public double salary_net;


    public Employee(String name, String surname, String PESEL, String birth_date, String empl_date, double salary_net) {
        this.name = name;
        this.surname = surname;
        this.PESEL = PESEL;
        this.birth_date = birth_date;
        this.empl_date = empl_date;
        this.salary_net = salary_net;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", PESEL='" + PESEL + '\'' +
                ", birth_date='" + birth_date + '\'' +
                ", empl_date='" + empl_date + '\'' +
                ", salary_net=" + salary_net +
                '}';
    }
}
