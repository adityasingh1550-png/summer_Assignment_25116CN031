import java.util.Arrays;
import java.util.Scanner;

class ArrayOperations
{
    int[] arr;
    int size;
    ArrayOperations(int size)
    {
        arr=new int[size];
        this.size=0;
    }
    void createArray(Scanner sc)
    {
        System.out.println("Enter the size of array");
        size=sc.nextInt();
        if(size > arr.length)
{
    System.out.println("Maximum size allowed is " + arr.length);
    return;}
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
    }
    void displayArray() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Array Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void searchElement(Scanner sc) {
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                return;
            }
        }

        System.out.println("Element not found.");
    }

    void insertElement(Scanner sc) {
        if (size == arr.length) {
            System.out.println("Array is full.");
            return;
        }

        System.out.print("Enter position (0 to " + size + "): ");
        int pos = sc.nextInt();

        System.out.print("Enter value: ");
        int value = sc.nextInt();

        if (pos < 0 || pos > size) {
            System.out.println("Invalid position.");
            return;
        }

        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = value;
        size++;

        System.out.println("Element inserted successfully.");
        System.out.println("Updated Array:");
        displayArray();
    }

    void deleteElement(Scanner sc) {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();

        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position.");
            return;
        }

        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        System.out.println("Element deleted successfully.");
        System.out.println("Updated Array:");
        displayArray();
    }

    void updateElement(Scanner sc) {
        System.out.print("Enter index to update: ");
        int index = sc.nextInt();

        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.print("Enter new value: ");
        arr[index] = sc.nextInt();

        System.out.println("Element updated successfully.");
        System.out.println("Updated Array:");
        displayArray();
    }

    void findMaximum() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int max = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Element = " + max);
    }

    void findMinimum() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int min = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum Element = " + min);
    }

    void calculateSum() {
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }

    void calculateAverage() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        double average = (double) sum / size;

        System.out.println("Average = " + average);
    }
    void findSecondLargest() {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
    if (size < 2) {
    System.out.println("Not enough elements");
    return;
    }
        for(int i = 0; i < size; i++) {
        int num = arr[i];

        if(num > first) {
            second = first;
            first = num;
        }
        else if(num > second && num != first) {
            second = num;
        }
    }
        System.out.println("Second largest element "+second);
    }

    int search(Scanner sc) {
        System.out.println("Enter the target to be searched");
        int target=sc.nextInt();
        int[] temp = Arrays.copyOf(arr, size);
        Arrays.sort(temp);
        
        int low = 0, high = size - 1;

        while (low <= high) {
            int mid = low+(high-low) / 2;

            if (temp[mid] == target)
                return mid;
            else if (target<temp[mid])
                high = mid - 1;
            else
                low = mid +1;
        }
        return -1;
    }
    void reverse() {
        int i = 0, j = size - 1;
        int[] temp=Arrays.copyOf(arr,size);
        while (i < j) {
            int temp1 = temp[i];
            temp[i] = temp[j];
            temp[j] = temp1;
            i++;
            j--;
        }

        System.out.println("Reversed Array: ");
        for(int i1=0;i1<size;i1++)
        System.out.print(temp[i1]+" " );
    }
}



public class Array_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        ArrayOperations obj = new ArrayOperations(100);
        do {
            System.out.println("\n===== ARRAY OPERATIONS SYSTEM =====");
            System.out.println("1. Create Array");
            System.out.println("2. Display Array");
            System.out.println("3. Search Element");
            System.out.println("4. Insert Element");
            System.out.println("5. Delete Element");
            System.out.println("6. Update Element");
            System.out.println("7. Find Maximum");
            System.out.println("8. Find Minimum");
            System.out.println("9. Calculate Sum");
            System.out.println("10. Calculate Average");
            System.out.println("11.Find the second Largest Element");
            System.out.println("12.Binary Search(Position of an element)");
            System.out.println("13.Reverse of an array");
            System.out.println("14. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            

            switch (choice) {
                case 1:
                    obj.createArray(sc);
                    break;

                case 2:
                    obj.displayArray();
                    break;

                case 3:
                    obj.searchElement(sc);
                    break;

                case 4:
                    obj.insertElement(sc);
                    break;

                case 5:
                    obj.deleteElement(sc);
                    break;

                case 6:
                    obj.updateElement(sc);
                    break;

                case 7:
                    obj.findMaximum();
                    break;

                case 8:
                    obj.findMinimum();
                    break;

                case 9:
                    obj.calculateSum();
                    break;

                case 10:
                    obj.calculateAverage();
                    break;

                case 11:
                    obj.findSecondLargest();
                    break;
                case 12:
                    int position = obj.search(sc);
                    if(position == -1){
                    System.out.println("Element not found");}
                    else{
                    System.out.println("Element found at position: " +( position+1));}
                    break;
                case 13:
                    obj.reverse();
                    break;

                case 14:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice!=14);

        sc.close();
    }
}