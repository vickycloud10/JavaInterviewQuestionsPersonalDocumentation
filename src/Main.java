import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

        // Give the salary hike to
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

        System.out.println("\n\n-----Difference between map and filter-----");
        System.out.println("-----updated object list-----");
        List<Voters> votersUpdatedList = javaStreamPractice.determineTheVotersEligibility(listOfVoters);
        for(Voters voter: votersUpdatedList){
            System.out.println("Name: "+voter.getName()+" "+"Age: "+voter.getAge()+" "+"Eligibility: "+voter.getEligibility());
        }

        System.out.println("\n\n-----Eligible voter list-----");
        List<Voters> eligibleVoters = javaStreamPractice.getOnlyEligiblePeopleToVote(listOfVoters);
        for(Voters voter: eligibleVoters){
            System.out.println("Name: "+voter.getName()+" "+"Age: "+voter.getAge()+" "+"Eligibility: "+voter.getEligibility());
        }

        List<String>listOfInput = new ArrayList<>();
        Collections.addAll(listOfInput, "hi", null, "hello", null, null, "evening", null);
        List<String>newListOfInput = listOfInput.stream().sorted(Comparator.nullsFirst(Comparator.naturalOrder())).collect(Collectors.toList());
        System.out.println("\n\nComparator sorting nulls at first: ");
        newListOfInput.forEach(input -> System.out.print(input+", "));
        List<String>newListOfInputNullsAtLast = listOfInput.stream().sorted(Comparator.nullsLast(Comparator.naturalOrder())).collect(Collectors.toList());
        System.out.println("\n\nComparator sorting nulls at last: ");
        newListOfInputNullsAtLast.forEach(input -> System.out.print(input+", "));

        System.out.println("\n\n");

        System.out.println("\n--------Functional Interface And Lambda Expressions");
        Calculator additionOfTwoNumbers = (a,b) -> a + b;
        Calculator subtractionOfTwoNumbers = (a,b) -> a - b;
        Calculator multiplicationOfTwoNumbers = (a,b) -> a * b;
        Calculator divisionOfTwoNumbers = (a,b) -> a/b;
        System.out.println("Addition of two numbers : "+ additionOfTwoNumbers.calculate(5,5));
        System.out.println("Subtraction of two numbers : "+ subtractionOfTwoNumbers.calculate(5,5));
        System.out.println("Multiplication of two numbers : "+ multiplicationOfTwoNumbers.calculate(5,5));
        System.out.println("Division of two numbers : "+ divisionOfTwoNumbers.calculate(5,5));
        /*
        Functional Interfaces :  A functional interface in java is an interface with only one abstract method. Since Java 8
        they have gained popularity due to their compatibility with Lambda Expressions which provides a concise way to
        implement a abstract method of the functional interface
         */

        /*
        * We defined a functional interface Calculator with a single abstract method calculate.
          We used lambda expressions to provide implementations for each operation (addition, subtraction, multiplication, and division)
          without explicitly implementing the interface using anonymous inner classes.
        * We invoked the calculate method on each functional interface instance to perform the respective operation.
            This demonstrates the link between functional interfaces and lambda expressions in Java,
            where lambda expressions provide a concise way to implement the abstract method of a functional interface.
        *  This combination allows for more expressive and readable code, especially in scenarios involving functional programming paradigms.
        * */


    }
}