@FID-232
Feature: 

	
	@FID-229
	Scenario: POS Manager Login
		When the user enter valid credentials "posmanager26@info.com" "posmanager"
		And click on login button	

	
	@FID-230
	Scenario: Activities (Smoke)
		When the user enter valid credentials "posmanager26@info.com" "posmanager"
		And click on login button
		Then the user should be able to see Activities link on the top menu	

	
	@FID-231
	Scenario: Conversations (Smoke)
		When the user enter valid credentials "posmanager26@info.com" "posmanager"
		And click on login button
		Then the user should be able to see Conversations link on the top menu