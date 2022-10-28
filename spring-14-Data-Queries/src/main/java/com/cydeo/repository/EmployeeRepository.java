package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //Display all employees with email, address
    List<Employee> findByEmail(String email);

    //Display all employees with firstname "" and lastname ""
    //also show all employees with email address ""
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //Display all employees that first name is not ""
    List<Employee> findByFirstNameIsNot(String name);

    //Display all employees where last name starts with "
    List<Employee> findByLastNameStartsWith(String str);

    //Display all employees with salary higher than ""
    List<Employee> findBySalaryGreaterThan(Integer sal);

    //Display all employees with salary less than ""
    List<Employee> findBySalaryLessThan(Integer sal);

    //Display all employees that has been hired between dates
    List<Employee> findByHireDateBetween(LocalDate date1, LocalDate date2);

    //Display all employees where salary greater and equal to and in order
    List<Employee> findBySalaryGreaterThanEqualOrderBySalary(Integer salary);

    //Display top unique 3 employees that is making less than ""
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that don't have email
    List<Employee> findByEmailIsNull();

    //JPQL
    @Query("SELECT employee FROM Employee employee WHERE employee.email='amcnee1@google.es'")
    Employee retrieveEmployeeDetail();


    @Query("SELECT e.salary FROM Employee e WHERE e.email='amcnee1@google.es'")
    Integer retrieveEmployeeSalary();

    //Not Equal
    @Query("select e.salary from Employee e where e.salary <> ?1")
    List<Employee> retrieveEmployeeSalaryNotEqual(int salary);

    //Like / Contains/ startswith / endswith
    @Query("select e from Employee e where e.firstName like ?1")
    List<Employee> retrieveEmployeeFirstNameLike(String pattern);

    //Less than
    @Query("select e from Employee e where e.salary<?1")
    List<Employee> retrieveEmployeeSalaryLessThan(int salary);

    //Greater than
    @Query("select e from Employee e where e.salary>?1")
    List<Employee> retrieveEmployeeSalaryGreaterThan(int salary);

    //Between
    @Query("select e from Employee e where e.salary between ?1 and ?2")
    List<Employee> retrieveEmployeeBetweenDates(int salary1, int salary2);

    //Before
    @Query("select e from Employee e where e.hireDate < ?1")
    List<Employee> retrieveEmployeeHireDateBefore(LocalDate date);

    //Null
    @Query("select e from Employee e where e.email is null")
    List<Employee> retrieveEmployeeWhereEmailNull();

    @Query("select e from Employee e where e.email is not null")
    List<Employee> retrieveEmployeeWhereEmailNotNull();

    //Sorting
    @Query("select Employee from Employee e order by e.salary")
    List<Employee> retrieveEmployeeSalaryOrder();

    @Query("select e from Employee e order by e.salary desc")
    List<Employee> retrieveEmployeeSalaryOrderDesc();


    //
}
