@Array
Feature: Array page
The user should be able to navigate to array page and test the different scenarios in that page

Background: The User logged in to DS Algo Portal
Given The user is on Sign In Page of DS Algo Portal
When The user enter valid "Rockstars_Numpy" and "Numpy@Rock123"
Then The user is navigated to homepage

@Array_01
Scenario: The user is able to navigate to the "Array" page
Given The user is on the Home Page after logged in
When The user select Arrays from the dropdown or clicks Get Started button below the array
Then The user should be navigated to the "Array" Page

@Array_02
Scenario Outline: The user is able to navigate to page <Option> 
Given The user is on the Array page
When The user clicks link from the topics covered list "<Option>".
Then The user should be navigated to related Page of "<destinationUrl>"
Examples:
|Option|                       destinationUrl|
|Arrays in Python|             https://dsportalapp.herokuapp.com/array/arrays-in-python/|
|Arrays Using List|            https://dsportalapp.herokuapp.com/array/arrays-using-list/ |
|Basic Operations in Lists|    https://dsportalapp.herokuapp.com/array/basic-operations-in-lists/ |
|Applications of Array|        https://dsportalapp.herokuapp.com/array/applications-of-array/ |

@Array_03
Scenario Outline: The user is able to navigate to a TryEditor page of <Options> to test python code
Given The user is on the specific Page "<Options>"
When The user clicks Try Here button of Page "<Options>"
Then The user should be navigated to a TryEditor page with Run button
Examples:
|Options|
|Arrays in python|
|Arrays Using List|
|Basic Operations in Lists|
|Applications of Array|

@Array_04
Scenario: The user is not able to see any error message for "Arrays in Python" when run empty
Given The user is on the tryEditor page with Run button to test
When The user clicks the Run Button without entring the code in the Editor
Then Nothing happens to the page and no error message is displayed

@Array_05
Scenario Outline: The user is able to see output in the console when run with valid code in"Arrays in Python" TryEditor page
Given The user is on the Array tryEditor page with Run button to test
When The user writes the valid code in Editor from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user should able to see output in the console
Examples: 
      | Sheetname   | RowNumber |
      | dsalgocode |         0|

@Array_06
Scenario Outline: The user is able to see error message when run with invalid code in "Arrays in Python" TryEditor page
Given The user is on the Array tryEditor page with Run button to test
When The user writes the invalid code from "<Sheetname>" and <RowNumber> in Editor and clicks the Run button
Then The user should able to see an error message in alert window
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         1       |

@Array_07
Scenario: The user is not able to see any error message for "Arrays Using List" when run empty
Given The user is on the Array tryEditor page with Run button to test
When The user clicks the Run Button without entring the code in the Editor
Then Nothing happens to the page and no error message is displayed

@Array_08
Scenario Outline: The user is able to see output in the console when run with valid code in "Arrays Using List" TryEditor page
Given The user is on the Array tryEditor page with Run button to test
When The user writes the valid code in Editor from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user should able to see output in the console
Examples: 
      | Sheetname   | RowNumber |
      | dsalgocode |         0|
      
@Array_09
Scenario Outline: The user is able to see error message when run with invalid code in "Arrays Using List" TryEditor page
Given The user is on the Array tryEditor page with Run button to test
When The user writes the invalid code from "<Sheetname>" and <RowNumber> in Editor and clicks the Run button
Then The user should able to see an error message in alert window
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         1       |

@Array_10
Scenario: The user is not able to see any error message for "Basic Operations in Lists" when run empty
Given The user is on the Array tryEditor page with Run button to test
When The user clicks the Run Button without entring the code in the Editor
Then Nothing happens to the page and no error message is displayed

@Array_11
Scenario Outline: The user is able to see output in the console when run with valid code in "Basic Operations in Lists" TryEditor page
Given The user is on the Array tryEditor page with Run button to test
When The user writes the valid code in Editor from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user should able to see output in the console
Examples: 
      | Sheetname   | RowNumber |
      | dsalgocode |         0|

@Array_12
Scenario Outline: The user is able to see error message when run with invalid code in "Basic Operations in Lists" TryEditor page
Given The user is on the Array tryEditor page with Run button to test
When The user writes the invalid code from "<Sheetname>" and <RowNumber> in Editor and clicks the Run button
Then The user should able to see an error message in alert window
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         1       |

@Array_13
Scenario: The user is not able to see any error message for "Applications of Array" when run empty
Given The user is on the Array tryEditor page with Run button to test
When The user clicks the Run Button without entring the code in the Editor
Then Nothing happens to the page and no error message is displayed

@Array_14
Scenario Outline: The user is able to see output in the console when run with valid code in "Applications of Array" TryEditor page
Given The user is on the Array tryEditor page with Run button to test
When The user writes the valid code in Editor from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user should able to see output in the console
Examples: 
      | Sheetname   | RowNumber |
      | dsalgocode |         0|
@Array_15
Scenario Outline: The user is able to see error message when run with invalid code in "Applications of Array" TryEditor page
Given The user is on the Array tryEditor page with Run button to test
When The user writes the invalid code from "<Sheetname>" and <RowNumber> in Editor and clicks the Run button
Then The user should able to see an error message in alert window
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         1       |

@Array_16
Scenario: The user is able to navigate to the Arrays Practice Questions page
Given The user is on the Applications of Array page
When The user clicks Array Practice Questions link
Then The user should be navigated to practice page having 5 links

