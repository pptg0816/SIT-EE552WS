import java.util.Arrays;
import java.util.Scanner;

public class IDLList_E_Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Creating object of linkedList */
        IDLList<Object> list = new IDLList<>();
        System.out.println("Doubly Linked List Test\n");
        char ch;
        /* Perform list operations */
        do {
            System.out.println("\nDouble_Linked List Operations\n");

            System.out.println("1. insert at beginning");

            System.out.println("2. insert at tail");

            System.out.println("3. insert at position");

            System.out.println("4. remove at position");

            System.out.println("5. remove the first certain element");

            System.out.println("6. get size");

            int choice = scan.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Enter integer element to insert");

                    list.add(scan.nextInt());

                    break;

                case 2:

                    System.out.println("Enter integer element to insert");

                    list.append(scan.nextInt());

                    break;

                case 3:

                    System.out.println("Enter integer element to insert");

                    int num = scan.nextInt();

                    System.out.println("Enter position");

                    int pos = scan.nextInt();

                    if (pos < 1 || pos > list.size())

                        System.out.println("Invalid position\n");

                    else

                        list.add(num, pos);

                    break;

                case 4:

                    System.out.println("Enter position");

                    int p = scan.nextInt();

                    if (p < 1 || p > list.size())

                        System.out.println("Invalid position\n");

                    else

                        list.removeAt(p);

                    break;

                case 5:

                    System.out.println("Enter certain element to be removed");

                    list.remove(scan.nextInt());

                    break;

                case 6:

                    System.out.println("Size = " + list.size() + " \n");

                    break;

                default:

                    System.out.println("Wrong Entry \n ");

                    break;

            }

            /* Display List */

            System.out.println(list.mytoString());

            System.out.println("\nDo you want to continue (Type y or n) \n");

            ch = scan.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');

    }

}

