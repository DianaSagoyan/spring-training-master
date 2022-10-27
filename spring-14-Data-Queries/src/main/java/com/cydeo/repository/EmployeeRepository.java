package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

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

}
