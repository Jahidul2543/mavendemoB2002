package databseconnectivity;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBDataConsumer {
    static DBUtilities dbUtilities;

    static {
        try {
            dbUtilities = new DBUtilities();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws IOException, SQLException {
       // getActorsInfo();
        //getAdresses();
        getActorsFirstNameFromDB();
        getExpectedListOfActors();
    }

    public static void getActorsInfo() throws IOException, SQLException {
        String query = "SELECT actor_id, first_name, last_name FROM public.actor limit 10";
        dbUtilities.processResultSet(query,"actor_id","first_name", "last_name" );
    }

    public static void getAdresses() throws IOException, SQLException {
        String query = "SELECT address, district, postal_code, phone\n" +
                "\tFROM public.address limit 10";
        dbUtilities.processResultSet(query,"address","district","phone" );
    }

    public static List getActorsFirstNameFromDB() throws IOException, SQLException {
        String query = "SELECT first_name FROM public.actor limit 10";
       ResultSet resultSet = dbUtilities.executeSelectQuery(query);
        List<String> actorsFirstNameListFromDB = new ArrayList<>();

       while (resultSet.next()){
           actorsFirstNameListFromDB.add(resultSet.getString("first_name"));

       }

       //actorsFirstNameListFromDB.forEach(str-> System.out.println(str));

       return actorsFirstNameListFromDB;
    }

    public static List getExpectedListOfActors(){
        List<String> expectedFirstNameOfActors = new ArrayList<>();
        expectedFirstNameOfActors.add("Penelope");
        expectedFirstNameOfActors.add("Nick");
        expectedFirstNameOfActors.add("Ed");
        expectedFirstNameOfActors.add("Jennifer");
        expectedFirstNameOfActors.add("Johnny");
        expectedFirstNameOfActors.add("Bette");
        expectedFirstNameOfActors.add("Grace");
        expectedFirstNameOfActors.add("Matthew");
        expectedFirstNameOfActors.add("Joe");
        expectedFirstNameOfActors.add("Christian");

       // expectedFirstNameOfActors.forEach(str -> System.out.println(str));

      return expectedFirstNameOfActors;
    }
}
