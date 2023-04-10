package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.io.IOException;



public class PropertyReader {

    public Properties prop;

    // get the file path
    File file = new File("src/main/resources/Configuration.properties");

    // Read the content of the file
    FileInputStream fis = new FileInputStream(file);

    public PropertyReader () throws IOException{
        prop = new Properties();
       prop.load(fis);
    }
    //PropertyReader () throws FileNotFoundException{


    public String getHubUrl(){
        return prop.getProperty("HubUrl");
    }

    public String getUserName(){
        return prop.getProperty("UserName");
    }
    public String getPassWord(){
        return prop.getProperty("PassWord");
    }

    }

