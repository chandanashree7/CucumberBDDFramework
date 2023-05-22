Feature: Tree Page Functionality
  I want to use this template for my feature file
	Scenario: User validate Tree page -
	          When The user is in home page
	          And It should navigate to corresponding page with title "NumpyNinja"
	    		  When user click on Get Started button on Trees
					  And It should navigate to Array page with title "Tree"
	          
  Scenario: User validate Title of your scenario Trees page and Overview of Trees
				    When user click on Overview of Trees
				    And It should navigate to corresponding page with title "Overview of Trees"
				    When user clicks on Try here
				    And It should navigate to Assessment page with title "Assessment"
				    When user enter the Python code
				      |print"Tree page - Implementation using Tree collections"|
				    And click on run button
				    Then User navigate back to Tree
 Scenario: User validate Tree Terminologies scenario page
				    When user click on Terminologies of Trees
				    And It should navigate to corresponding page with title "Terminologies"
				    When user clicks on Try here
				    And It should navigate to Assessment page with title "Assessment"
				    When user enter the Python code
				      |print"Tree page - Tree Terminologies"|
				    And click on run button
				    Then User navigate back to Tree
  Scenario: Validate Types of Trees
				    When user click on Types of Trees
				    And It should navigate to corresponding page with title "Types of Trees"
				    When user clicks on Try here
				    And It should navigate to Assessment page with title "Assessment"
				    When user enter the Python code
				      |print "Tree page - Types of Trees Introduction"|
				    And click on run button
				    Then User navigate back to Tree
 Scenario: Validate Tree Traversals link
				    When user click on Tree Traversals
				    And It should navigate to corresponding page with title "Tree Traversals"
				    When user clicks on Try here
				    And It should navigate to Assessment page with title "Assessment"
				    When user enter the Python code
				      | print "Tree page - Tree Traversals Introduction" |
				    And click on run button
				    Then User navigate back to Tree
  Scenario: Validate Traversals-Illustration
				    When user click on Traversals-Illustration
				    And It should navigate to corresponding page with title "Traversals-Illustration"
				    When user clicks on Try here
				    And It should navigate to Assessment page with title "Assessment"
				    When user enter the Python code
				      |print "Tree page - Traversals-Illustration Introduction"|
				    And click on run button
				    Then User navigate back to Tree
  Scenario: Validate Binary Trees
				    When user click on Binary Trees
				    And It should navigate to corresponding page with title "Binary Trees"
				    When user clicks on Try here
				    And It should navigate to Assessment page with title "Assessment"
				    When user enter the Python code
				      |print("Tree page - Binary Trees Introduction")|
				    And click on run button
				    Then User navigate back to Tree
  Scenario: Validate Types Binary Trees
				    When user click on Types of Binary Trees
				    And It should navigate to corresponding page with title "Types of Binary Trees"
				    When user clicks on Try here
				    And It should navigate to Assessment page with title "Assessment"
				    When user enter the Python code
				      |print "Tree page - Types Binary Trees Introduction"|
				    And click on run button
				    #Then User navigate back tree page
				    Then User navigate back to Tree
  Scenario: Validate Implementation in Python
				    When user click on Implementation in Python
				    And It should navigate to corresponding page with title "Implementation in Python"
				    When user clicks on Try here
				    And It should navigate to Assessment page with title "Assessment"
				    When user enter the Python code
				      |print "Tree page - Implementation in Python Introduction" |
				    And click on run button
				    Then User navigate back to Tree
  Scenario: Validate Binary Tree Traversals
				    When user click on Binary Tree Traversals
				    And It should navigate to corresponding page with title "Binary Tree Traversals"
				    When user clicks on Try here
				    And It should navigate to Assessment page with title "Assessment"
				    When user enter the Python code
				      | print "Tree page - Binary Tree Traversals Introduction" |
				    And click on run button
				    #Then User navigate back tree page
				    Then User navigate back to Tree
  Scenario: Validate Implementation of Binary Trees
				    When user click on Implementation of Binary Trees
				    And It should navigate to corresponding page with title "Implementation of Binary Trees"
				    When user clicks on Try here
				    And It should navigate to Assessment page with title "Assessment"
				    When user enter the Python code
				      |print "Tree page - Implementation of Binary Trees Introduction" |
				    And click on run button
				    #Then User navigate back tree page
				    Then User navigate back to Tree
  Scenario: Validate Applications of Binary trees
				    When user click on Applications of Binary trees
				    And It should navigate to corresponding page with title "Applications of Binary trees"
				    When user clicks on Try here
				    And It should navigate to Assessment page with title "Assessment"
				    When user enter the Python code
				      |print "Tree page - Applications of Binary trees Introduction"|
				    And click on run button
				    #Then User navigate back tree page
				    Then User navigate back to Tree
 Scenario: Validate Implementation Of BST
				    When user click on Implementation Of BST
				    And It should navigate to corresponding page with title "Implementation Of BST"
				    When user clicks on Try here
				    And It should navigate to Assessment page with title "Assessment"
				    When user enter the Python code
				      |print "Tree page - Implementation Of BST Introduction"|
				    And click on run button
				    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
