#@Graph1  
Feature: Graph feature

	
	  Scenario: User validate Graph page -
         		 When The user is in home page
         		 And It should navigate to corresponding page with title "NumpyNinja"
         		 When user click on Get Started button on Graph
					   And It should navigate to Graph page with title "Graph" 
 
		Scenario: User validate Graph page and Topics Covered 
					  	When user click on Operations in Graph
					    And It should navigate to corresponding page with title "Graph"
					    When user clicks on Try here
					    And It should navigate to Assessment page with title "Assessment"
					    When user enter the Python code
					     |print"Graph page- Operations in Graph"|
					    And click on run button
					    Then User navigate back to Graph
					    
					    
	 Scenario: User validate  Graph Representations page
	 					   When user click on Graph Representations
					    And It should navigate to corresponding page with title "Graph Representations"
					    When user clicks on Try here
					    And It should navigate to Assessment page with title "Assessment"
					    When user enter the Python code
					    |print"Graph page-Graph Representations"|
							And click on run button
					    Then User navigate back to Graph
					    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home" 
					    