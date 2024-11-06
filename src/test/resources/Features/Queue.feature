@Queue
Feature: User tests the Queue Page


  Background: The User logged in to DS Algo Portal
    Given The user is on Sign In Page of DS Algo Portal
    When The user enter valid "Lillyy_1@991" and "testPassword@1"
    Then The user is navigated to homepage
   

  @TS_Queue_01
  Scenario: The user is able to navigate to Queue Page
    Given The user is on Home Page after logged in
    When The user selects Queue from the drop down menu
    Then The user should be navigated to Queue Page

  @TS_Queue_02
  Scenario: The user is able to navigate to Implementation of Queue in Python Link Page
    Given The user is on the Queue page
    When The user clicks on Implementation of Queue in Python link
    Then The user should be navigated to Implementation of Queue in Python Page

  @TS_Queue_03
  Scenario: The user is able to navigate to tryEditor page with run button to test python code from  Implementation of Queue in Python page
    Given The user is on the Implementation of Queue in Python  page
    When The user clicks Try Here button
    Then The user should navigate to TryEditor page with Run button

  @TS_Queue_04
  Scenario Outline: The user is able to run valid code in TryEditor for Implementation of Queue in Python Page
    Given The user is on the tryEditor page with Run button to test
    When The user writes Valid python code from sheet "<Sheetname>" and <RowNumber> and clicks Run button
    Then The User is able to see the output in console

    Examples: 
      | Sheetname  | RowNumber |
      | python code|         0 |

  @TS_Queue_05
  Scenario Outline: The user runs with invalid code in  tryEditor for Implementation of Queue in Python Page
    Given The user is on the tryEditor page with Run button to test
    When The user writes invalid python code from sheet "<Sheetname>" and <RowNumber> and clicks Run button
    Then The user gets the error message in pop up window

    Examples: 
      | Sheetname  | RowNumber |
      | python code |         1 |

  @TS_Queue_06
  Scenario: The user is able to navigate to Queue page and click on Implementation using collections.deque link
    Given The user is in tryEditor page and navigates to the Queue Page
    When The user clicks on Implementation using collections.deque link
    Then The user should be navigated to Implementation using collections.deque page

  @TS_Queue_07
  Scenario: The user is able to navigate to tryEditor page with run button to test python code from  Implementation using collections.deque page
    Given The user is on  Implementation using collections.deque page
    When The user clicks Try Here button
    Then The user should navigate to TryEditor page with Run button

  @TS_Queue_08
  Scenario Outline: The user is able to run valid code in TryEditor for Implementation using collections.deque page
    Given The user is on the tryEditor page with Run button to test
    When The user writes Valid python code from sheet "<Sheetname>" and <RowNumber> and clicks Run button
    Then The User is able to see the output in console

    Examples: 
      | Sheetname  | RowNumber |
      | python code |         0 |

  @TS_Queue_09
  Scenario Outline: The user runs with invalid code in  tryEditor for Implementation using collections.deque page
    Given The user is on the tryEditor page with Run button to test
    When The user writes invalid python code from sheet "<Sheetname>" and <RowNumber> and clicks Run button
    Then The user gets the error message in pop up window

    Examples: 
      | Sheetname  | RowNumber |
      | python code |         1 |

  @TS_Queue_10
  Scenario: The user is able to navigate to Queue page and click on Implementation using Array link
    Given The user is in tryEditor page and navigates to the Queue Page
    When The user clicks on Implementation using Array link
    Then The user should be navigated to Implementation using Array Page

  @TS_Queue_11
  Scenario: The user is able to navigate to tryEditor page with run button to test python code from  Implementation using Array page
    Given The user is on  Implementation using Array page
    When The user clicks Try Here button
    Then The user should navigate to TryEditor page with Run button

  @TS_Queue_12
  Scenario Outline: The user is able to run valid code in TryEditor for Implementation using Array page
    Given The user is on the tryEditor page with Run button to test
    When The user writes Valid python code from sheet "<Sheetname>" and <RowNumber> and clicks Run button
    Then The User is able to see the output in console

    Examples: 
      | Sheetname  | RowNumber |
      | python code |         0 |

  @TS_Queue_13
  Scenario Outline: The user runs with invalid code in  tryEditor for Implementation using Array page
    Given The user is on the tryEditor page with Run button to test
    When The user writes invalid python code from sheet "<Sheetname>" and <RowNumber> and clicks Run button
    Then The user gets the error message in pop up window

    Examples: 
      | Sheetname  | RowNumber |
      | python code |         1 |

  @TS_Queue_14
  Scenario: The user is able to navigate to Queue page and click on Queue Operations link
    Given The user is in tryEditor page and navigates to the Queue Page
    When The user clicks on Queue Operations link
    Then The user should be navigated to Queue Operations Page

  @TS_Queue_15
  Scenario: The user is able to navigate to tryEditor page with run button to test python code from  Queue Operations page
    Given The user is on  Queue Operations page
    When The user clicks Try Here button
    Then The user should navigate to TryEditor page with Run button

  @TS_Queue_16
  Scenario Outline: The user is able to run valid code in TryEditor for Queue Operations page
    Given The user is on the tryEditor page with Run button to test
    When The user writes Valid python code from sheet "<Sheetname>" and <RowNumber> and clicks Run button
    Then The User is able to see the output in console

    Examples: 
      | Sheetname  | RowNumber |
      | python code |         0 |

  @TS_Queue_17
  Scenario Outline: The user runs with invalid code in  tryEditor for Queue Operations page
    Given The user is on the tryEditor page with Run button to test
    When The user writes invalid python code from sheet "<Sheetname>" and <RowNumber> and clicks Run button
    Then The user gets the error message in pop up window

    Examples: 
      | Sheetname  | RowNumber |
      | python code |         1 |

  @TS_Queue_18
  Scenario: The user is able to navigate to Queue page and click on Practice Questions link
    Given The user is in tryEditor page and navigates to the Queue Page
    When The user clicks Practice Questions link
    Then The user should be navigated to Practice page
