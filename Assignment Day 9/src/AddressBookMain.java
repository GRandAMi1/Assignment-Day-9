import java.util.Objects;
import java.util.Scanner;

public class AddressBookMain {
    static AddressBookMain obj = new AddressBookMain();
    public static String Fname;
    public static int row=2,column=8;
    //    public static String [][] addBook= new String[row][column];
    public static String[] index={"First Name","Last Name","Address","City","State","Zip Code","Mobile Number","Email ID"};
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter How many Members' details you want to Enter : ");
        row = scanner.nextInt();
        String [][] addBook= new String[row][column];
        System.out.println();

        obj.UserInput(addBook);
        System.out.println("Your Data has been Successfully saved in memory\nTo Display your data Press Y or N to Exit : ");
        char yn=scanner.next().charAt(0);
        if (Character.toLowerCase(yn)=='y') {
            Display(addBook);
        }

        Edit(addBook);
        Display(addBook);
        System.out.println("Do you want to Edit more Details (Y/N) : ");
        char temp = scanner.next().charAt(0);
        if (Character.toLowerCase(temp)=='y'){
            Edit(addBook);
        }
    }


    public void UserInput(String[][] addBook){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter your " + index[j] + " : ");
                addBook[i][j]=scanner.next();
            }
            System.out.println("\nNext Member Details");

        }

    }

    public static void Display(String[][] addBook){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(addBook[i][j]+" |");
            }
            System.out.println();

        }
    }

    public static void Edit(String[][] addBook){
        System.out.println("Enter First Name of person to Edit Details : ");
        Fname=scanner.next();
        int i=0;
        while (!Objects.equals(addBook[i][0], Fname)){
            i++;
        }
        System.out.println("Enter Which Detail you want to change\n0.First Name, 1.Last Name, 2.Address, 3.City, \n4.State, 5.Zip Code, 6.Mobile Number, 7.Email ID");
        int j = scanner.nextInt();
        System.out.println("Enter New "+ index[j]+ ": ");
        addBook[i][j]=scanner.next();
    }
}