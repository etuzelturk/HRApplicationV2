import java.time.LocalDate;

public class Female extends Employee {
    public Female(String name,String surname, LocalDate birthDate) {
        super(name, surname, birthDate);
    }

    @Override
    public int calculateRetirementAge() {
        return 60;
    }
}