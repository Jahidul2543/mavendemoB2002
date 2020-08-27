package databsetesting;

import databseconnectivity.DBDataConsumer;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabseTestingSample {

    DBDataConsumer dbDataConsumer = new DBDataConsumer();
    @Test
    public void validateFirstName() throws IOException, SQLException {
        // Get first 10 first name form actor table
      List<String> actuaFirstNameFromDB = dbDataConsumer.getActorsFirstNameFromDB();
      List<String> expectedFirstNameList = dbDataConsumer.getExpectedListOfActors();

      for(int i =0; i<actuaFirstNameFromDB.size(); i++){
          Assert.assertEquals(actuaFirstNameFromDB.get(i), expectedFirstNameList.get(i));
          System.out.println(actuaFirstNameFromDB.get(i) + "==" + expectedFirstNameList.get(i));
      }

    }

}
