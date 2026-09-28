package guided;

public class Perulangan {
    public static void main(String[] args) {
        int i;

        // Perulangan for
        for (i = 1; i <= 10; i++) {
            System.out.println(Integer.toString(i));
        }

        // Perulangan while
        i = 1;
        while (i <= 10) {
            System.out.println(Integer.toString(i));
            i++;
        }

        // Perulangan do-while
        i = 1;
        do {
            System.out.println(Integer.toString(i));
            i++;
        } while (i <= 10);
    }
}