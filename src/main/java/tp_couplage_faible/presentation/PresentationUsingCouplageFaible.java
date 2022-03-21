package tp_couplage_faible.presentation;

import tp_couplage_faible.metier.IMetierImpl;

import java.io.File;
import java.util.Scanner;

public class PresentationUsingCouplageFaible {

    public static void main(String[] args) throws Exception {
        IMetierImpl metier = new IMetierImpl();

        double res = metier.calcul();
        System.out.println(res);
    }
}
