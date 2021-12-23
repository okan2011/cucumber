@db_read
Feature:Read-database_data
  Scenario: Read_hotel_reservations
    Given user connects to the database
    # column = Price table name = HOTELROOM
    # NOTE : column and table name must be accurate
    # SCHEMA has all information about database. So we use SCHEMA to write correct names.

    And user gets "Price" from "tHOTELROOM" table
 #    And user gets "Name" from "tHOTEL" table
#    And user gets "Price" from "HOTEL" table
#    And user gets "Notes" from "tHOTELROOMRESERVATION" table
  And user reads all rows in the "Price" column
   ## And user reads all rows in the "Name" column
   # And user reads all rows in the "Notes" column

  #CREATE A NEW STEP DEFINITION TO DO ASSERTION FOR THIS LINE
  And user gets the value in row 5 in "Price" column and verifies the value is "470.000"
