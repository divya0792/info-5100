

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class EmployeeTest {
    Assignment2 assignment2;
    Employee employee;

    @Before
    public void init() {
        assignment2 = new Assignment2();
    }

    @Test
   public void socialSecurityTaxLessThan8900() {
        //Arrange

         employee = new Employee("John", 24, Gender.MALE, 8800.24);
        double expectedSocialSecurityTax = (6.2/100) * employee.getSalary();

        //Act
        double actualSocialSecurityTax = assignment2.socialSecurityTax(employee);

        //Assert
        assertEquals(expectedSocialSecurityTax, actualSocialSecurityTax, 0.0);

    }

    @Test
    public void socialSecurityGreaterThan8900(){

        //Arrange
        employee  = new Employee("John", 24, Gender.MALE, 9000.24);
        double expectedSocialSecurityTax = (6.2/100) * 106800;

        //Act
        double actualSocialSecurityTax =  assignment2.socialSecurityTax(employee);

        //Assert
        assertEquals(expectedSocialSecurityTax, actualSocialSecurityTax, 0.0);
    }

    @Test
    public void insuranceCoverage() {
        //Arrange
        employee  = new Employee("John", 50, Gender.MALE, 9000.24);
        double expectedInsuranceCoverage = (4/100.0) * employee.getSalary();

        //Act
        double actualInsuranceCoverage = assignment2.insuranceCoverage(employee);

        //Assert
        assertEquals(expectedInsuranceCoverage, actualInsuranceCoverage, 0.0);
    }

    @Test
    public void sortSalaryByComparable() {

        //Arrange
        Employee employee1 = new Employee("John", 50, Gender.MALE, 9000.24);
        Employee employee2 = new Employee("Alice", 50, Gender.MALE, 8000.89);
        Employee employee3 = new Employee("Jenny", 50, Gender.MALE, 12000);
        Employee[] expectedEmployees = {employee2, employee1, employee3};

        //Act
        Employee[] actualEmployees = assignment2.sortSalaryByComparable(employee1, employee2, employee3);

        //Assert
        assertArrayEquals(expectedEmployees, actualEmployees);


    }
}
