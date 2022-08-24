public class Fibinacci {
    public static void main(String[] args) {
        int n = 0, m = 1, fab;
        System.out.print(n + " " + m + " ");
        for (int i = 0; i < 10; i++) {
            fab = n + m;
            System.out.print(fab + " ");
            n = m;
            m = fab;

        }

    }
}
