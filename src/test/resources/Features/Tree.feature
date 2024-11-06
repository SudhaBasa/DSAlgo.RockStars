@Tree
Feature: User tests the Tree Page

  Background: The user is logged in to DS Algo Portal
    Given The user is on Sign In Page of DS Algo Portal
    When The user enter valid "Lillyy_1@991" and "testPassword@1"
    Then The user is navigated to homepage

  @TS_Tree_01
  Scenario: The user is able to navigate to Tree page
    Given The User is on Home Page after logged in
    When The user selects Tree Data Structure from drop down menu
    Then The user should be navigated to Tree Page

  @TS_Tree_02
  Scenario: The user is able to navigate to Overview of Trees Page
    Given The user is on the Tree Page
    When The user clicks on the Overview of Trees Link
    Then The user should be navigated to Overview of Trees Page

  @TS_Tree_03
  Scenario: The user is able to navigate to tryEditor page with run button to test python code from "Overview of Trees" page
    Given The user is in Overview of Trees page
    When The user clicks Try Here button
    Then The user should navigate to TryEditor page with Run button

  @TS_Tree_04
  Scenario Outline: The user is able to run valid code in TryEditor for Overview of Trees page
    Given The user is on the tryEditor page with Run button to test
    When The user writes Valid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The User is able to see the output in console

    Examples: 
      | SheetName   | RowNumber |
      | python code |         0 |

  @TS_Tree_05
  Scenario Outline: The user runs with invalid code in  tryEditor for "Overview of Trees page
    Given The user is on the tryEditor page with Run button to test
    When The user writes invalid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The user gets the error message in pop up window

    Examples: 
      | SheetName   | RowNumber |
      | python code |         1 |

  @TS_Tree_06
  Scenario: The user is able to navigate to Tree Page and click on Terminologies link
    Given The user is in tryEditor page and navigates to the Tree Page
    When The user clicks on Terminologies link
    Then The user should be navigated to Terminologies Page

  @TS_Tree_07
  Scenario: The user is able to navigate to tryEditor page with run button to test python code from Terminologies page
    Given The user is on the Terminologies page
    When The user clicks Try Here button
    Then The user should navigate to TryEditor page with Run button

  @TS_Tree_08
  Scenario Outline: The user is able to run valid code in TryEditor for Terminologies page
    Given The user is on the tryEditor page with Run button to test
    When The user writes Valid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The User is able to see the output in console

    Examples: 
      | SheetName   | RowNumber |
      | python code |         0 |

  @TS_Tree_09
  Scenario Outline: The user runs with invalid code in  tryEditor for Terminologies page
    Given The user is on the tryEditor page with Run button to test
    When The user writes invalid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The user gets the error message in pop up window

    Examples: 
      | SheetName   | RowNumber |
      | python code |         1 |

  @TS_Tree_10
  Scenario: The user is able to navigate to Tree Page and click on Types of Trees link
    Given The user is in tryEditor page and navigates to the Tree Page
    When The user clicks on Types of Trees link
    Then The user should be navigated to Types of Trees page.

  @TS_Tree_11
  Scenario: The user is able to navigate to tryEditor page with run button to test python code from Types of Trees page
    Given The user is on the Types of Trees page
    When The user clicks Try Here button
    Then The user should navigate to TryEditor page with Run button

  @TS_Tree_12
  Scenario Outline: The user is able to run valid code in TryEditor for Types of Trees page
    Given The user is on the tryEditor page with Run button to test
    When The user writes Valid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The User is able to see the output in console

    Examples: 
      | SheetName   | RowNumber |
      | python code |         0 |

  @TS_Tree_13
  Scenario Outline: The user runs with invalid code in  tryEditor for Types of Trees page
    Given The user is on the tryEditor page with Run button to test
    When The user writes invalid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The user gets the error message in pop up window

    Examples: 
      | SheetName   | RowNumber |
      | python code |         1 |

  @TS_Tree_14
  Scenario: The user is able to navigate to Tree Page and click on Tree Traversals link
    Given The user is in tryEditor page and navigates to the Tree Page
    When The user clicks on Tree Traversals link
    Then The user should be navigated to Tree Traversals page.

  @TS_Tree_15
  Scenario: The user is able to navigate to tryEditor page with run button to test python code from Tree Traversals page
    Given The user is on the Tree Traversals page
    When The user clicks Try Here button
    Then The user should navigate to TryEditor page with Run button

  @TS_Tree_16
  Scenario Outline: The user is able to run valid code in TryEditor for Tree Traversals page
    Given The user is on the tryEditor page with Run button to test
    When The user writes Valid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The User is able to see the output in console

    Examples: 
      | SheetName   | RowNumber |
      | python code |         0 |

  @TS_Tree_17
  Scenario Outline: The user runs with invalid code in  tryEditor for Tree Traversals page
    Given The user is on the tryEditor page with Run button to test
    When The user writes invalid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The user gets the error message in pop up window

    Examples: 
      | SheetName   | RowNumber |
      | python code |         1 |

  @TS_Tree_18
  Scenario: The user is able to navigate to Tree Page and click on Traversals-Illustration link
    Given The user is in tryEditor page and navigates to the Tree Page
    When The user clicks Traversals-Illustration link
    Then The user should be navigated to Traversals-Illustration page.

  @TS_Tree_19
  Scenario: The user is able to navigate to tryEditor page with run button to test python code from Traversals-Illustration page
    Given The user is on the Traversals-Illustration page
    When The user clicks Try Here button
    Then The user should navigate to TryEditor page with Run button

  @TS_Tree_20
  Scenario Outline: The user is able to run valid code in TryEditor for Traversals-Illustration page
    Given The user is on the tryEditor page with Run button to test
    When The user writes Valid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The User is able to see the output in console

    Examples: 
      | SheetName   | RowNumber |
      | python code |         0 |

  @TS_Tree_21
  Scenario Outline: The user runs with invalid code in  tryEditor for Traversals-Illustration page
    Given The user is on the tryEditor page with Run button to test
    When The user writes invalid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The user gets the error message in pop up window

    Examples: 
      | SheetName   | RowNumber |
      | python code |         1 |

  @TS_Tree_22
  Scenario: The user is able to navigate to Tree Page and click on Binary Trees link
    Given The user is in tryEditor page and navigates to the Tree Page
    When The user clicks Binary Trees link
    Then The user should be navigated to Binary Trees page.

  @TS_Tree_23
  Scenario: The user is able to navigate to tryEditor page with run button to test python code from Binary Trees page
    Given The user is on the Binary Trees page
    When The user clicks Try Here button
    Then The user should navigate to TryEditor page with Run button

  @TS_Tree_24
  Scenario Outline: The user is able to run valid code in TryEditor for Binary Trees page
    Given The user is on the tryEditor page with Run button to test
    When The user writes Valid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The User is able to see the output in console

    Examples: 
      | SheetName   | RowNumber |
      | python code |         0 |

  @TS_Tree_25
  Scenario Outline: The user is able to run invalid code in TryEditor for Binary Trees page
    Given The user is on the tryEditor page with Run button to test
    When The user writes invalid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The user gets the error message in pop up window

    Examples: 
      | SheetName   | RowNumber |
      | python code |         1 |

  @TS_Tree_26 
  Scenario: The user is able to navigate to Tree Page and click on Types of Binary Trees link
    Given The user is in tryEditor page and navigates to the Tree Page
    When The user clicks Types of Binary Trees link
    Then The user should be navigated to Types of Binary Trees page.

  @TS_Tree_27
  Scenario: The user is able to navigate to tryEditor page with run button to test python code from "Types of Binary Trees" page
    Given The user is on the Types of Binary Trees page
    When The user clicks Try Here button
    Then The user should navigate to TryEditor page with Run button

  @TS_Tree_28
  Scenario Outline: The user is able to run valid code in TryEditor for Types of Binary Trees page
    Given The user is on the tryEditor page with Run button to test
    When The user writes Valid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The User is able to see the output in console

    Examples: 
      | SheetName   | RowNumber |
      | python code |         0 |

  @TS_Tree_29
  Scenario Outline: The user is able to run invalid code in TryEditor for Types of Binary Trees page
    Given The user is on the tryEditor page with Run button to test
    When The user writes invalid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The user gets the error message in pop up window

    Examples: 
      | SheetName   | RowNumber |
      | python code |         1 |

  @TS_Tree_30
  Scenario: The user is able to navigate to Tree Page and click on Implementation of Python link
    Given The user is in tryEditor page and navigates to the Tree Page
    When The user clicks Implementation in Python Trees link
    Then The user should be navigated to Implementation in Python page.

  @TS_Tree_31
  Scenario: The user is able to navigate to tryEditor page with run button to test python code from Implementation of Python page
    Given The user is on the Implementation in Python page
    When The user clicks Try Here button
    Then The user should navigate to TryEditor page with Run button

  @TS_Tree_32
  Scenario Outline: The user is able to run valid code in TryEditor for Implementation of Python page
    Given The user is on the tryEditor page with Run button to test
    When The user writes Valid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The User is able to see the output in console

    Examples: 
      | SheetName   | RowNumber |
      | python code |         0 |

  @TS_Tree_33
  Scenario Outline: The user is able to run invalid code in TryEditor for Implementation of Python page
    Given The user is on the tryEditor page with Run button to test
    When The user writes invalid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The user gets the error message in pop up window

    Examples: 
      | SheetName   | RowNumber |
      | python code |         1 |

  @TS_Tree_34
  Scenario: The user is able to navigate to Tree Page and click on Binary Tree Traversals link
    Given The user is in tryEditor page and navigates to the Tree Page
    When The user clicks Binary Tree Traversals link
    Then The user should be navigated to Binary Tree Traversals page.

  @TS_Tree_35
  Scenario: The user is able to navigate to tryEditor page with run button to test python code from Binary Tree Traversals page
    Given The user is on the Binary Tree Traversals page
    When The user clicks Try Here button
    Then The user should navigate to TryEditor page with Run button

  @TS_Tree_36
  Scenario Outline: The user is able to run valid code in TryEditor for Binary Tree Traversals page
    Given The user is on the tryEditor page with Run button to test
    When The user writes Valid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The User is able to see the output in console

    Examples: 
      | SheetName   | RowNumber |
      | python code |         0 |

  @TS_Tree_37
  Scenario Outline: The user is able to run invalid code in TryEditor for Binary Tree Traversals page
    Given The user is on the tryEditor page with Run button to test
    When The user writes invalid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The user gets the error message in pop up window

    Examples: 
      | SheetName   | RowNumber |
      | python code |         1 |

  @TS_Tree_38
  Scenario: The user is able to navigate to Tree Page and click on Implementation of Binary Trees link
    Given The user is in tryEditor page and navigates to the Tree Page
    When The user clicks Implementation of Binary Trees link
    Then The user should be navigated to Implementation of Binary Treess page.

  @TS_Tree_39
  Scenario: The user is able to navigate to tryEditor page with run button to test python code from Implementation of Binary Trees page
    Given The user is on the Implementation of Binary Trees page
    When The user clicks Try Here button
    Then The user should navigate to TryEditor page with Run button

  @TS_Tree_40
  Scenario Outline: The user is able to run valid code in TryEditor for Implementation of Binary Trees page
    Given The user is on the tryEditor page with Run button to test
    When The user writes Valid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The User is able to see the output in console

    Examples: 
      | SheetName   | RowNumber |
      | python code |         0 |

  @TS_Tree_41
  Scenario Outline: The user is able to run invalid code in TryEditor for Implementation of Binary Trees page
    Given The user is on the tryEditor page with Run button to test
    When The user writes invalid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The user gets the error message in pop up window

    Examples: 
      | SheetName   | RowNumber |
      | python code |         1 |

  @TS_Tree_42
  Scenario: The user is able to navigate to Tree Page and click on Applications of Binary Trees link
    Given The user is in tryEditor page and navigates to the Tree Page
    When The user clicks Applications of Binary trees link
    Then The user should be navigated to Applications of Binary trees page.

  @TS_Tree_43
  Scenario: The user is able to navigate to tryEditor page with run button to test python code from Applications of Binary trees page
    Given The user is on the Applications of Binary trees page
    When The user clicks Try Here button
    Then The user should navigate to TryEditor page with Run button

  @TS_Tree_44
  Scenario Outline: The user is able to run valid code in TryEditor for Application of Binary trees page
    Given The user is on the tryEditor page with Run button to test
    When The user writes Valid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The User is able to see the output in console

    Examples: 
      | SheetName   | RowNumber |
      | python code |         0 |

  @TS_Tree_45
  Scenario Outline: The user is able to run invalid code in TryEditor for Application of Binary trees page
    Given The user is on the tryEditor page with Run button to test
    When The user writes invalid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The user gets the error message in pop up window

    Examples: 
      | SheetName   | RowNumber |
      | python code |         1 |

  @TS_Tree_46
  Scenario: The user is able to navigate to Tree Page and click on Binary Search Trees link
    Given The user is in tryEditor page and navigates to the Tree Page
    When The user clicks Binary Search Trees link
    Then The user should be navigated to Binary Search Trees page.

  @TS_Tree_47
  Scenario: The user is able to navigate to tryEditor page with run button to test python code from Binary Search Trees page
    Given The user is on the Binary Search Trees page
    When The user clicks Try Here button
    Then The user should navigate to TryEditor page with Run button

  @TS_Tree_48
  Scenario Outline: The user is able to run valid code in TryEditor for Binary Search Trees page
    Given The user is on the tryEditor page with Run button to test
    When The user writes Valid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The User is able to see the output in console

    Examples: 
      | SheetName   | RowNumber |
      | python code |         0 |

  @TS_Tree_49
  Scenario Outline: The user is able to run invalid code in TryEditor for Binary Search Trees page
    Given The user is on the tryEditor page with Run button to test
    When The user writes invalid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The user gets the error message in pop up window

    Examples: 
      | SheetName   | RowNumber |
      | python code |         1 |

  @TS_Tree_50
  Scenario: The user is able to navigate to Tree Page and click on Implementation of BTS link
    Given The user is in tryEditor page and navigates to the Tree Page
    When The user clicks Implementation Of BST link
    Then The user should be navigated to Implementation Of BST page.

  @TS_Tree_51
  Scenario: The user is able to navigate to tryEditor page with run button to test python code from Implementation of BTS page
    Given The user is on the Implementation Of BST page
    When The user clicks Try Here button
    Then The user should navigate to TryEditor page with Run button

  @TS_Tree_52
  Scenario Outline: The user is able to run valid code in TryEditor for Implementation of BTS page
    Given The user is on the tryEditor page with Run button to test
    When The user writes Valid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The User is able to see the output in console

    Examples: 
      | SheetName   | RowNumber |
      | python code |         0 |

  @TS_Tree_53
  Scenario Outline: The user is able to run invalid code in TryEditor for Implementation of BTS page
    Given The user is on the tryEditor page with Run button to test
    When The user writes invalid python code from sheet "<SheetName>" and <RowNumber> and clicks Run button
    Then The user gets the error message in pop up window

    Examples: 
      | SheetName   | RowNumber |
      | python code |         1 |

  @TS_Tree_54
  Scenario: The user is on Implementation of BTS Page and clicks on Practice Questions link
    Given The user is on the Implementation Of BST page
    When The user clicks Practice Questions link
    Then The user should be navigated to Practice page
