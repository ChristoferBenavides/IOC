package persistencia;

import principal.GestorMercatsException;
import model.Mercat;

/**
 *
 * @author fta
 */
public class GestorPersistencia {

    private ProveedorPersistencia gestor;

    public ProveedorPersistencia getGestor() {
        return gestor;
    }

    public void setGestor(GestorXML pGestor) {
        gestor = pGestor;
    }

    public void desarMercat(String tipusPersistencia, String nomFitxer, Mercat mercat) throws GestorMercatsException {

        if (tipusPersistencia.equals("XML")) {
            gestor = new GestorXML();
        } else {//JDBC
            gestor = new GestorJDBC();
        }

        gestor.desarMercat(nomFitxer, mercat);
    }

    public void carregarMercat(String tipusPersistencia, String nomFitxer) throws GestorMercatsException {

        if (tipusPersistencia.equals("XML")) {
            gestor = new GestorXML();
        } else {//JDBC
            gestor = new GestorJDBC();
        }
        gestor.carregarMercat(nomFitxer);

    }
}
