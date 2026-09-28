package guided;

public class Angka {
    public static void main(String[] args) {
        int i;

        // 1. Menggunakan Perulangan FOR
        System.out.println("--- Perulangan FOR ---");
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 2. Menggunakan Perulangan WHILE
        System.out.println("\n--- Perulangan WHILE ---");
        i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // 3. Menggunakan Perulangan DO-WHILE
        System.out.println("\n--- Perulangan DO-WHILE ---");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}