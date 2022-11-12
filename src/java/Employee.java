
/*Class creation
* class is a blueprint of an object
* */
public class Employee {
    public String employeeFirstName;
    public String employeeLastName;
    public String employeeFullName;

    public int employeeId;
    public String employeeDepartment;

    public int employeeSalaryPerYear;
    public int employeeSalaryPerMonth;



    public String getFullName(){
        employeeFullName= employeeFirstName+" "+employeeLastName;
        return employeeFullName;
    }

    public int getEmployeeSalaryPerMonth(){
        employeeSalaryPerMonth = employeeSalaryPerYear/12;
        return employeeSalaryPerMonth;
    }

    /*hiding the method implementation is abstraction - below is example*/
    public int employeeLuckyNumber(){
        return (int) Math.random();
    }




}
