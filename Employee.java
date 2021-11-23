
public class Employee extends Person {

    public enum Position {
        ASYSTENT,
        ADIUNKT,
        PROFESOR,
    }

    private int salary;
    private Position occupation;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Position getOccupation() {
        return occupation;
    }

    public void setOccupation(Position occupation) {
        this.occupation = occupation;
    }

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
        this.occupation = Position.ASYSTENT;
    }

    void promote() {
        if (this.occupation == Position.ASYSTENT) this.occupation = Position.ADIUNKT;
        else this.occupation = Position.PROFESOR;
    }

    @Override
    public String toString() {
        return "Pracownik: " +  name + "\nPensja: " + salary + "\nEtat: " + occupation + "\n";
    }
}