@Array_17
Scenario Outline: The user is able to navigate to question page of <Questions> 
Given The user is on Array Practice Questions page
When The user clicks link from the list "<Questions>"
Then The user should be navigated to "<destinationUrl>" page contains a question,an tryEditor with Run and Submit buttons
Examples:
|Questions|                                      destinationUrl|
|Search the array|                            https://dsportalapp.herokuapp.com/question/1|
|Max Consecutive Ones|                        https://dsportalapp.herokuapp.com/question/2|
|Find Numbers with Even Number of Digits|     https://dsportalapp.herokuapp.com/question/3|
|Squares of  a Sorted Array|                 https://dsportalapp.herokuapp.com/question/4|

@Array_18
Scenario: The user is not able to see any error message for "Search the Array" when run empty
Given The user is on the "Search the array" practise Editor page
When The user clicks the Run Button without entring the code in the practise questions Editor
Then Nothing happens to the practise questions Editor page and no error message is displayed

@Array_19
Scenario Outline: The user is able to see output in the console when run with valid code in "Search the Array" practice Editor page
Given The user is on the "Search the array" practise Editor page
When The user writes the valid code in practise questions Editor from "<Sheetname>" and <RowNumber> and clicks the Run button
Then The user should able to see output in the practise questions console
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         2   |


@Array_20
Scenario Outline: The user is able to see an error message for "Search the Array" when submit button is clicked
Given The user is on the "Search the array" practise Editor page
When The user writes the valid code in practise questions Editor from "<Sheetname>" and <RowNumber> clicks the Submit button
Then The user see an output as submission succes
 Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         3 |

@Array_21
Scenario Outline: The user is able to see an error message in alert window when run with invalid code in "Search the Array" practice Editor page
Given The user is on the "Search the array" practise Editor page
When The user writes the invalid code in practise questions Editor from "<Sheetname>" and <RowNumber> clicks the Run button
Then The user should able to see an error message in alert window of practise questions
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         1 |

@Array_22
Scenario: The user is not able to see any error message for "Max consecutive ones" when run empty
Given The user is on the "Max consecutive ones" practise Editor page
When The user clicks the Run Button without entring the code in the practise questions Editor
Then Nothing happens to the practise questions Editor page and no error message is displayed

@Array_23
Scenario Outline: The user is able to see output in the console when run with valid code in "Max consecutive ones" practice Editor page
Given The user is on the "Max consecutive ones" practise Editor page
When The user writes the valid code in practise questions Editor from "<Sheetname>" and <RowNumber> click the Run buttom
Then The user should able to see output in the practise questions console
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         4 |

@Array_24
Scenario Outline: The user is able to see an error message for "Max consecutive ones" when submit button is clicked
Given The user is on the "Max consecutive ones" practise Editor page
When The user writes the valid code in practise questions Editor from "<Sheetname>" and <RowNumber> clicks the Submit button
Then The user see an output as submission succes
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         5 |

@Array_25
Scenario Outline: The user is able to see an error message in alert window when run with invalid code in "Max consecutive ones" practice Editor page
Given The user is on the "Max consecutive ones" practise Editor page
When The user writes the invalid code in practise questions Editor from "<Sheetname>" and <RowNumber> clicks the Run button
Then The user should able to see an error message in alert window of practise questions
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         1 |

@Array_26
Scenario: The user is not able to see any error message for "Find numbers with even number of digits" when run empty
Given The user is on the "Find numbers with even number of digits" practise Editor page
When The user clicks the Run Button without entring the code in the practise questions Editor
Then Nothing happens to the practise questions Editor page and no error message is displayed

@Array_27
Scenario Outline: The user is able to see output in the console when run with valid code in "Find numbers with even number of digits" practice Editor page
Given The user is on the "Find numbers with even number of digits" practise Editor page
When The user writes the valid code in practise questions Editor from "<Sheetname>" and <RowNumber> click the Run buttom
Then The user should able to see output in the practise questions console
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         6 |
@Array_28
Scenario Outline: The user is able to see an error message for "Find numbers with even number of digits" when submit button is clicked
Given The user is on the "Find numbers with even number of digits" practise Editor page
When The user writes the valid code in practise questions Editor from "<Sheetname>" and <RowNumber> clicks the Submit button
Then The user see an output as submission succes
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         7 |

@Array_29
Scenario Outline: The user is able to see an error message in alert window when run with invalid code in "Find numbers with even number of digits" practice Editor page
Given The user is on the "Find numbers with even number of digits" practise Editor page
When The user writes the invalid code in practise questions Editor from "<Sheetname>" and <RowNumber> clicks the Run button
Then The user should able to see an error message in alert window of practise questions
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         1 |

@Array_30
Scenario: The user is not able to see any error message for "squares of the sorted array" when run empty
Given The user is on the "squares of the sorted array" practise Editor page
When The user clicks the Run Button without entring the code in the practise questions Editor
Then Nothing happens to the practise questions Editor page and no error message is displayed

@Array_31
Scenario Outline: The user is able to see output in the console when run with valid code in "squares of the sorted array" practice Editor page
Given The user is on the "squares of the sorted array" practise Editor page
When The user writes the valid code in practise questions Editor from "<Sheetname>" and <RowNumber> click the Run buttom
Then The user should able to see output in the practise questions console
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         8 |
@Array_32
Scenario Outline: The user is able to see an error message for "squares of the sorted array" when submit button is clicked
Given The user is on the "squares of the sorted array" practise Editor page
When The user writes the valid code in practise questions Editor from "<Sheetname>" and <RowNumber> clicks the Submit button
Then The user see an output as submission succes
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         9 |

@Array_33
Scenario Outline: The user is able to see an error message in alert window when run with invalid code in "squares of the sorted array" practice Editor page
Given The user is on the "squares of the sorted array" practise Editor page
When The user writes the invalid code in practise questions Editor from "<Sheetname>" and <RowNumber> clicks the Run button
Then The user should able to see an error message in alert window of practise questions
Examples: 
      | Sheetname  | RowNumber |
      | dsalgocode |         1 |