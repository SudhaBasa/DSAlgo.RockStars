Feature: Home page
User should be able to access DsAlgo home page

@Homepage_01
Scenario: The user launches dsalgo home page
Given The user should open the browser
When The user enter the DS_Algo Portal link
Then The user should land on the DS_Algo Get Started page with message "Preparing for the Interviews You are at the right place"

@Homepage_02
Scenario: The user is able to navigate to the home page with get started button and clicks the button
Given  The user is able to open the DS Algo Portal URL in any supported browser
When The user clicks the "Get Started" button
Then The user should land in Data Structure Introduction Page with "register" and "Sign in" links

@Homepage_03
Scenario: The user is able to see the list of data structures from the dropdown in the DS introduction page.
Given The user is on the Data Structure introduction page
When The user clicks the data structure"dropdown arrow"
Then The user should able to see 6 options in dropdown menu

@Homepage_04
Scenario Outline: The user is able to see a warning message when selects any <Option> from dropdown without signin  
Given The user is on the home page with "Register" and "Sign in" page
When The user selects any data structures item from the drop down without Sign in <Option>
Then The user should able be see an alert warning message "You are not logged in"
Examples:
|Option|
|Arrays|
|Linked List|
|Queue|
|Tree|
|Stack|
|Graph|

@Homepage_05
Scenario Outline: The user is able to see a warning message when clicks get started button below any <Options>  
Given The user is on the DS Introduction page
When The user clicks "Get Started" button of any on the DS Introduction page <Options>
Then The user should able to see a warning message "You are not logged in"
Examples:
|Options|
|Data Structure-Introduction|
|Array|
|Linked List|
|Queue|
|Tree|
|Stack|
|Graph|

@Homepage_06
Scenario: The user is able to click Register link and navigated to register form
Given The user is on the DS Introduction page
When The user clicks "Register" link on the DS Introduction page
Then The user should be navigated to Register form

@Homepage_07
Scenario: The user is able to click sign in link and is navigated to sign in page
Given The user is on the DS Introduction page
When The user clicks "Sign in" link
Then The user should be naviagted to Sign in page
#
#
