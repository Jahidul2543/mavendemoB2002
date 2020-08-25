package javaio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.util.Properties;

public class AppProperties {

    public Properties loadProperties() throws IOException {
        File file = new File("/Users/jahidul/IdeaProjects/mavendemoB2002/src/main/resources/app.properties");
        FileReader fileReader = new FileReader(file);

        // Create a properties object to handle properties inside the properties file
        Properties properties = new Properties();

       // Loaded properties in the system from the properties file
        properties.load(fileReader);

        // Get the properties and use it
/*
        System.out.println("UserName: "+properties.getProperty("userName"));
        System.out.println("Password: " + properties.getProperty("password"));
*/
      return properties;

    }
}
