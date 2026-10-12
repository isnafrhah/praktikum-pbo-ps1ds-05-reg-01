package main;

import hargatoken.HargaToken;
import hargapulsa.HargaPulsa;

public class Main {
    public static void main(String[] args) {
        HargaToken objectToken = new HargaToken();
        objectToken.info();

        HargaPulsa objectPulsa = new HargaPulsa();
        objectPulsa.info();
    }
}
