package tp.presentation;

import tp.dao.IDao;
import tp.metier.IMetierImpl;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationUsingInstantiationDynamic {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);

        IDao iDao = (IDao) cDao.newInstance();


        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetierImpl metier = (IMetierImpl) cMetier.newInstance();

        Method method = cMetier.getMethod("setIDao", IDao.class);
        method.invoke(metier, iDao);

        double res = metier.calcul();
        System.out.println(res);
    }
}
