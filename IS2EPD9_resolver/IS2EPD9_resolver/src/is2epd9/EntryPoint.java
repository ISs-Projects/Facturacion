package is2epd9;

import config.ConfigService;
import controlador.ClienteController;
import controlador.ClienteControllerImpl;
import controlador.FacturaController;
import controlador.FacturaControllerImpl;
import java.util.ArrayList;
import java.util.List;
import modelo.ClienteModel;
import modelo.ClienteModelImpl;
import modelo.FacturaModel;
import modelo.FacturaModelImpl;
import modelo.persistencia.ClienteDAO;
import modelo.persistencia.FacturaDAO;
import modelo.persistencia.GenericDAO;
import modelo.persistencia.JDBC.ClienteDAOJDBC;
import modelo.persistencia.JDBC.FacturaDAOJDBC;
import modelo.persistencia.JDBC.Persistencia;
import vista.VistaGlobal;
import vista.cliente.ClienteView;
import vista.cliente.ClienteViewImpl;
import vista.factura.FacturaView;
import vista.factura.FacturaViewImpl;


public class EntryPoint {

    public static void main(String[] args) {
        
        // Construyo dependencias
        ConfigService configService = ConfigService.getInstance();
        Persistencia persistencia = new Persistencia(configService);
        
        ClienteDAO clienteDaoDatabase = new ClienteDAOJDBC(persistencia);
        FacturaDAO facturaDaoDatabase = new FacturaDAOJDBC(persistencia, clienteDaoDatabase);
        
        //Cliente
        ClienteModel clienteModel = new ClienteModelImpl(clienteDaoDatabase);
        FacturaModel facturaModel = new FacturaModelImpl(facturaDaoDatabase);

        
        ClienteView clienteView1 =new ClienteViewImpl();
        List<ClienteView> clienteViews= new ArrayList<ClienteView>();
        clienteViews.add(clienteView1);


        ClienteController clienteController = new ClienteControllerImpl();
        
        clienteController.setup(clienteModel, clienteViews);


        //Factura
        // FacturaModel facturaModel = new FacturaModelImpl(facturaDaoDatabase);


        FacturaView facturaView1 =new FacturaViewImpl();
        List<FacturaView> facturaViews= new ArrayList<FacturaView>();
        facturaViews.add(facturaView1);

        FacturaController facturaController = new FacturaControllerImpl();

        facturaController.setup(facturaModel, facturaViews);
        

        VistaGlobal vista1=new VistaGlobal(clienteView1,facturaView1);
        vista1.display();
        
        
    }
    
}
