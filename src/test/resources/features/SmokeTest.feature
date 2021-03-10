@CEN-205
Feature: 

	
	@CEN-202
	Scenario: Positive Login
		When the user enter valid credentials "salesmanager26@info.com" "salesmanager"
		And click on login button
		Then the user should be able to login	

	
	@CEN-203
	Scenario: Activities Link Test
		When the user enter valid credentials "posmanager26@info.com" "posmanager"
		And click on login button
		Then the user should be able to see Activities link on the top menu	

	
	@CEN-204
	Scenario: Conversations Link Test
		When the user enter valid credentials "posmanager26@info.com" "posmanager"
		And click on login button
		Then the user should be able to see Conversations link on the top menu