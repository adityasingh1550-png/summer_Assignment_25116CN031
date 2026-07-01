import java.io.*;
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
            System.out.println("6.Display topper of class");
            System.out.println("7.Average marks");
            System.out.println("8.Search By Name");
            System.out.println("9.Sort by Marks");
            System.out.println("10.Sort by name");
            System.out.println("11.Save Data To File");
            System.out.println("12.Load Data From File");
            System.out.println("13.Exit");
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
                        if(count == 0)
                        {
                        System.out.println("No records found");
                        break;
                        }
                        double max = students[0].marks;
                        int index = 0;

                        for(int i=1;i<count;i++) {
                        if(students[i].marks > max) {
                        max = students[i].marks;
                        index = i;
                        }}
                        System.out.println("Topper of the class: ");
                        System.out.println("ID: " + students[index].stu_id);
                        System.out.println("Name: " + students[index].stu_name);
                        System.out.println("Marks: " + students[index].marks);
                    break;
                    case 7:
                        if(count == 0)
                        {
                        System.out.println("No records found");
                        break;
                        }
                        double sum = 0;
                        for(int i=0;i<count;i++){
                        sum += students[i].marks;}
                        System.out.println("Average Marks = " + sum/count);
                    break;

                    case 8:
                        boolean found1=false;
                        System.out.println("Enter the name to search");
                        sc.nextLine();
                        String name=sc.nextLine();
                        for(int i=0;i<count;i++)
                        {
                            if(name.equalsIgnoreCase(students[i].stu_name))
                            {
                                System.out.println("ID: " + students[i].stu_id);
                                System.out.println("Name: " + students[i].stu_name);
                                System.out.println("Age: " + students[i].age);
                                System.out.println("Course: " + students[i].course);
                                System.out.println("Marks: " + students[i].marks);
                                found1 = true;
                                break;
                            }
                        }
                        if(!found1)
                            System.out.println("Student not found in records");
                    break;
                    case 9:
                    for(int i = 0; i < count - 1; i++) {
                    for(int j = 0; j < count - 1 - i; j++) {
                    if(students[j].marks > students[j + 1].marks) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    }
                    }
                    }
                    System.out.println("Students sorted by marks successfully.");
                    for(int i = 0; i < count; i++) {
                    System.out.println("ID: " + students[i].stu_id);
                    System.out.println("Name: " + students[i].stu_name);
                    System.out.println("Marks: " + students[i].marks);
                    System.out.println("------------------");
                    }
                    break;
                    case 10:
                        for(int i = 0; i < count - 1; i++) {
                        for(int j = 0; j < count - 1 - i; j++) {
                        if(students[j].stu_name.compareToIgnoreCase(students[j + 1].stu_name) > 0) {
                        Student temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                        }
                        }
                        }

                    System.out.println("Students sorted by name successfully.");

                    for(int i = 0; i < count; i++) {
                    System.out.println("ID: " + students[i].stu_id);
                    System.out.println("Name: " + students[i].stu_name);
                    System.out.println("Age: " + students[i].age);
                    System.out.println("Course: " + students[i].course);
                    System.out.println("Marks: " + students[i].marks);
                    System.out.println("----------------------");
                    }
                    break;
                    case 11:
                        try {
                        PrintWriter pw = new PrintWriter(new FileWriter("students.txt"));

                        for(int i = 0; i < count; i++) {
                        pw.println(
                        students[i].stu_id + "," +
                        students[i].stu_name + "," +
                        students[i].age + "," +
                        students[i].course + "," +
                        students[i].marks);
                        }

                        pw.close();
                        System.out.println("Data saved successfully.");

                        } catch(IOException e) {
                        System.out.println("Error saving file.");
                        }
                        break;
                    case 12:
                        try {
                        BufferedReader br = new BufferedReader(new FileReader("students.txt"));

                        count = 0;
                        String line;

                        while((line = br.readLine()) != null && count < n) {

                        String[] data = line.split(",");

                        students[count] = new Student();

                        students[count].stu_id = Integer.parseInt(data[0]);
                        students[count].stu_name = data[1];
                        students[count].age = Integer.parseInt(data[2]);
                        students[count].course = data[3];
                        students[count].marks = Double.parseDouble(data[4]);

                        count++;
                        }

                        br.close();
                        System.out.println("Data loaded successfully.");

                        } catch(IOException e) {
                        System.out.println("Error loading file.");
                        }
                    break;
                        
                    case 13:
                    try {
                    PrintWriter pw = new PrintWriter(new FileWriter("students.txt"));

                    for(int i = 0; i < count; i++) {
                    pw.println(
                    students[i].stu_id + "," +
                    students[i].stu_name + "," +
                    students[i].age + "," +
                    students[i].course + "," +
                    students[i].marks
                    );
                    }

                    pw.close();
                    } catch(IOException e) {
                    System.out.println("Error saving file.");
                    }

                    System.out.println("Exiting Program...");
                    sc.close();
                    return;
}}}}