package javaSE.DesignPatterns.Bean;

import javax.swing.*;

public final class Config {
    private String name;

    public  static Config config=null;
    public  static  Config instance(){
        if(config==null){
                config=new Config();
        }
        return config;
    }

}
