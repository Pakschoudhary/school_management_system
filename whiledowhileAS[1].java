public class whiledowhileAS {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 6) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        } while (i <= 6);
    }
}
// First the while program will run by printing 1 to 6 and then do program will run printing as 7 caz i value is increamented to 6 in while