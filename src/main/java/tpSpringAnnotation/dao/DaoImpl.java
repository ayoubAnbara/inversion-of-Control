package tpSpringAnnotation.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("daoImpl")
//@Primary
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("method invoked: getData from class: DaoImpl. version database");
        // connexion au db
        final double temperature=Math.random()*40;

        return temperature;
    }
}
