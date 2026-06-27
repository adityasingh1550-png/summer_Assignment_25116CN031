import java.util.Scanner;

class Student {
    int stu_id=0;
        String stu_name="";
        int age=0;
        String course="";
        double marks=0.0d;}
        
    public class student_management_system{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many students you want to enter");
        int n=sc.nextInt();
        Student[] students=new Student[n];
        int count=0;
        int choice=0;
        while(true)
        {
            System.out.println("================STUDENT_RECORD_MANAGEMENT_SYSTEM=====================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    if(count<n)
                    {
                        students[count]=new Student();
                        System.out.println("Enter the student id");
                        students[count].stu_id=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the name of student");
                        students[count].stu_name=sc.nextLine();
                        System.out.println("Enter the age");
                        students[count].age=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the course");
                        students[count].course=sc.nextLine();
                        System.out.println("Enter the marks");
                        students[count].marks=sc.nextDouble();
                        count++;
                        System.out.println("Student added successfully");
                    }
                    else
                        {
                            System.out.println("Array out of bound");
                        }
                    break;
                case 2:
                    if(count==0)
                        System.out.println("No record found");
                    else{
                        for(int i=0;i<count;i++)
                        {
                            System.out.println("Student  "+(i+1));
                            System.out.println("Id: "+students[i].stu_id);
                            System.out.println("Name: "+students[i].stu_name);
                            System.out.println("Age: "+students[i].age);
                            System.out.println("Course: "+students[i].course);
                            System.out.println("Marks: "+students[i].marks);
                        }

                    }
                    break;
                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found=false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].stu_id == searchId) {
                            System.out.println("Student Found:");
                            System.out.println("ID: " + students[i].stu_id);
                            System.out.println("Name: " + students[i].stu_name);
                            System.out.println("Age: " + students[i].age);
                            System.out.println("Course: " + students[i].course);
                            System.out.println("Marks: " + students[i].marks);
                            found=true;
                            break;
                        }}
                        if(!found)
                            System.out.println("Student not found.");
                    break;
                case 4:
                    System.out.print("Enter Student ID to update: ");
                    
                    int updateId = sc.nextInt();
                    boolean update_found=false;
                    for(int i=0;i<count;i++)
                    {
                        if(students[i].stu_id==updateId)
                        {
                        System.out.println("Enter the new student id");
                        students[i].stu_id=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the new name of student");
                        students[i].stu_name=sc.nextLine();
                        System.out.println("Enter the new age");
                        students[i].age=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the new course");
                        students[i].course=sc.nextLine();
                        System.out.println("Enter the marks");
                        students[i].marks=sc.nextDouble();
                        System.out.println("Student updated successfully");
                        update_found=true;
                        break;
                        }
                    }
                    if(!update_found)
                        System.out.println("No record found");break;
                    case 5:
                        System.out.println("Enter the id to be deleted");
                        int delete_id=sc.nextInt();
                        boolean delfound=false;
                        for(int i=0;i<count;i++)
                        {
                            if(delete_id==students[i].stu_id)
                            {
                                for(int j=i;j<count-1;j++)
                                {
                                    students[j]=students[j+1];
                                }
                                System.out.println("Deleted student successfully");
                                delfound=true;
                                students[count-1]=null;
                                count--;
                                break;
                                
                            }
                        }
                        if(!delfound)
                            System.out.println("student not found");
                        break;
                    case 6:
                        System.out.println("Exiting Program...");
                    sc.close();
                    return;
                    default:
                    System.out.println("Invalid choice.");
}}}}