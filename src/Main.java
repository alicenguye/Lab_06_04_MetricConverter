import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaration of variable
        int meters=0;
        double miles=0;
        double feet=0;
        double inches=0;
        String trash="";
        //create new scanner
        Scanner in =new Scanner(System.in);
        //output ask user to enter data
        System.out.println("Please enter a measurement in meter:");
        if(in.hasNextInt()){
            meters = in.nextInt();
            in.nextLine(); // clear the buffer
        }else{
            trash = in.nextLine();
            System.out.println("Must enter a valid number for measurement: "+" "+ trash);
        }
        //calculation
        miles = meters / 1609.344;
        feet = meters / 0.3048;
        inches = meters / 0.0254;
        //display the output for user
        System.out.println("the measurement in miles is: "+ miles);
        System.out.println("the measurement in feet is: "+ feet);
        System.out.println("the measurement in inches is: "+ inches);
    }
}