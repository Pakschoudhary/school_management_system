public class switchelseif {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        // ifelse
        if (num1 < num2) {
            System.out.println("larger");
        } else if (num1 == num2) {
            System.out.println("equal");
        } else {
            System.out.println("smaller");
        }
//Switch case
        String val;
        String car;
        Scanner a = new Scanner(System.in);
        String val = a.next();
        switch (val) {
            case "monday":
                System.out.println("1 switch case");
                break;
            case "tuesday":
                System.out.println("2 switch case");
                break;
            case "Wednesday":
                System.out.println("3 switch case");
                break;
            case "Thursday":
                System.out.println("4 switch case");
                break;
            case "Friday":
                System.out.println("5 switch case");
            case "Saturday":
                System.out.println("6 switch case");
            default:
                System.out.println("Error");

        }
    }
       
}
//In switch case the conditions are checked according to the condition given by the user
// In elseif/ifelse statements it will check the condition previously given and execute according to it