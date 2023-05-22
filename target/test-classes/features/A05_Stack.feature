#@stack1  
Feature: Stack feature

	
	  Scenario: User validate Stack page -
         		 When The user is in home page
         		 And It should navigate to corresponding page with title "NumpyNinja"
         		 When user click on Get Started button on Stack
					   And It should navigate to Stack page with title "Stack" 
 
		Scenario: User validate Stack page and Topics Covered 
					    When user click on Operations in Stack
					    When user clicks on Try here
					    And It should navigate to Assessment page with title "Assessment"
					    When user enter the Python code
					     |print" Stack page - Operations in Stack"|
					    And click on run button
					    Then User navigate back to Stack
					    
					    
	 Scenario: User validate Tree Implementation scenario page
	 				    When user click on Implementation of Stack
					    And It should navigate to corresponding page with title "Implementation"
					    When user clicks on Try here
					    And It should navigate to Assessment page with title "Assessment"
					    When user enter the Python code
					    |print"Stack page - Stack Implementation"|
							And click on run button
					    Then User navigate back to Stack
					    
					    
		Scenario: User validate Tree Applications scenario page
					    When user click on Applications of Stack
					    And It should navigate to corresponding page with title "Applications"
					    When user clicks on Try here
					    And It should navigate to Assessment page with title "Assessment"
					    When user enter the Python code
					    |print"Stack page - Stack Applications"|
							And click on run button
					    Then User navigate back to Stack
					    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home" 
				    