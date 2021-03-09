import java.util.Scanner;

public class switchcode {
    public static void main(String[] args) {

        String car;
        Scanner a = new Scanner(System.in);
        String val = a.next();
        switch (val) {
            case "monday":
                System.out.println("Ride on BMW for drive");
                break;
            case "tuesday":
                System.out.println("Ride on Volvo for drive");
                break;
            case "Wednesday":
                System.out.println("Ride on Bently for drive");
                break;
            case "Thursday":
                System.out.println("Ride on Porsche for drive");
                break;
            case "Friday":
                System.out.println("Ride on Lamborghini for drive");
            case "Saturday":
                System.out.println("Ride a E-class for drive");
            default:
                System.out.println("Sit in Home and rest");

        }
    }
}
