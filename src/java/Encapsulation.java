public class Encapsulation {

    public static void main(String[] args) {

        /* Encapsulation example */
        Employee employee1 = new Employee(); /* using new Keyword we are creating an object employee1*/
        /* setting data to the object*/
        employee1.employeeDepartment = "IT";
        employee1.employeeFirstName = "Ram";
        employee1.employeeLastName="Kumar";
        employee1.employeeSalaryPerYear=120000;
        employee1.getFullName();
        employee1.getEmployeeSalaryPerMonth();


        Employee employee2 = new Employee();  /* using new Keyword we are creating an object employee2*/
       // employee2=ROWmapper(json);
        employee2.employeeDepartment = "HR";
        employee2.employeeFirstName = "Prianka";
        employee2.employeeLastName="Kumari";
        employee2.employeeSalaryPerYear=240000;
        employee2.getFullName();
        employee2.getEmployeeSalaryPerMonth();

        System.out.println(employee1.getFullName());

        System.out.println(employee1.employeeLuckyNumber()+"");



        //Employee Table name  and the Employee object are mapped using hiberation JPA-->ObjectRow mappers
        // JSON JSONObject mappers

    }
}
