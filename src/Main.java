import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Generate Random number and print only first 10 distinct sorted numbers using streams
        GenerateRandomNumbers generateRandomNumbers = new GenerateRandomNumbers();
        int randomNumbers [] = generateRandomNumbers.generateRandomNumbersAndPrintOnlyFirstTenDistinctNumbersUsingStreams();
        for(int number : randomNumbers){
            System.out.println(number);
        }

        // count the number of characters in a given string
        JavaStreamPractice javaStreamPractice = new JavaStreamPractice();
        String count = javaStreamPractice.stringCharacterCounter("NewtonianDynamics");
        System.out.println(count);

        /*
            Employee POJO - id, name, salary, grade, dept.
            In a list of employees write a Java 8 program
            using Stream API to give 10% salary hike to those in HR dept. and Grade > 6.
        */

        //Creating pojo and assigning objects
        Employee employee1 = new Employee(0, "Rob", 1000, 2, "Tech");
        Employee employee2 = new Employee(1, "Jin", 2000, 7, "HR");
        Employee employee3 = new Employee(2, "Veronica", 1000, 1, "Marketing");
        Employee employee4 = new Employee(3, "Newton", 1000, 7, "HR");
        Employee employee5 = new Employee(4, "Sam", 4000, 3, "Tech");
        Employee employee6 = new Employee(6, "Mary", 1000, 2, "Management");

        // Give the salary hike to relevant employees and print all the employees
        ArrayList<Employee> listOfEmployees = new ArrayList<>();
        Collections.addAll(listOfEmployees, employee1, employee2, employee3, employee4, employee5, employee6);
        EmployeeSalaryAppUsingStreams employeeSalaryAppUsingStreams = new EmployeeSalaryAppUsingStreams();
        List<Employee> listOfSalaryHikedEmployees = employeeSalaryAppUsingStreams.getTenPercentSalaryHikeForHRDepartmentWithGradeSix(listOfEmployees);
        for(Employee salaryHikedEmployee : listOfSalaryHikedEmployees){
            System.out.println(salaryHikedEmployee.getId() +" "+ salaryHikedEmployee.getSalary()+" "+ salaryHikedEmployee.getGrade()+" "+ salaryHikedEmployee.getDepartment());
        }

        // Stream api example and difference between map and filter

        Voters voter1 = new Voters(0, "Ankit", 12, "");
        Voters voter2 = new Voters(1, "Ramya", 18, "");
        Voters voter3 = new Voters(2, "Karthik", 22, "");
        Voters voter4 = new Voters(3, "Bala", 32, "");
        Voters voter5 = new Voters(4, "Madhan", 11, "");
        Voters voter6 = new Voters(5, "Manasa", 17,"");

        List<Voters>listOfVoters = new ArrayList<>();
        Collections.addAll(listOfVoters, voter1, voter2,voter3,voter4,voter5,voter6);

        System.out.println("-----Difference between map and filter-----");
        System.out.println("-----updated object list-----");
        List<Voters> votersUpdatedList = javaStreamPractice.determineTheVotersEligibility(listOfVoters);
        for(Voters voter: votersUpdatedList){
            System.out.println("Name: "+voter.getName()+" "+"Age: "+voter.getAge()+" "+"Eligibility: "+voter.getEligibility());
        }

        System.out.println("-----Eligible voter list-----");
        List<Voters> eligibleVoters = javaStreamPractice.getOnlyEligiblePeopleToVote(listOfVoters);
        for(Voters voter: eligibleVoters){
            System.out.println("Name: "+voter.getName()+" "+"Age: "+voter.getAge()+" "+"Eligibility: "+voter.getEligibility());
        }
    }
}