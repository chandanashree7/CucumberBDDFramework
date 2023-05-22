#@Arrays1  
Feature: Array feature
#@Array1     #Arrays in Python

Scenario: User validate Array page -
	          When The user is in home page
	          And It should navigate to corresponding page with title "NumpyNinja"
						When user click on Get Started button on Arrays
						And It should navigate to Array page with title "Array"
	          
	
	#@Array1     #Arrays in Python
		Scenario: User validate Array page -Arrays in Python 
				      When user click on Operations in  Arrays in Python
					    And Navigate to Operations in page with title "Arrays in Python"
					    When user clicks on Try here
					    And It should navigate to Assessment page with title "Assessment"
					    When user enter the Python code
					     | print"Array page-Operations in Array" |
					    And click on run button
					    Then User navigate back to Arrays 
	
					    
Scenario: User validate Array page-Arrays Using List 
					   # Given The user is in home pages
					    #When user click on Get Started button on Arrays
					    And It should navigate to Array page with title "Array"
					    When user click on Operations in  Arrays Using List
					    And Navigate to Operations in page with title "Arrays Using List"
					    When user clicks on Try here
					    And It should navigate to Assessment page with title "Assessment"
					    When user enter the Python code
					     | print"Array page-Arrays Using List" |
					    And click on run button
					    Then User navigate back to Arrays
			   	
					 
		Scenario: User validate Array page- Basic Operations in Lists 
					    #Given The user is in home pages
							#When user click on Get Started button on Arrays
					    And It should navigate to Array page with title "Array"
					    When user click on Operations in  Basic Operations in Lists
					    And Navigate to Operations in page with title "Basic Operations in Lists"
					    When user clicks on Try here
					    And It should navigate to Assessment page with title "Assessment"
					    When user enter the Python code
					     | print"Array page -Basic Operations in Lists" |
					    And click on run button
					    Then User navigate back to Arrays
					    
	  Scenario: User validate Array page- Applications of Array 
					    #Given The user is in home pages
					    #When user click on Get Started button on Arrays
					    And It should navigate to Array page with title "Array"
					    When user click on Operations in  Applications of Array
					    And Navigate to Operations in page with title "Applications of Array"
					    When user clicks on Try here
					    And It should navigate to Assessment page with title "Assessment"
					    When user enter the Python code
					     | print"Array page-Applications of Array" |
					    And click on run button
					    Then User navigate back to Arrays
					    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home" 
					
					    
					 
          
