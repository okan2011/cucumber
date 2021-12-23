package database_stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;
public class Create_Step_Defs {
    @When("user creates a new hotel with a {string}")
    public void user_creates_a_new_hotel_with_a(String hotelData) {
//    QUERY FOR INSERTING HOTEL
  //      String query = "INSERT INTO tHOTEL (Code, Name, Address, Phone, Email, CreateDate, CreateUser) VALUES ('2000','Test Hotel','Test Address','9999999','test@testemail.com','2021-06-29 19:40:47.597',4)";
        String query = "INSERT INTO tHOTEL (Code, Name, Address, Phone, Email, CreateDate, CreateUser) VALUES ("+hotelData+")";
//    RUNNING THE QUERY
        DBUtils.executeQuery(query);
    }
    @Then("verify the hotel is created successfully")
    public void verify_the_hotel_is_created_successfully() {
//        READ THE HOTEL TABLE AND NAME COLUMN
//        THEN CHECK IF NAME INCLUDES Test Hotel
        String query="SELECT Name FROM tHOTEL";

// getColumnData("QUERY", "COLUMN NAME")-> returns the list of column data as list of object
        Assert.assertTrue(DBUtils.getColumnData(query,"Name").toString().contains("Test Hotel"));

        /*
                    CONCLUSION
             We inserted a new hotel from the database using JDBC
             And verified the data is on the UI
         */

    }

    @Then("close the connection")
    public void close_the_connection() {
        DBUtils.closeConnection();
    }

}