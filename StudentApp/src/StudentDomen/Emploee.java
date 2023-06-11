package StudentDomen;

public class Emploee extends User{
    private String special;
    public Emploee(String firstName, String secondName, int age, String special) {
        super(firstName, secondName, age);
        this.special = special;
    }
    @Override
    public String toString() {
        return "Emploee {special =" + special +'\'' +", firstName = " + super.getFirstName() + '\'' +
        ", secondName = " + super.getSecondName() + '\'' +
        ", age = " + super.getAge() +"}";
    }

  
}