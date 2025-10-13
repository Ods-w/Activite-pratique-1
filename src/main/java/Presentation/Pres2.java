package Presentation;

import Dao.IDao;
import Metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;


public class Pres2 {
    public static void main(String[] args) throws Exception {
        //DaoImpl dao = new DaoImpl (); //instonciation dinamique
        Scanner scanner;
        try {
            scanner = new Scanner(new File("config.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String daoClassName = scanner.nextLine();
        System.out.println("daoClassName="+daoClassName);
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao) cDao.getConstructor().newInstance(); // new constructeure ->DaoImpl
        System.out.println(dao.getData());


       //MetierImpl metier = new MetierImpl();
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

        //metier.setDao(dao);
        Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier, dao); // injection des dépendances dynamique
        System.out.println("RES="+metier.calcul());
    }
}
