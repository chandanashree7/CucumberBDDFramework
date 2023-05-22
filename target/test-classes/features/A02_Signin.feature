Feature: Application login - DSAlgoSignIn
  I want to use this template for my feature file

  #@tag1
  Scenario: The user login in with existing user and password
  	#Given user opens browser and launch the url "https://dsportalapp.herokuapp.com/"
	  #When user clicks on "Get started" button
    When The user clicks Signin Link
    #And It should navigate to corresponding page with title "NumpyNinja"

 # @tag2
  Scenario Outline: User on login page and valid inputs from Excel "<SheetName>" and <RowNumber>
    Given The user is on signin page
    When The user enter sheet "<SheetName>" and rownumber <RowNumber>
    And click on Login

    Examples: 
      | SheetName | RowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |
     