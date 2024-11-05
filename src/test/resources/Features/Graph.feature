Feature: User launch dsalgo application and test Data Structure introduction page

  @graph_01
  Scenario: 
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "Rockstars_Numpy" and "Numpy@Rock123"
    And The user click on login button
    Then The user redirected to homepage in DS

  @graph_02
  Scenario: The user is able to navigate to "Graph" page
    Given The user is on the "NumpyNinja" after logged in
    When The user clicks the "Getting Started" button in Graph Panel
    Then The user be directed to "Graph" page in DSAlgo homepage

  @graph_03
  Scenario: The user is able to navigate to Graph Graph page
    Given The user is on "Graph" page
    When The user click on Graph button on "Graph" page
    Then The user should be redirected to Graph Graph page

  @graph_04
  Scenario: The user is able to navigate to a tryEditor from Graph Graph page
    Given The user is on Graph Graph page
    When The user clicks on Try here button on Graph Graph page
    Then The user should be redirected tryEditor page with a Run button in Graph Graph module

  @graph_05
  Scenario Outline: The user is able to run code in tryEditor for Graph Graph page
    Given The user is in Graph Graph page having an tryEditor with a Run button to test valid code
    When The user gets input from sheet "<Sheetname>" and <RowNumber> for GraphEditor
    And The user clicks on Run button after Entering valid python code in Graph Graph tryEditor
    Then The user should be presented with Run output in GraphtryEditor

    Examples: 
      | Sheetname  | RowNumber |
      | python code |         0 |

  @graph_06
  Scenario Outline: The user is able to get the error message for invalid syntax for Operations in Graph Graph page
    Given The user is in Graph Graph page having an tryEditor with a Run button to test invalid code
    When The user gets input from sheet "<Sheetname>" and <RowNumber> for GraphEditor invalid
    And The user clicks on Run button after Entering invalid python code in Graph Graph tryEditor
    Then The user should be presented with error message in Graph Graph

    Examples: 
      | Sheetname  | RowNumber |
      | python code |         1 |

  @graph_07
  Scenario: The user is able to navigate to Graph Representation page
    Given The user is in Editor page and navigates to graph representations page
    When The user clicks on Graph Representation button
    Then The user should be redirected to Graph Representatio page

  @graph_08
  Scenario: The user is able to navigate to a tryEditor from Graph Reptresentation page
    Given The user is in Graph Representations page
    When The user clicks on Tryhere link on graph representations page
    Then The user should be redirector to a tryEditor from Graph Reptresentation page

  @graph_09
  Scenario Outline: The user is able to run code in Editor for Graph Representations page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | python code |         0 |

  @graph_10
  Scenario Outline: The user is presented with error message for invalid code in Editor for Graph Representations page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message

    Examples: 
      | Sheetname  | RowNumber |
      | python code |         1 |

  @graph_11
  Scenario: The user is able to navigate to graph representations page and click on Practice Questions
    Given The user is in Editor page and navigates to graph representations page
    When the user clicks on Practice Questions in graph representations page
    Then The user is directed to graph Practice page