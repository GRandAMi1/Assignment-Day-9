import java.util.Arrays;
import java.util.Scanner;

public class AddressBookMain {
    public static int row=1,column=8;
    public static String [][] addBook= new String[row][column];
    public static String[] index={"First Name","Last Name","Address","City","State","Zip Code","Mobile Number","Email ID"};
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        UserInput();
        System.out.println("Your Data has been Successfully saved in memory\nTo Display your data Press Y or N to Exit : ");
        char yn=scanner.next().charAt(0);
        if (Character.toLowerCase(yn)=='y') {
            Display();
        }
        else {

        }
    }

    public static void UserInput(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter your " + index[j] + " : ");
                addBook[i][j]=scanner.nextLine();
            }
            System.out.println();

        }

    }

    public static void Display(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(addBook[i][j]+" |");
            }
            System.out.println();

        }
    }
}
