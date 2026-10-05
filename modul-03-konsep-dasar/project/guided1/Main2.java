public class Main2 {
    public static void main(String[] args) {

        Circle lingkaran = new Circle();

        lingkaran.r = 7;

        System.out.println("Jari-jari : " + lingkaran.r);
        System.out.println("Luas      : " + lingkaran.area());
        System.out.println("Keliling  : " + lingkaran.circumference());
    }
}
