import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private Long index;
    private double avgGrade;
    private Major vocation;
    private List<Short> grades = new ArrayList<>();
    static private Long indexNumertor = 0L;

    enum Major {
        matematyka,
        informatyka,
        telekomunikacja
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public Major getVocation() {
        return vocation;
    }

    public void setVocation(Major vocation) {
        this.vocation = vocation;
    }

    public List<Short> getGrades() {
        return grades;
    }

    public void setGrades(List<Short> grades) {
        this.grades = grades;
    }

    public Student(String name, Major vocation) {
        super(name);
        this.vocation = vocation;
        index = indexNumertor++;
    }

    public void addGrade(Short grade) {
        this.grades.add(grade);
        this.avgGrade = grades.stream().reduce((short) 0, (a, b) -> (short)(a + b)) / (double) grades.size();
    }

    @Override
    public String toString() {
        return "Student: " + name  + "\nKierunek: " + vocation + "\nNrIndeksu: " + index + "\n";
    }
}
