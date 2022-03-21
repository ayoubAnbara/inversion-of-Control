package tp_couplage_faible.metier;

import tp_couplage_faible.dao.DaoImpl;

public class IMetierImpl  {

    private DaoImpl dao;

    public double calcul() {
        System.out.println("method invoked: calcul from class: IMetierImpl");
        dao=new DaoImpl();
        double temperature=dao.getData();
        return temperature*300;
    }
}
