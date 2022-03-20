package tp.dao;

public class DaoImplWebService implements IDao{
    @Override
    public double getData() {
        System.out.println("method invoked: getData from class: DaoImplWebService. version webService");
        // connexion au db
        final double temperature=Math.random()*40+56789;

        return temperature;
    }
}
