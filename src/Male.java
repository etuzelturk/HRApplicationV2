import java.time.LocalDate;

public class Male extends Employee {
    public Male(String name,String surname, LocalDate birthDate) {
        super(name, surname, birthDate);
    }

    @Override
    public int calculateRetirementAge() {
        return 65;
    }
}
