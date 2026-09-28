package guided;

public class Operator {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int jumlah = a + b;
        int sisaBagi = a % b;

        a++;
        b--;

        jumlah += 5;

        boolean apakahLebihBesar = a > b;
        boolean apakahSama = a == b;

        boolean logikaAnd = (a > 5) && (b < 5);
        boolean logikaNegasi = !apakahSama;

        System.out.println("Aritmatika (10 + 3) : " + (a + b - 1));
        System.out.println("Sisa Bagi (10 % 3)  : " + sisaBagi);
        System.out.println("Shortcut (13 + 5)   : " + jumlah);
        System.out.println("Relasional (a > b)  : " + apakahLebihBesar);
        System.out.println("Kondisional (&&)    : " + logikaAnd);
        System.out.println("Negasi (!)          : " + logikaNegasi);
    }
}