package principal;

import java.util.*;
import autobots.*;
import decepticons.*;

/**
 * 
 * @author Felipe Cuevas
 * @see https://www.linkedin.com/in/ffelipecuevasc/
 */
public class Cybertron {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<AutobotPrime> ap = new ArrayList<AutobotPrime>();
        ArrayList<AutobotRegular> ar = new ArrayList<AutobotRegular>();
        ArrayList<DecepticonPrime> dp = new ArrayList<DecepticonPrime>();
        ArrayList<DecepticonRegular> dr = new ArrayList<DecepticonRegular>();
        Integer op = 0;

        do {
            System.out.println("PLANETA CYBERTRON");
            System.out.println("-------------------------------------------");
            System.out.println("1) Construir un Autobot Prime.");
            System.out.println("2) Construir un Autobot Regular.");
            System.out.println("3) Presentar todos los autobots separados.");
            System.out.println("4) Construir un Decepticon Prime.");
            System.out.println("5) Construir un Decepticon Regular.");
            System.out.println("6) Presentar todos los decepticons separados.");
            System.out.println("7) Salir.");
            System.out.println("-------------------------------------------");
            System.out.println("Digite su opción: ");
            op = leer.nextInt();
            leer.nextLine();
            switch (op) {
                case 1:
                    AutobotPrime autobotP = new AutobotPrime(ap);
                    ap.add(autobotP);
                    break;
                case 2:
                    AutobotRegular autobotR = new AutobotRegular();
                    ar.add(autobotR);
                    break;
                case 3:
                    System.out.println("----- Listado de Autobots Prime");
                    for(AutobotPrime aux : ap){
                        aux.presentacion();
                    }
                    System.out.println("----- Listado de Autobots Regulares");
                    for(AutobotRegular aux : ar){
                        aux.presentacion();
                    }
                    break;
                case 4:
                    DecepticonPrime decepticonP = new DecepticonPrime(ap);
                    dp.add(decepticonP);
                    break;
                case 5:
                    DecepticonRegular decepticonR = new DecepticonRegular();
                    dr.add(decepticonR);
                    break;
                case 6:
                    System.out.println("----- Listado de Decepticons Prime");
                    for(DecepticonPrime aux : dp){
                        aux.presentacion();
                    }
                    System.out.println("----- Listado de Decepticons Regulares");
                    for(DecepticonRegular aux : dr){
                        aux.presentacion();
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del menú.");
                    break;
            }
        } while (op != 7);
    }

}
