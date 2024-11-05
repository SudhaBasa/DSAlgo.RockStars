@Signin
Feature: Validating Login page


  Background: Verifying NumpyNinja link
    Given The user is on DSAlgo getstarted page
    When The user clicks on Getstarted button on DSAlgo page
    Then The user directed DSAlgo home page with Sign in option  
 
    Given The user is on DSAlgo page
    When The user clicks on sigin link on signin page
    Then The user redirected to login page from DSAlgo page

 @Signin_02
 Scenario Outline: User on login page and login with invalid inputs "<username>" and "<password>"
   Given The user is on signin page
   When The user enter invalid "<username>" and "<password>"
   Then click login button to verify

   Examples: 
      | username | password |
      | user     |          |
      |          | passowrd |
      |          |          |

  @Signin_03
  Scenario Outline: User on login page and login with invalid and valid inputs from Excel "<Sheetname>" and <RowNumber>
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber>
    Then click login button

    Examples: 
      | Sheetname | RowNumber |
      | Login     |         0 |
      | Login     |         1 |
      | Login     |         2 |
      | Login     |         3 |
      

  @Signin_04
  Scenario: Verifying signout link
    Given The user is on signin page with valid username "Rockstars_Numpy" and password "Numpy@Rock123"
    When The user click signout button
    Then The user redirected to homepage