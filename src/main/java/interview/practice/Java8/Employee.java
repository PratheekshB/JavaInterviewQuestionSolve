package interview.practice.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Employee {
    //MULTI DIMENSIONAL ARRAY
    private final String name;
    private final double salary;
    private final String gender;

    public Employee(String name, double salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee("Pratheeksh", 70000, "Male"),
                new Employee("Shilpa", 70000, "Female"),
                new Employee("Rashmi", 80000, "Female"),
                new Employee("Chethan", 70000, "Male"),
                new Employee("Manoj", 60000, "Male"),
                new Employee("Manoj", 60000, "Male")
        );

//Filter based on employee salary greater than 60000 and gender is female and sort based on employee name
        System.out.println("Employee salary greater than 60000 are: ");
        List<Employee> empWithFilter = emp.stream()
                .filter(employee -> employee.salary > 60000 && employee.gender.equals("Female"))
                .sorted(Comparator.comparing(employee -> employee.name))
                .collect(Collectors.toList());
        empWithFilter.forEach(employee -> System.out.println(employee.name));

//Filter based on employee salary starts with number 7 and sort according to employee names in alphabetical order
        System.out.println("Employee salary starts with 7 are:");
        List<Employee> empWithAnotherFilter1 = emp.stream().filter(employee -> String.valueOf(employee.salary).startsWith("7"))
                .sorted(Comparator.comparing(employee -> employee.name))
                .toList();
        empWithAnotherFilter1.forEach(employee -> System.out.println(employee.name));

// Remove Duplicate Employee
        System.out.println("Removing Duplicate Employees are: ");
        List<Employee> distinctEmployee = emp.stream().distinct().toList();
        distinctEmployee.forEach(System.out::println);

//Calculating average salary
        double averageSalary = emp.stream().mapToDouble(employee -> employee.salary).average().orElse(0);
        System.out.println("Calculating average salary: " + averageSalary);

// Highest Paid Salary
        Employee highPaid = emp.stream().max(Comparator.comparingDouble(employee -> employee.salary))
                .orElse(null);
        System.out.println("Highest Paid Employee is :" + highPaid);

// Lowest Paid Salary
        Employee lowPaid = emp.stream().min(Comparator.comparingDouble(employee -> employee.salary))
                .orElse(null);
        System.out.println("Lowest Paid Employee is :" + lowPaid);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(gender, employee.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, gender);
    }
}