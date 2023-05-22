#Author: your.email@your.domain.com
## (Comments)
@tag

Feature: User opens RegisterPage
	 #Background:
	  Scenario: User is on Home page and click on Register
	 		Given user opens browser and launch the url "https://dsportalapp.herokuapp.com/"
	    When user clicks on "Get started" button
	    And It should navigate to corresponding page with title "NumpyNinja"
	   
	   #Scenario: User is on Home page and click on Register
	    When The user clicks "Register" Link
	    Then The user should be redirected to Register form
	    
	    Scenario: Register validation with invalid inputs
	    When user click "register" button without entering anything
	    Then user should get fillout field error message "Please fill out this field." below username field.
	    
	    Scenario: Register validation with invalid inputs/blank fields
    	When user enters username
   		 | username          |  common95s |
   		And click on "register" button          
    	Then user should get fillout field error message "Please fill out this field." below password field.
	    
	    Scenario: Register validation with invalid inputs/blank fields
	    When user enters username and password 
	    | username          |  common95s| 
	    | password1         |   sdet@_95| 
	    And click "register" button
	    Then user should get fillout field error message "Please fill out this field." below passwordconfirmation field.
		 
	Scenario: Register validation with invalid inputs/blank fields
    When user enters username and password 
    | username          |  common95s | 
    | password1         |   sdet@_95 | 
    And click "register" button
    Then user should get fillout field error message "Please fill out this field." below passwordconfirmation field.
    
    Scenario: The user is succesfully able to register 
    When user enters a valid username password and passwordconfirmation
    | username          |common111s| 
    | password1         |sdet@_111| 
    | password2					|sdet@_111|
    And click "register" button with valid data
    Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as username"
    
    #Scenario: The user login in with existing user and password 
    #When The user clicks Signin Link
	  #When user enters a valid username password 
    #| username          |common91s| 
    #| password1         |sdet@_91| 
    #And click on Login
    #Then It should navigate to the home page with a message " You are logged in  " 
    
    
    