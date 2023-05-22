Feature: Data Structure Page Functionality
  I want to use this template for my feature file

  Scenario: User validate Data Structure page 
          	When The user is in home page
          	And It should navigate to corresponding page with title "NumpyNinja"

	Scenario: User validate Title of your scenario Data Structure page and Data Structure
					    #Given The user is in home pages
					    When user click on Get Started button on Data Structure Page
					    And user click on Time Complexity
					    #And It should navigate to corresponding page with title "Time Complexity"
					    #And It should navigate to corresponding page with title "Time Complexity"
					    When user clicks on Try here
					    And It should navigate to Assessment page with title "Assessment"
					    When user enter the Python code
					    |print"Data Structure page-Time Complexity"|
					    And click on run button
					    Then User navigate back to Data Structure
					    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home" 
					   
					    