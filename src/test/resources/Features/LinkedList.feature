@Linkedlist
Feature: Linked List Page
The user should be able to navigate to linked list page and test the different scenarios in that page

Background: The User logged in to DS Algo Portal
Given The user is on Sign In Page of DS Algo Portal
When The user enter valid "Rockstars_Numpy" and "Numpy@Rock123"
Then The user is navigated to homepage


@Linkedlist_01
Scenario: The user is able to navigate to the "Linked List" page
Given The user comes back to the DS_algo home page to select or start DS Linked List.
When The user select Linked List from the Data Structure dropdown menu or clicks the Get Started button in Linked List Panel
Then The user should be navigated to "Linked List" page.

@Linkedlist_02
Scenario Outline: The user is able to navigate to the page of "linked List" having <links>
Given The user is on the Linked List page
When The user clicks link from the linked list topics covered list having "<links>"
Then The user should be navigated to page of "<destinationUrl>"
Examples:
|links| 														destinationUrl |
|Introduction| 											https://dsportalapp.herokuapp.com/linked-list/introduction/|
|Creating Linked LIst| 							https://dsportalapp.herokuapp.com/linked-list/creating-linked-list/|
|Types of Linked List| 							https://dsportalapp.herokuapp.com/linked-list/types-of-linked-list/|
|Implement Linked List in Python| 	https://dsportalapp.herokuapp.com/linked-list/implement-linked-list-in-python/|
|Traversal| 												https://dsportalapp.herokuapp.com/linked-list/traversal/|
|Insertion| 												https://dsportalapp.herokuapp.com/linked-list/insertion-in-linked-list/|
|Deletion| 													https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/|

@Linkedlist_03
Scenario Outline: The user is able to navigate to a TryEditor page of <links> page to test python code
Given The user is on the Linked list page with "<links>"
When The user clicks try here button in "<links>" page
Then The user should be navigated to a page having tryEditor and run button
Examples:
|links|
|Introduction|
|Creating Linked LIst|
|Types of Linked List|
|Implement Linked List in Python|
|Traversal|
|Insertion|
|Deletion|

@Linkedlist_04
Scenario: The user is not able to see any error message for "Introduction" page when run empty
Given The user is on the Linked list tryEditor page
When The user clicks the Run Button without entring the code in the Editor of linked list
Then Nothing happens to the page and no error message is displayed for Linked list

@Linkedlist_05
Scenario Outline: The user is able to see output in the console when run with valid code in "Introduction" TryEditor page
Given The user is on the Linked list tryEditor page
When The user writes the valid python code from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user is able to see the output inside the console.
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         0 |

@Linkedlist_06
Scenario Outline: The user is able to see error message when run with invalid code in "Introduction" TryEditor page
Given The user is on the Linked list tryEditor page
When The user writes the invalid python code from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user should see an error message in alert window
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         1 |

Scenario Outline: The user is able to see output in the console when run with valid code in "Creating Linked LIst" TryEditor page
Given The user is on the Linked list tryEditor page
When The user writes the valid python code from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user is able to see the output inside the console.
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         0 |

@Linkedlist_06
Scenario Outline: The user is able to see error message when run with invalid code in "Creating Linked LIst" TryEditor page
Given The user is on the Linked list tryEditor page
When The user writes the invalid python code from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user should see an error message in alert window
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         1 |

Scenario Outline: The user is able to see output in the console when run with valid code in "Types of Linked List" TryEditor page
Given The user is on the Linked list tryEditor page
When The user writes the valid python code from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user is able to see the output inside the console.
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         0 |

@Linkedlist_06
Scenario Outline: The user is able to see error message when run with invalid code in "Types of Linked List" TryEditor page
Given The user is on the Linked list tryEditor page
When The user writes the invalid python code from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user should see an error message in alert window
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         1 |

Scenario Outline: The user is able to see output in the console when run with valid code in "Implement Linked List in Python" TryEditor page
Given The user is on the Linked list tryEditor page
When The user writes the valid python code from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user is able to see the output inside the console.
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         0 |

@Linkedlist_06
Scenario Outline: The user is able to see error message when run with invalid code in "Implement Linked List in Python" TryEditor page
Given The user is on the Linked list tryEditor page
When The user writes the invalid python code from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user should see an error message in alert window
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         1 |
      
Scenario Outline: The user is able to see output in the console when run with valid code in "Traversal" TryEditor page
Given The user is on the Linked list tryEditor page
When The user writes the valid python code from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user is able to see the output inside the console.
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         0 |

@Linkedlist_06
Scenario Outline: The user is able to see error message when run with invalid code in "Traversal" TryEditor page
Given The user is on the Linked list tryEditor page
When The user writes the invalid python code from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user should see an error message in alert window
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         1 |  
      
Scenario Outline: The user is able to see output in the console when run with valid code in "Insertion" TryEditor page
Given The user is on the Linked list tryEditor page
When The user writes the valid python code from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user is able to see the output inside the console.
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         0 |

@Linkedlist_06
Scenario Outline: The user is able to see error message when run with invalid code in "Insertion" TryEditor page
Given The user is on the Linked list tryEditor page
When The user writes the invalid python code from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user should see an error message in alert window
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         1 |    
      
Scenario Outline: The user is able to see output in the console when run with valid code in "Deletion" TryEditor page
Given The user is on the Linked list tryEditor page
When The user writes the valid python code from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user is able to see the output inside the console.
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         0 |

@Linkedlist_06
Scenario Outline: The user is able to see error message when run with invalid code in "Deletion" TryEditor page
Given The user is on the Linked list tryEditor page
When The user writes the invalid python code from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user should see an error message in alert window
Examples: S
      | Sheetname  | RowNumber |
      | dsalgocode |         1 |    
                              
@Linkedlist_7
Scenario: The user is able to navigate to Practice Questions page of linked list
Given The user is on the Deletion page
When The user clicks "Practice Questions" link of linked list
Then The user should be redirected to "Practice Questions" page of linked list