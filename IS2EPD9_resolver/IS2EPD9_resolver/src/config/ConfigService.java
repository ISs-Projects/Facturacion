/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

/**
 *
 * @author mamisho
 */
public class ConfigService {
    private ConfigDatabase configDatabse;
    
    private static ConfigService instance;
    
    private ConfigService() {
        this.configDatabse = new ConfigDatabase();
    }
    
    public static ConfigService getInstance() {
        ConfigService configService = null;
        if(instance == null) {
            configService = new ConfigService();
        } else {
            configService = instance;
        }
        return configService;
    }
    
    public ConfigDatabase getDBConfig() {
        return configDatabse;
    }
}
