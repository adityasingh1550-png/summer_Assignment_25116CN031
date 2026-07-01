import java.io.*;
import java.util.Scanner;

class Employee {
    int emp_id=0;
        String emp_name="";
        int age=0;
        String department="";
        double salary=0.0d;}
        public class Employee_Management_System{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many employee you want to enter");
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
            System.out.println("9.Sort employees by name");
            System.out.println("10.Sort employee by salary");
            System.out.println("11. Department-wise Employee Count");
            System.out.println("12. Save Employees To File");
            System.out.println("13. Load Employees From File");
            System.out.println("14.Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    if(count<n)
                    {
                        System.out.println("Enter the Employee id");
                        int newId = sc.nextInt();

                        boolean exists = false;

                        for(int i = 0; i < count; i++)
                        {
                            if(employee[i].emp_id == newId)
                                {
                                    exists = true;
                                    break;
                                }
                        }

                    if(exists)
                        {
                            System.out.println("Employee ID already exists. Enter a unique ID.");
                        }
                        else{
                        employee[count]=new Employee();
                        employee[count].emp_id = newId;
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
                        
                    }}
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
                        int newId = sc.nextInt();

                        boolean duplicate = false;

                        for(int j=0;j<count;j++)
                        {
                        if(j != i && employee[j].emp_id == newId)
                        {
                        duplicate = true;
                        break;
                        }
                        }

                        if(duplicate)
                        {
                        System.out.println("Employee ID already exists");
                        break;
                        }
                        employee[i].emp_id=newId;
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
                        for(int i=0;i<count-1;i++)
                            {
                                for(int j=0;j<count-1-i;j++)
                                {
                                    if(employee[j].emp_name.compareToIgnoreCase(employee[j+1].emp_name) > 0)
                                    {
                                    Employee temp = employee[j];
                                    employee[j] = employee[j+1];
                                    employee[j+1] = temp;
                                    }
                                }
                            }
                            System.out.println("Employees sorted by name");
                            for(int i=0;i<count;i++)
                            {

                            
                            System.out.println("Id: "+employee[i].emp_id);
                            System.out.println("Name: "+employee[i].emp_name);
                            System.out.println("Age: "+employee[i].age);
                            System.out.println("department: "+employee[i].department);
                            System.out.println("salary: "+employee[i].salary);
                        }
                        break;
                    case 10:
                        for(int i=0;i<count-1;i++)
                        {
                            for(int j=0;j<count-1-i;j++)
                            {
                        if(employee[j].salary > employee[j+1].salary)
                        {
                        Employee temp = employee[j];
                        employee[j] = employee[j+1];
                        employee[j+1] = temp;
                        }
                        }
                        }
                        System.out.println("Employees sorted by salary");
                            for(int i=0;i<count;i++)
                            {

                            
                            System.out.println("Id: "+employee[i].emp_id);
                            System.out.println("Name: "+employee[i].emp_name);
                            System.out.println("Age: "+employee[i].age);
                            System.out.println("department: "+employee[i].department);
                            System.out.println("salary: "+employee[i].salary);
                        }
                        break;
                    case 11:
                            if(count==0)
                            {
                            System.out.println("No employee records found");
                            }
                            else
                            {
                            boolean[] visited = new boolean[count];

                            System.out.println("Department-wise Employee Count:");

                            for(int i=0;i<count;i++)
                            {
                            if(!visited[i])
                            {
                            int depCount = 1;
                            visited[i] = true;

                            for(int j=i+1;j<count;j++)
                            {
                            if(employee[i].department.equalsIgnoreCase(employee[j].department))
                            {
                            depCount++;
                            visited[j] = true;
                            }
                            }

                            System.out.println(employee[i].department + " = " + depCount);
                            }
                            }
                            }
                    break;
                    case 12:
                        try
                            {
                            BufferedWriter bw = new BufferedWriter(
                            new FileWriter("employees.txt"));

                            for(int i=0;i<count;i++)
                            {
                            bw.write(employee[i].emp_id + "," +
                            employee[i].emp_name + "," +
                            employee[i].age + "," +
                            employee[i].department + "," +
                            employee[i].salary);

                            bw.newLine();
                            }

                            bw.close();
                            System.out.println("Employee records saved successfully.");
                            }
                            catch(IOException e)
                            {
                            System.out.println("Error while saving file.");
                            }
                        break;
                    case 13:
                        try
                        {
                        BufferedReader br = new BufferedReader(
                        new FileReader("employees.txt"));

                        count = 0;

                        String line;

                        while((line = br.readLine()) != null && count < n)
                        {
                        String[] data = line.split(",");

                        employee[count] = new Employee();

                        employee[count].emp_id =
                        Integer.parseInt(data[0]);

                        employee[count].emp_name = data[1];

                        employee[count].age =
                        Integer.parseInt(data[2]);

                        employee[count].department = data[3];

                        employee[count].salary =
                        Double.parseDouble(data[4]);

                        count++;
                        }

                        br.close();
                        System.out.println("Employee records loaded successfully.");
                        }
                        catch(IOException e)
                        {
                        System.out.println("File not found.");
                        }
                    break;
                    case 14:
                        System.out.println("Exiting Program...");
                    sc.close();
                    return;
                    default:
                    System.out.println("Invalid choice.");
}}}}
