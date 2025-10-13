package Metier;

import Dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;
    @Override
    public double calcul() {
        double data=dao.getData();
        double res=data*11.4;
        return res;

    }

    /**
     * pour prmettre d'injecter dans la variable Dao
     * un objet d'une classe qui implimente  l'interface IDao
     * @param dao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
