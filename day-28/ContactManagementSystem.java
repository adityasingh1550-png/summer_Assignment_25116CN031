import java.util.Scanner;

class Contact
{
    int contactId;
    String name;
    String phoneNumber;
    String email;
    String address;
    boolean favourite;
    Contact(int contactId,String name,String phoneNumber,String email,String address)
    {
        this.contactId=contactId;
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.address=address;
        this.favourite=false;
    }
    void displayContact()
    {
        System.out.println("=================");
        System.out.println("Contact Details");
        System.out.println("=================");
        System.out.println("Contact Id: "+contactId);
        System.out.println("Name: "+name);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Email: "+email);
        System.out.println("Address: "+address);
        System.out.println("Favorite: " + (favourite ? "Yes" : "No"));
    }}
    public class ContactManagementSystem {

    static Contact[] contacts = new Contact[100];
    static int count = 0;

    static void addContact(Scanner sc) {

        System.out.print("Enter Contact ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        contacts[count] = new Contact(id, name, phone, email, address);
        count++;

        System.out.println("Contact Added Successfully.");
    }
        static void viewContacts() {

        if (count == 0) {
            System.out.println("No Contacts Available.");
            return;
        }

        for (int i = 0; i < count; i++) {
            contacts[i].displayContact();
            System.out.println();
        }
    }

    static void searchContact(Scanner sc) {

        System.out.print("Enter Contact ID to Search: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (contacts[i].contactId == id) {
                contacts[i].displayContact();
                return;
            }
        }

        System.out.println("Contact Not Found.");
    }

    static void updateContact(Scanner sc) {

        System.out.print("Enter Contact ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {

            if (contacts[i].contactId == id) {

                System.out.print("Enter New Name: ");
                contacts[i].name = sc.nextLine();

                System.out.print("Enter New Phone Number: ");
                contacts[i].phoneNumber = sc.nextLine();

                System.out.print("Enter New Email: ");
                contacts[i].email = sc.nextLine();

                System.out.print("Enter New Address: ");
                contacts[i].address = sc.nextLine();

                System.out.println("Contact Updated Successfully.");
                return;
            }
        }

        System.out.println("Contact Not Found.");
    }

    static void deleteContact(Scanner sc) {

        System.out.print("Enter Contact ID to Delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (contacts[i].contactId == id) {

                for (int j = i; j < count - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }

                contacts[count - 1] = null;
                count--;

                System.out.println("Contact Deleted Successfully.");
                return;
            }
        }

        System.out.println("Contact Not Found.");
    }

    static void totalContacts() {
        System.out.println("Total Contacts = " + count);
    }
    static void sortContactsByName()
{
    if(count == 0)
    {
        System.out.println("No Contacts Available.");
        return;
    }

    for(int i = 0; i < count - 1; i++)
    {
        for(int j = 0; j < count - i - 1; j++)
        {
            if(contacts[j].name.compareToIgnoreCase(contacts[j + 1].name) > 0)
            {
                Contact temp = contacts[j];
                contacts[j] = contacts[j + 1];
                contacts[j + 1] = temp;
            }
        }
    }

    System.out.println("Contacts Sorted Successfully.");

    for(int i = 0; i < count; i++)
    {
        contacts[i].displayContact();
        System.out.println();
    }
}
static void markFavorite(Scanner sc)
{
    System.out.print("Enter Contact ID: ");
    int id = sc.nextInt();

    for(int i=0;i<count;i++)
    {
        if(contacts[i].contactId == id)
        {
            contacts[i].favourite = true;
            System.out.println("Contact marked as Favorite.");
            return;
        }
    }

    System.out.println("Contact Not Found.");
}
static void viewFavoriteContacts()
{
    boolean found = false;

    for(int i=0;i<count;i++)
    {
        if(contacts[i].favourite)
        {
            contacts[i].displayContact();
            System.out.println();
            found = true;
        }
    }

    if(!found)
    {
        System.out.println("No Favorite Contacts Found.");
    }
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Total Contacts");
            System.out.println("7. Sort Contacts By Name");
            System.out.println("8. Mark Favorite Contact");
            System.out.println("9. View Favorite Contacts");
            System.out.println("10. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addContact(sc);
                    break;

                case 2:
                    viewContacts();
                    break;

                case 3:
                    searchContact(sc);
                    break;

                case 4:
                    updateContact(sc);
                    break;

                case 5:
                    deleteContact(sc);
                    break;

                case 6:
                    totalContacts();
                    break;
                case 7:
                    sortContactsByName();
                    break;
                
                case 8:
                markFavorite(sc);
                break;

                case 9:
                viewFavoriteContacts();
                break;
                case 10:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice !=10);

        sc.close();
    }
}