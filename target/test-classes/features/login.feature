Feature: Login

 Scenario: Verify valid login
  When user enters valid username and password
	Then user should see home page
