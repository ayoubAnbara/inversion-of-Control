package tp.presentation;

import tp.dao.DaoImpl;
import tp.dao.IDao;
import tp.metier.IMetierImpl;

public class PresentationUsingInstantiationStatic {

    public static void main(String[] args) {
        IDao iDao=new DaoImpl();

        IMetierImpl metier=new IMetierImpl();
        metier.setIDao(iDao);

        double res=metier.calcul();
        System.out.println(res);
    }
}
