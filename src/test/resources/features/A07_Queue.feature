
Feature: Queue feature
  	
  		Scenario: User validate Data Queue page 
          		When The user is in home page
          		And It should navigate to corresponding page with title "NumpyNinja"
		
					    
		Scenario: User validate Implementation of Queue in Python page
					    When user click on Get Started button on Queue
					    When user click on Implementation of Queue in Python
					    And It should navigate to corresponding page with title "Implementation of Queue in Python"
					    When user clicks on Try here
					    And It should navigate to Assessment page with title "Assessment"
					    When user enter the Python code
					     |print"Queue page-Implementation of Queue in Python"|
					    And click on run button
					    Then User navigate back Queue
					    
					    
	Scenario: User validate Implementation using collections_deque page
				      When user click on Implementation using collections_deque
					    And It should navigate to corresponding page with title "Implementation using collections.deque"
					    When user clicks on Try here
					    And It should navigate to Assessment page with title "Assessment"
					    When user enter the Python code
					    |print"Queue page-Implementation using collections"|
					    And click on run button
					    Then User navigate back Queue
					    

		Scenario: User validate Implementation using array page
					    When user click on Implementation using array
					    And It should navigate to corresponding page with title "Implementation using array"
					    When user clicks on Try here
					    And It should navigate to Assessment page with title "Assessment"
					    When user enter the Python code
					      |print"Queue page-Implementation using array"|
					    And click on run button
					    Then User navigate back Queue

	 Scenario: User validate Queue Operations page
	 					  When user click on Queue Operations
					    And It should navigate to corresponding page with title "Queue Operations"
					    When user clicks on Try here
					    And It should navigate to Assessment page with title "Assessment"
					    When user enter the Python code
					      |print "Queue page-Queue Operations"|
					    And click on run button 
					    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
					    
					    
    
    
    