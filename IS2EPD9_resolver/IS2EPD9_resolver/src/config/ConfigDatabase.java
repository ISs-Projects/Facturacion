package config;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author mamisho
 */
public class ConfigDatabase {
    
    private Properties propiedades;
    
    public ConfigDatabase() {
        String fileProperties = "config.properties";
        String customFileProperties = System.getProperty("customFile");
        if(customFileProperties != null && !customFileProperties.isEmpty() ) {
            fileProperties = customFileProperties;
        }
        
        propiedades = new Properties();
        try {
            propiedades.load(new FileReader(fileProperties));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUser() {
        return this.propiedades.getProperty("db.user");
    }


    public String getPort() {
        return this.propiedades.getProperty("db.port");
    }


    public String getURLTemplate() {
        return this.propiedades.getProperty("db.urlTemplate");
    }
    
    public String getHost() {
        return this.propiedades.getProperty("db.host");
    }


    public String getPassword() {
        return this.propiedades.getProperty("db.password");
    }
    
    public String getDBName() {
        return this.propiedades.getProperty("db.name");
    }
    
    public String getConnString() {
        String cadenaConexionOriginal = getURLTemplate();
        String[] parametros = {getHost(),getPort(), getDBName()};
        return String.format(cadenaConexionOriginal, parametros);
    }
    
}
