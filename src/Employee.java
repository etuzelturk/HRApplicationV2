import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public abstract class Employee {

    private String name;
    private String surname;
    private LocalDate birthDate;

    public Employee(String name,String surname, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public abstract int calculateRetirementAge();
    public int calculateYearsToRetirement() {
        int age = Period.between(birthDate, LocalDate.now()).getYears();
        return calculateRetirementAge() - age;
    }
}


