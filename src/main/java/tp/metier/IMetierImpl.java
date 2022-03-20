package tp.metier;

import tp.dao.IDao;

public class IMetierImpl implements IMetier {

    private IDao iDao;

    public void setIDao(IDao iDao) {
        this.iDao = iDao;
    }

    @Override
    public double calcul() {
        System.out.println("method invoked: calcul from class: IMetierImpl");

        double temperature=iDao.getData();
        return temperature*300;
    }
}
