package tp_couplage_faible.dao;

public class DaoImpl {
    public double getData() {
        System.out.println("method invoked: getData from class: DaoImpl. version database");
        // connexion au db
        final double temperature=Math.random()*40;

        return temperature;
    }
}
