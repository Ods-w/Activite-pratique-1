package Presentation;

import Dao.DaoImpl;
import Metier.MetierImpl;

import ext.DaoImpl2;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl (); //instonciation statique
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao); // injection des dependonces
        System.out.println("RES="+metier.calcul());
    }
}
