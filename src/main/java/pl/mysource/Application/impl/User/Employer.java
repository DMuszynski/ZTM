package pl.mysource.Application.impl.User;

import java.time.LocalDate;

/**
 * Klasa definiujaca Pracownika
 * @version 1.1 2018-10-17
 * @author Damian Muszyński
 */
public class Employer extends User {

    private float salary;
    private int age;
    private LocalDate hireDate;

    /**
     * Konstruktor tworzy nowego prcownika
     *
     * @param firstName imie
     * @param lastName  nazwisko
     * @param address   addres
     * @param age       wiek
     * @param salary    wynagodzenie
     * @param year      rok zatrudnienia
     * @param month     miesiac zatrudnienia
     * @param day       dzien zatrudnienia
     */
    public Employer(String firstName, String lastName, String address, int age,
                    float salary, int year, int month, int day) {
        super(firstName, lastName, address);
        setAge(age);
        setSalary(salary);
        setHireDate(year, month, day);
    }

    // Set Methods
    public final void setSalary(float salary)           { this.salary = salary;                     }
    public final void setAge(int age)                   { this.age = age;                           }
    public final void setHireDate(int y, int m, int d)  { this.hireDate = LocalDate.of(y, m, d);    }

    // Get Methods
    public final float getSalary()          { return salary;    }
    public final int getAge()               { return age;       }
    public final LocalDate getHireDate()    { return hireDate;  }

}