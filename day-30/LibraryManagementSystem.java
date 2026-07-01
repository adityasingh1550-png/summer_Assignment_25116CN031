import java.io.*;
import java.util.Scanner;

class Book
{
    int book_id;
    String book_name;
    String author_name;
    String category;
    boolean issued;
    Book(int book_id,String book_name,String author_name, String category)
    {
        this.book_id=book_id;
        this.book_name=book_name;
        this.author_name=author_name;
        this.category=category;
        this.issued=false;
    }
    void display()
    {
        System.out.println("Book id: "+book_id);
        System.out.println("Book name: "+book_name);
        System.out.println("Author name: "+ author_name);
        System.out.println("Category: "+category);
        System.out.println("Status: "+(issued?"Issued":"Available"));
    }
    void issue_book()
    {
        if(issued==false)
        {
            issued=true;
            System.out.println("Book issued successfully");
        }
        else
            System.out.println("Book is already issued");
    }
    void returnbook()
    {
        if(issued==true)
        {
            issued=false;
            System.out.println("Book returned successfuly");
        }
        else
            System.out.println("Book not issued");
    }
}
class Library
{
    Book[] books;
    int count;
    Library(int size)
    {
        books=new Book[size];
        count=0;
    }

void addbook(int id,String name,String author,String cat)
{
    if(count<books.length)
    {
        books[count]=new Book(id,name,author,cat);
    count++;
    System.out.println("Book is added successfully");
    }
    else
        System.out.println("Storage is full");
    
}
void displayBooks() {
        if (count == 0) {
            System.out.println("No books available.");
            return;
        }

        for (int i = 0; i < count; i++) {
            books[i].display();
        }
    }

    void searchBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].book_id == id) {
                books[i].display();
                return;
            }
        }
        System.out.println("Book not found.");
    }
    void issueBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].book_id == id) {
                books[i].issue_book();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void returnBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].book_id == id) {
                books[i].returnbook();
                return;
            }
        }
        System.out.println("Book not found.");
    }
    void update(Scanner sc)
    {
        System.out.println("Enter the id to update");
        int id=sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (books[i].book_id == id) {
                System.out.println("Enter the new title");
                String title=sc.nextLine();
                books[i].book_name=title;
                System.out.println("Enter the new author name");
                String author=sc.nextLine();
                books[i].author_name=author;
                System.out.println("Book updated successfully");
                return;
            }
        }
        System.out.println("Book not found.");
    }
    void delete(Scanner sc)
    {
        System.out.println("Enter the id of book to be deleted");
        int id=sc.nextInt();
        boolean found=false;
        for(int i=0;i<count;i++)
        {
            if(books[i].book_id==id)
            {
                for(int j=i;j<count-1;j++)
                {
                    books[j]=books[j+1];
                }
                found=true;
                books[count-1]=null;
                count--;
                System.out.println("Book deleted successfully");
                break;
            }
        }
        if(!found)
            System.out.println("Book  not found");
    }
    void display_available_books()
    {
        if(count==0)
            System.out.println("No book found");
        System.out.println("All available books are:");
        for(int i=0;i<count;i++)
            {
        if(books[i].issued==false)
        {
            books[i].display();
        }
        }

    }
    void display_issued_books()
    {
        if(count==0)
            System.out.println("No book found");
        System.out.println("All issued books are:");
        for(int i=0;i<count;i++)
            {
        if(books[i].issued==true)
        {
            books[i].display();
        }
        }

    }
    void countbooks()
    {
        if(count==0)
            System.out.println("No book found");
        int ca=0;
        int ci=0;
        for(int i=0;i<count;i++)
        {
            if(books[i].issued==true)
                ci++;
            else
                ca++;
        }
        System.out.println("Total books are: "+count);
        System.out.println("Total issued books are "+ci);
        System.out.println("Total available books are: "+ca);
    }
    void sortbooksbyname()
    {
        for(int i=0;i<count-1;i++)
        {
            for(int j=0;j<count-1-i;j++)
            {
                if(books[j].book_name.compareToIgnoreCase(books[j+1].book_name)>0)
                {
                    Book temp=books[j];
                    books[j]=books[j+1];
                    books[j+1]=temp;
                }
            }
        }
        System.out.println("Books sorted by name successfully");
        for(int i=0;i<count;i++)
        {
            books[i].display();
            System.out.println("--------------");
        }
    }
    void sort_bookbyid()
    {
        for(int i=0;i<count-1;i++)
        {
            for(int j=0;j<count-1-i;j++)
            {
                if(books[j].book_id>books[j+1].book_id)
                {
                    Book temp=books[j];
                    books[j]=books[j+1];
                    books[j+1]=temp;
                }
            }
        }
        System.out.println("Books sorted by book id are:");
        for(int i=0;i<count;i++)
        {
            books[i].display();
            System.out.println("--------------");
        }
    }
    void saveToFile()
{
    try
    {
        PrintWriter pw = new PrintWriter(new FileWriter("books.txt"));

        for(int i = 0; i < count; i++)
        {
            pw.println(
                books[i].book_id + "," +
                books[i].book_name + "," +
                books[i].author_name + "," +
                books[i].category + "," +
                books[i].issued
            );
        }

        pw.close();
        System.out.println("Data saved successfully.");
    }
    catch(IOException e)
    {
        System.out.println("Error saving file.");
    }
}
void loadFromFile()
{
    try
    {
        BufferedReader br = new BufferedReader(new FileReader("books.txt"));

        count = 0;
        String line;

        while((line = br.readLine()) != null && count < books.length)
        {
            String[] data = line.split(",");

            books[count] = new Book(
                Integer.parseInt(data[0]),
                data[1],
                data[2],
                data[3]
            );

            books[count].issued = Boolean.parseBoolean(data[4]);

            count++;
        }

        br.close();
        System.out.println("Data loaded successfully.");
    }
    catch(IOException e)
    {
        System.out.println("Error loading file.");
    }
}

}
public class LibraryManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum number of books to be added: ");
        int size = sc.nextInt();
        sc.nextLine();
        Library library=new Library(size);
        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6.Update Book");
            System.out.println("7.Delete the book");
            System.out.println("8.Display available books");
            System.out.println("9.Display issued books");
            System.out.println("10.Count books");
            System.out.println("11.Sort Books By Name");
            System.out.println("12.Sort Books By ID");
            System.out.println("13.Save To File");
            System.out.println("14.Load From File");
            System.out.println("15. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    System.out.print("Enter the category: ");
                    String category=sc.nextLine();
                    library.addbook(id, name, author,category);
                    break;

                case 2:
                    library.displayBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    id = sc.nextInt();
                    library.searchBook(id);
                    break;

                case 4:
                    System.out.print("Enter Book ID to issue: ");
                    id = sc.nextInt();
                    library.issueBook(id);
                    break;

                case 5:
                    System.out.print("Enter Book ID to return: ");
                    id = sc.nextInt();
                    library.returnBook(id);
                    break;
                
                case 6:
                    library.update(sc);
                    break;
                case 7:
                    library.delete(sc);
                    break;
                case 8:
                    library.display_available_books();
                    break;
                case 9:
                    library.display_issued_books();
                    break;

                case 10:
                    library.countbooks();
                    break;

                case 11:
                    library.sortbooksbyname();
                    break;

                case 12:
                    library.sort_bookbyid();
                    break;

                case 13:
                    library.saveToFile();
                    break;

                case 14:
                    library.loadFromFile();
                    break;
                case 15:
                    library.saveToFile();
                    System.out.println("Thank you for using Library Management System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 15);

        sc.close();
    }
}
    