public class Voters {
    private int id;
    private String name;
    private int age;
    private String eligibility;

    public Voters() {
    }

    public Voters(int id, String name, int age, String eligibility) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.eligibility = eligibility;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }
}
