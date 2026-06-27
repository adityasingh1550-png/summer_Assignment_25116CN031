import java.util.Scanner;

class Employee {
    int emp_id=0;
        String emp_name="";
        int age=0;
        String department="";
        double salary=0.0d;}
        public class employee_management_system{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many    employee you want to enter");
        int n=sc.nextInt();
        Employee[] employee=new Employee[n];
        int count=0;
        int choice=0;
        while(true)
        {
            System.out.println("=============== Employee_RECORD_MANAGEMENT_SYSTEM=====================");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Employee with highest salary");
            System.out.println("7.Average salary of employees");
            System.out.println("8.All employees with same department");
            System.out.println("9.Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    if(count<n)
                    {
                        employee[count]=new Employee();
                        System.out.println("Enter the Employee id");
                        employee[count].emp_id=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the name of Employee");
                        employee[count].emp_name=sc.nextLine();
                        System.out.println("Enter the age");
                        employee[count].age=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the department");
                        employee[count].department=sc.nextLine();
                        System.out.println("Enter the salary");
                        employee[count].salary=sc.nextDouble();
                        System.out.println( "Employee added successfully");
                        count++;
                        
                    }
                    else
                        {
                        System.out.println("Array out of bound");}
                    break;
                case 2:
                    if(count==0)
                        System.out.println("No record found");
                    else{
                        for(int i=0;i<count;i++)
                        {
                            System.out.println(" Employee  "+(i+1));
                            System.out.println("Id: "+employee[i].emp_id);
                            System.out.println("Name: "+employee[i].emp_name);
                            System.out.println("Age: "+employee[i].age);
                            System.out.println("department: "+employee[i].department);
                            System.out.println("salary: "+employee[i].salary);
                        }
                        }
                    break;
                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found=false;
                    for (int i = 0; i < count; i++) {
                        if(employee[i].emp_id == searchId) {
                            System.out.println(" Employee Found:");
                            System.out.println("ID: " +employee[i].emp_id);
                            System.out.println("Name: " +employee[i].emp_name);
                            System.out.println("Age: " +employee[i].age);
                            System.out.println("department: " +employee[i].department);
                            System.out.println("salary: " + employee[i].salary);
                            found=true;
                            break;
                        }}
                        if(!found)
                            System.out.println( "Employee not found.");
                    break;
                case 4:
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = sc.nextInt();
                    boolean update_found=false;
                    for(int i=0;i<count;i++)
                    {
                        if(employee[i].emp_id==updateId)
                        {
                        System.out.println("Enter the new Employee id");
                        employee[i].emp_id=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the new name of Employee");
                        employee[i].emp_name=sc.nextLine();
                        System.out.println("Enter the new age");
                        employee[i].age=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the new department");
                        employee[i].department=sc.nextLine();
                        System.out.println("Enter the salary");
                        employee[i].salary=sc.nextDouble();
                        System.out.println("Employee updated successfully");
                        update_found=true;
                        break;
                        
}}
                    if(!update_found)
                        System.out.println("No record found");break;
                    case 5:
                        System.out.println("Enter the id to be deleted");
                        int delete_id=sc.nextInt();
                        boolean delfound=false;
                        for(int i=0;i<count;i++)
                        {
                            if(delete_id==employee[i].emp_id)
                            {
                                for(int j=i;j<count-1;j++)
                                {
                                    employee[j]=employee[j+1];}
                                System.out.println("Deleted Employee successfully");
                                delfound=true;
                                employee[count-1]=null;
                                count--;
                                break;}}
                        if(!delfound)
                            System.out.println("Employee not found");
                        break;
                    case 6:
                        if(count==0)
                            System.out.println("No employee record found");
                        else{
                        double highest_salary = employee[0].salary;
                        int id_highest = employee[0].emp_id;
                        for(int i=0;i<count;i++)
                        {
                            if(employee[i].salary>highest_salary)
                            {
                                highest_salary=employee[i].salary;
                                id_highest=employee[i].emp_id;
                            }
                        }
                        System.out.println("The highest salary is "+highest_salary);
                        for(int i=0;i<count;i++)
                        {
                        if(id_highest==employee[i].emp_id){
                            System.out.println("Id: "+employee[i].emp_id);
                            System.out.println("Name: "+employee[i].emp_name);
                            System.out.println("Age: "+employee[i].age);
                            System.out.println("department: "+employee[i].department);
                        break;}
                        }}
                    break;
                    case 7:
                        if(count==0)
                            System.out.println("No record found");
                        else{
                        double avg_salary=0.0d;
                        double total_salary=0.0d;
                        for(int i=0;i<count;i++)
                        {
                            total_salary+=employee[i].salary;
                        }
                        avg_salary=total_salary/count;
                        System.out.println("The average salary of employees is "+avg_salary);
                    
                    }
                    break;
                    case 8:
                        System.out.println("Enter the department to be displayed");
                        boolean dep_found=false;
                        sc.nextLine();
                        String disp_department=sc.nextLine();
                        for(int i=0;i<count;i++)
                        {
                            if(disp_department.equalsIgnoreCase(employee[i].department))
                            {
                            System.out.println(" Employee Found:");
                            System.out.println("ID: " +employee[i].emp_id);
                            System.out.println("Name: " +employee[i].emp_name);
                            System.out.println("Age: " +employee[i].age);
                            System.out.println("department: " +employee[i].department);
                            System.out.println("salary: " + employee[i].salary);
                            dep_found=true;
                            }
                        }
                        if(!dep_found)
                            System.out.println("Employee not found");
                        break;
                    case 9:
                        System.out.println("Exiting Program...");
                    sc.close();
                    return;
                    default:
                    System.out.println("Invalid choice.");
}}}}

