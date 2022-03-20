package tpSpringAnnotation.metier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tpSpringAnnotation.dao.IDao;

@Component
public class IMetierImpl implements IMetier {

    /*@Autowired
    @Qualifier("daoImpl")
    private IDao iDao;*/


    private final IDao iDao;

    public IMetierImpl(@Qualifier("daoImpl") IDao iDao) {
        this.iDao = iDao;
    }


    @Override
    public double calcul() {
        System.out.println("method invoked: calcul from class: IMetierImpl");

        double temperature=iDao.getData();
        return temperature*300;
    }
}
