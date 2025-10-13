package Dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version de base de donnees");
        double data = 34;
        return data;
    }
}
