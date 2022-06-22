Feature: Enter information to the form
  I am a client who wants to buy a vehicle insurance for my vehicle.

  Scenario: Enter valid information to the form
    Given the URL http://sampleapp.tricentis.com/101/app.php is available
    When I enter the necessary information to the Vehicle Data Section to the form
    And I enter the necessary information to the Insurant Data Section to the form
    And I enter the necessary information to the Product Data Section to the form
    And I select the price option
    And I enter the necessary information to the send Quote section
    Then the system shows me the sending success alert
