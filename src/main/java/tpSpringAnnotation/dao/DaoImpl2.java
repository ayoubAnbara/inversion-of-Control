package tpSpringAnnotation.dao;

import org.springframework.stereotype.Component;

@Component("daoImpl2")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("method invoked: getData from class: DaoImpl2. version capteure");
        return 3050;
    }
}
