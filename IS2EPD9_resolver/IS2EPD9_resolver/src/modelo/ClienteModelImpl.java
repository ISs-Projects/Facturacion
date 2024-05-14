/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import modelo.entidades.Cliente;
import controlador.ClienteController;
import modelo.persistencia.ClienteDAO;
import modelo.persistencia.GenericDAO;
import modelo.persistencia.JDBC.ClienteDAOJDBC;

/**
 *
 * @author Norberto Díaz-Díaz
 */
public class ClienteModelImpl extends AbstractModelImpl<ClienteController,Cliente,String> implements ClienteModel {
    
    private final ClienteDAO clienteDao;
    
    public ClienteModelImpl(ClienteDAO clienteDao) {
        this.clienteDao = clienteDao;
    }

    protected GenericDAO obtenerImplementacionDAO(){
        // return new ClienteDAOJDBC();
        //return new ClienteDAOJPA();
        return clienteDao;
    }

}
