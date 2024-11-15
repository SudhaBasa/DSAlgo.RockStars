@Register @all
Feature: Testing functionality of Register Page

  @TS_Register_01
  Scenario: The user launches home page of DSAlgo Project
    Given The user opens DSAlgo portal link
     When The user clicks on "Get Started" button
    Then The User should be navigated to Home Page

  @TS_Register_02
  Scenario: The user Registers account with empty fields
    Given The user opens Register Page
    When The user clicks Register button with all fields empty
    Then The error "Please fill out this field." appears below Username textbox

  @TS_Register_03
  Scenario: The user Registers account with  Username and other fields empty
    Given The user opens Register Page
    When The user clicks Register button after entering Username with other fields empty
      | username   |
      | Raha_a@123 |
    Then The error message "Please fill out this field." appears below Password textbox

  @TS_Register_04
  Scenario: The user Registers account with username, password and Confirm Password empty
    Given The user opens Register Page
    When The user clicks Register button after entering Username and password with Password Confirmation field empty
      | username   | password  |
      | Raha_a@123 | aha_1@456 |
    Then The error message "Please fill out this field." appears below Password Confirmation textbox

  @TS_Register_05
  Scenario Outline: The user Registers with invalid Details
    Given The user opens Register Page
    When The user enters  "<username>" and "<password>" and "<passwordconfirmation>"
    Then The user should be able to see the error msg "<errormsg>"

    Examples: 
      | username     | password       | passwordconfirmation | errormsg                                                |
      | Lillyy_1@991 | testPassword@1 | testPassword@1       | username already exists                                 |
      | Raha_a@123   | ah_1@4         | ah_1@4               | Password should be atleast 8 characters                 |
      | &&**&&**     | aha_1@456      | aha_1@456            | Please enter a valid username                           |
      | Raha_a@123   |       12345678 |             12345678 | Password cannot be only numeric                         |
      | Raha_a@123   | aha_1@456      | aha_1@4567           | password_mismatch:The two password fields didn’t match. |

  @TS_Register_06
  Scenario Outline: The user Registers with valid Details
    Given The user opens Register Page
    When The user enters a valid "<username>" and "<password>" and "<passwordconfirmation>"
    Then The user should be navigated to Home Page with message "New Account Created. You are logged in as " "<userValue>"

    Examples: 
      |  password       | passwordconfirmation |
      |  testPassword@1 | testPassword@1       |

  @TS_Register_7
  Scenario Outline: User on signin page and login with valid credentials
    Given The user is on Sign In Page of DS Algo Portal
    When The user enter valid "Lillyy_1@991" and "testPassword@1"
    Then The user is navigated to homepage

    Examples: 
      | username     | password       |
      | Lillyy_1@991 | testPassword@1 |
