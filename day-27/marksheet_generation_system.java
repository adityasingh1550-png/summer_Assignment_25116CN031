import java.util.Scanner;

class Student
{
    int roll_number;
    String student_name="";
    int marks1=0;
    int marks2;
    int marks3;
    int marks4;
    int marks5;
    int total_marks;
    double percentage;
    String grade;
    String result="";
    Student(int roll_number,String student_name,int marks1,int marks2,int marks3,int marks4,int marks5)
    {
        this.roll_number=roll_number;
        this.student_name=student_name;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
        this.marks4=marks4;
        this.marks5=marks5;
        calculate_result();
    }
    void calculate_result()
    {
        total_marks=marks1+marks2+marks3+marks4+marks5;
        percentage=total_marks/5.0;
        if(marks1<33||marks2<33||marks3<33||marks4<33||marks5<33)
        {
            result= "FAIL";
            grade="F";
            return;
        }
        else
            result="PASS";
        if(percentage>=90)
            grade="A+";
        else if(percentage>=80)
            grade="B+";
        else if(percentage>=70)
            grade="C+";
        else if(percentage>=60)
            grade="D";
        else
            grade="E";
    }
    void display()
    {
        System.out.println("--------------------");
        System.out.println("       Marksheet     " );
        System.out.println("--------------------");
        System.out.println("Roll No: "+roll_number);
        System.out.println("Name  : "+student_name);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Maths        : "+marks1);
        System.out.println("Science      : "+marks2);
        System.out.println("English      : "+marks3);
        System.out.println("Computer     : "+marks4);
        System.out.println("Hindi         : "+marks5);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Total         : "+total_marks);
        System.out.println("Percentage    : "+percentage+"%");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Grade        : "+grade);
        System.out.println("Result       : "+result);
        System.out.println("--------------------");
    }
    }

public class marksheet_generation_system
{
    static Student[] students;
    static int count=0;
    static Scanner sc=new Scanner(System.in);
    public static void add_student()
    {
        if(count>=students.length)
        {
            System.out.println("Student storage is full");
            return;
        }
        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter subject 1 Marks: ");
        int s1 = sc.nextInt();

        System.out.print("Enter subject 2 Marks: ");
        int s2 = sc.nextInt();

        System.out.print("Enter subject 3 Marks: ");
        int s3 = sc.nextInt();

        System.out.print("Enter subject 4 Marks: ");
        int s4 = sc.nextInt();

        System.out.print("Enter subject 5 Marks: ");
        int s5 = sc.nextInt();
        students[count]=new Student(rollNo,name,s1,s2,s3,s4,s5);
        
        count++;
        System.out.println("Student added successfully");
    }
    public static void displayall()
    {
        if (count == 0) {
            System.out.println("No student records found.");
            return;
        }
        for(int i=0;i<count;i++)
            students[i].display();
    }
    public static void searchStudent() {
        System.out.print("Enter Roll Number to search: ");
        int roll=sc.nextInt();
        for (int i = 0; i < count; i++) {

            if (students[i].roll_number == roll) {
                students[i].display();
                return;
            }
        }

        System.out.println("Student not found.");
    }
    public static void updateMarks() {

        System.out.print("Enter Roll Number to update: ");
        int roll = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (students[i].roll_number == roll) {

                System.out.print("Enter New subject 1 Marks: ");
                students[i].marks1 = sc.nextInt();

                System.out.print("Enter New subject 2 Marks: ");
                students[i].marks2 = sc.nextInt();

                System.out.print("Enter New subject 3 Marks: ");
                students[i].marks3 = sc.nextInt();

                System.out.print("Enter New subject 4 Marks: ");
                students[i].marks4 = sc.nextInt();

                System.out.print("Enter New subject 5 Marks: ");
                students[i].marks5 = sc.nextInt();
                students[i].calculate_result();
                System.out.println("Marks updated successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
    public static void deleteStudent() {

        System.out.print("Enter Roll Number to delete: ");
        int roll = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (students[i].roll_number == roll) {

                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[count - 1] = null;
                count--;

                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    public static void highestPercentageStudent() {

        if (count == 0) {
            System.out.println("No student records found.");
            return;
        }

        Student topper = students[0];

        for (int i = 1; i < count; i++) {

            if (students[i].percentage > topper.percentage) {
                topper = students[i];
            }
        }

        System.out.println("\nTopper Details:");
        topper.display();
    }
    public static void averagePercentage() {

        if (count == 0) {
            System.out.println("No student records found.");
            return;
        }

        double totalPercentage = 0;

        for (int i = 0; i < count; i++) {
            totalPercentage += students[i].percentage;
        }

        System.out.println("Average Percentage: "+ (totalPercentage / count));
    }

    public static void displayFailedStudents() {

        if (count == 0) {
            System.out.println("No student records found.");
            return;
        }

        boolean found = false;

        System.out.println("\nFailed Students:");

        for (int i = 0; i < count; i++) {

            if (students[i].result.equals("FAIL")) {
                students[i].display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No failed students.");
        }
    }

    public static void main(String[] args) {

        System.out.print(
                "Enter maximum number of students: ");
        int n = sc.nextInt();

        students = new Student[n];

        while (true) {

            System.out.println(
                    "\n===== MARKSHEET GENERATION SYSTEM =====");

            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Highest Percentage Student");
            System.out.println("7. Average Percentage");
            System.out.println("8. Display Failed Students");
            System.out.println("9. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    add_student();
                    break;

                case 2:
                    displayall();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateMarks();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    highestPercentageStudent();
                    break;

                case 7:
                    averagePercentage();
                    break;

                case 8:
                    displayFailedStudents();
                    break;

                case 9:
                    System.out.println("Exiting Program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
