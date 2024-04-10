
/*
    Employee POJO - id, name, salary, grade, dept.
    In a list of employees write a Java 8 program
    using Stream API to give 10% salary hike to those in HR dept. and Grade > 6.
 */

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalaryAppUsingStreams {
    public List<Employee> getTenPercentSalaryHikeForHRDepartmentWithGradeSix(List<Employee>listOfEmployees){
        return listOfEmployees
                .stream()
                .map(employee -> {
                    if(employee.getDepartment().equals("HR") && employee.getGrade() > 6){
                        employee.setSalary((int) (employee.getSalary() * 0.1 + employee.getSalary()));
                    }
                    return employee;
                }).collect(Collectors.toList());
    }
}
