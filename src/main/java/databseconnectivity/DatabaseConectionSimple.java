package databseconnectivity;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DatabaseConectionSimple {

    public Properties loadProperties() throws IOException {
        File file = new File("/Users/jahidul/IdeaProjects/mavendemoB2002/src/main/resources/app.properties");
        FileReader fileReader = new FileReader(file);

        // Create a properties object to handle properties inside the properties file
        Properties properties = new Properties();

        // Loaded properties in the system from the properties file
        properties.load(fileReader);

        return properties;

    }

    public void connectDB() throws SQLException, IOException {
        String userName = loadProperties().getProperty("userName.test");
        String password = loadProperties().getProperty("password.test");
        // Where is the DB server
        // jdbc:postgresql://host:port/database
        String url = loadProperties().getProperty("url.test");
        String query = "SELECT actor_id, first_name, last_name, last_update FROM public.actor limit 10";


        Connection connection = DriverManager.getConnection(url,userName,password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        // Process the result
       while(resultSet.next()) {
           /*System.out.println("actor_id: " + resultSet.getString("actor_id")
                   + "first_name: " +resultSet.getString("first_name")
                   + "last_name: " + resultSet.getString("last_name"));*/
           System.out.println(resultSet.getString("actor_id") + "            " +resultSet.getString("first_name") + "            "
                   +  resultSet.getString("last_name"));
       }



    }

}
