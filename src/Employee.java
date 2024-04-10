
public class Employee {
    private int id;
    private String name;
    private int salary;
    private int grade;
    private String department;

    public Employee() {
    }

    public Employee(int id, String name, int salary, int grade, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.grade = grade;
        this.department = department;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
