import java.util.Scanner;

class Employee{
    int empid;
    String empname="";
    double basicSalary;
    double HRA;
    double DA;
    double tax;
    double netsalary;
    Employee(int empid,String empname,double basicSalary,double HRA,double DA,double tax){
        this.empid=empid;
        this.empname=empname;
        this.basicSalary=basicSalary;
        this.HRA= HRA;
        this.DA= DA;
        this.tax=tax;
        calculatenetsalary();
    }
    void calculatenetsalary()
    {
        netsalary=basicSalary+HRA+DA-tax;
    }
    void display(){
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + empname);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("Tax: " + tax);
        System.out.println("Net Salary: " + netsalary);
        System.out.println("--------------------------------");
    }
}
public class salary_management_system
{
    static Employee[] employees;
    static int count=0;
    static Scanner sc=new Scanner(System.in);
    public static void addemployee()
    {
        if(count>=employees.length)
        {
            System.out.println("Storage is full");
            return;
        }
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        double da = sc.nextDouble();

        System.out.print("Enter Tax: ");
        double tax = sc.nextDouble();

        employees[count] = new Employee(id, name, basic, hra, da, tax);
        count++;

        System.out.println("Employee added successfully.");
    }

    public static void displayAll() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }

        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }
    public static void searchEmployee() {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (employees[i].empid == id) {
                employees[i].display();
                return;
            }
        }

        System.out.println("Employee not found.");
    }
    public static void updateEmployee() {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (employees[i].empid == id) {

                System.out.print("Enter New Basic Salary: ");
                employees[i].basicSalary = sc.nextDouble();

                System.out.print("Enter New HRA: ");
                employees[i].HRA = sc.nextDouble();

                System.out.print("Enter New DA: ");
                employees[i].DA = sc.nextDouble();

                System.out.print("Enter New Tax: ");
                employees[i].tax = sc.nextDouble();

                employees[i].calculatenetsalary();

                System.out.println("Salary details updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    public static void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (employees[i].empid == id) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;
                count--;

                System.out.println("Employee deleted successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }
    public static void highestSalaryEmployee() {
        if (count == 0) {
            System.out.println("No employee records found.");
            return;
        }

        Employee highest = employees[0];

        for (int i = 1; i < count; i++) {
            if (employees[i].netsalary > highest.netsalary) {
                highest = employees[i];
            }
        }

        System.out.println("Employee with Highest Salary:");
        highest.display();
    }
    public static void averageSalary() {
        if (count == 0) {
            System.out.println("No employee records found.");
            return;
        }

        double total = 0;

        for (int i = 0; i < count; i++) {
            total += employees[i].netsalary;
        }

        System.out.println("Average Salary: " + (total / count));
    }

    public static void main(String[] args) {

        System.out.print("Enter maximum number of employees: ");
        int n = sc.nextInt();

        employees = new Employee[n];

        while (true) {

            System.out.println("\n===== SALARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary Details");
            System.out.println("5. Delete Employee");
            System.out.println("6. Highest Salary Employee");
            System.out.println("7. Average Salary");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addemployee();
                    break;

                case 2:
                    displayAll();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    updateEmployee();
                    break;

                case 5:
                    deleteEmployee();
                    break;

                case 6:
                    highestSalaryEmployee();
                    break;

                case 7:
                    averageSalary();
                    break;

                case 8:
                    System.out.println("Exiting Program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
    

