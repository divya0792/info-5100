import java.util.Arrays;

/**
 * Assignment for your lecture 2. Please finish all the questions under 'Assignment'
 * Please try to think the extra credit question.
 * The deadline of this assignment is 09/21/2018 23:59 PST.
 * Please feel free to contact Amanda and Zane for any questions.
 */

class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private Gender gender;
    private double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
        //write your code here
        if(name == null || age <= 0 || gender == null || salary < 0.0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    // Getter for `name`. Return the current `name` data
    public String getName() {
        //write your code here
        return this.name;
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
        //write your code here
        if(name == null) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if(salary < 0.0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age <= 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public Gender getGender() {
        return this.gender;
    }
    public void setGender(Gender gender) {
        if(gender == null) {
            throw new IllegalArgumentException("Age cannot be null");
        }
        this.gender = gender;
    }

    public void raiseSalary(double byPercent) {
        setSalary(byPercent * getSalary() / 100);
    }

    public void swap(Employee otherEmployee) {
        String name = this.getName();
        int age = this.getAge();
        double salary = this.getSalary();
        Gender gender = this.getGender();

        this.setName(otherEmployee.getName());
        this.setAge(otherEmployee.getAge());
        this.setSalary(otherEmployee.getSalary());
        this.setGender(otherEmployee.getGender());

        otherEmployee.setName(name);
        otherEmployee.setAge(age);
        otherEmployee.setGender(gender);
        otherEmployee.setSalary(salary);
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        if(otherEmployee == null) {
            throw new NullPointerException("Employee cannot be null");
        }

        if( this.getSalary() == otherEmployee.getSalary()) {
            return 0;
        } else if(this.getSalary() > otherEmployee.getSalary()) {
            return 1;
        } else {
            return -1;
        }
    }
}

enum Gender {
    MALE,
    FEMALE;
}


 class Assignment2 {
    // Assignment
    private final static double SOCIAL_SECURITY_SALARY_LIMIT = 8900;
    private final static double SOCIAL_SECURITY_TAX_FACTOR = 0.062;
    private final static double SOCIAL_SECURITY_MAX_SALARY = 106800;
    private final static double SOCIAL_SECURITY_TAX = SOCIAL_SECURITY_MAX_SALARY * SOCIAL_SECURITY_TAX_FACTOR;
    private final static int FIRST_LEVEL_LIMIT = 35;
    private final static int SECOND_LEVEL_LIMIT = 50;
    private final static int THIRD_LEVEL_LIMIT = 60;
    private final static double FIRST_LEVEL_INSURANCE_FACTOR = 0.03;
    private final static double SECOND_LEVEL_INSURANCE_FACTOR = 0.04;
    private final static double THIRD_LEVEL_INSURANCE_FACTOR = 0.05;
    private final static double FOURTH_LEVEL_INSURANCE_FACTOR = 0.06;

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
        //write your code here
        if(employee == null) {
            throw new IllegalArgumentException("Employee cannot be null");
        }

        double socialSecurityTax = SOCIAL_SECURITY_TAX;
        if(employee.getSalary() <= SOCIAL_SECURITY_SALARY_LIMIT) {
            socialSecurityTax = SOCIAL_SECURITY_TAX_FACTOR * employee.getSalary();
        }
        System.out.println("social security tax for " + employee.getName() + " is " + socialSecurityTax);
        return socialSecurityTax;
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public double insuranceCoverage(Employee employee) {
        //write your code here
        if(employee == null) {
            throw new IllegalArgumentException("Employee cannot be empty");
        }
        double insuranceCoverage = 0;
        if(employee.getAge() < FIRST_LEVEL_LIMIT) {
            insuranceCoverage =  FIRST_LEVEL_INSURANCE_FACTOR * employee.getSalary();
        }
        else if(employee.getAge() >= FIRST_LEVEL_LIMIT && employee.getAge() <= SECOND_LEVEL_LIMIT) {
            insuranceCoverage = SECOND_LEVEL_INSURANCE_FACTOR * employee.getSalary();
        }
        else if(employee.getAge() > SECOND_LEVEL_LIMIT && employee.getAge() < THIRD_LEVEL_LIMIT) {
            insuranceCoverage = THIRD_LEVEL_INSURANCE_FACTOR * employee.getSalary();
        }
        else {
            insuranceCoverage =  FOURTH_LEVEL_INSURANCE_FACTOR * employee.getSalary();
        }
        return insuranceCoverage;
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public Employee[] sortSalaryByComparable(Employee e1, Employee e2, Employee e3) {
        //write your code here
        if(e1 == null || e2 == null || e3 == null) {
            throw new IllegalArgumentException("employee cannot be null");
        }
        Employee[] employees = {e1, e2, e3};
        Arrays.sort(employees);
        for(int i = 0; i < employees.length; i++) {
            System.out.print(employees[i].getName()+ " ");
        }
        return employees;
    }

    public void sortSalary(Employee e1, Employee e2, Employee e3) {
        if (e1 == null || e2 == null || e3 == null) {
            throw new IllegalArgumentException("employee cannot be null");
        }
        if (e1.getSalary() <= e2.getSalary() && e1.getSalary() <= e3.getSalary()) {
            System.out.print(e1.getName() + " ");
            printEmployee(e2, e3);
        } else if (e2.getSalary() <= e1.getSalary() && e2.getSalary() <= e3.getSalary()) {
            System.out.print(e2.getName() + " ");
            printEmployee(e1, e3);
        } else {
            System.out.print(e3.getName() + " ");
            printEmployee(e1, e2);
        }
    }

     private void printEmployee(Employee e1, Employee e2) {
         if (e1.getSalary() <= e2.getSalary()) {
             System.out.print(e1.getName() + " ");
             System.out.print(e2.getName());
         } else {
             System.out.print(e2.getName() + " ");
             System.out.print(e1.getName());
         }
     }

     /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public void tripleSalary(Employee employee) {
        //write your code here
        if(employee == null) {
            throw new IllegalArgumentException("Employee cannot be null");
        }
        employee.raiseSalary(3);
    }


    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.
     The swap method holds reference of two objects and when we assign y to x we are assigning y's reference to x, not
     copying object properties. In java, objects are passed by reference but passes object references to methods by value.
    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);

        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());

        swap(a, b);

        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }

    public static void swapObjects(Employee employee1, Employee employee2) {
        if(employee1 == null || employee2 == null) {
            throw new IllegalArgumentException("Invalid Input");
        }

        employee1.swap(employee2);
    }
}