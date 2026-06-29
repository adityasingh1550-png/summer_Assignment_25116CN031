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
}
public class LibraryManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum number of books: ");
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
            System.out.println("6. Exit");
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
                    System.out.println("Thank you for using Library Management System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
    