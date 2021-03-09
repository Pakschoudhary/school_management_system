public class CastingAS {
    public static void main(String[] args) {
        float f = 170.5f;
        float g = 60.15f;

        long l = (long) f;
        int i = (int) l;
        long L = (long) g;
        int I= (int) L;
        System.out.println(l);
        System.out.println(L);

    }
}
