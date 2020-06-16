Feature:

  Scenario: Demo makes a successful payment to the Coffee corner
    Given the user navigates to "https://demo.cyclos.org/#login"
    When the user enters username "demo"
    And the user enters password "1234"
    And the user clicks sign in button
    And the user clicks pay user
    And the user clicks Contact
    And the user selects "The Coffee corner" from contact
    And the user enters "100" to amount area
    And the user types "haziran bursu, gule gule harca" to description
    And the user clicks submit
    And the user clicks confirm
    Then the user views "The payment was successful" on transfer page