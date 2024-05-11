package modelo.persistencia;

import java.util.List;
import modelo.entidades.Factura;

/**
 *
 * @author IS2: Norberto Díaz-Díaz, Roberto Ruiz
 */
public interface FacturaDAO extends GenericDAO<Factura> {
    public List<Factura> listByCliente(String dni);
}
