Feature: AUT Mercury 

Background: 
	And load the URL
	
@reg @sanity
Scenario Outline: Login Positive 
	When user enter the username as "<username>" 
	And user enter the as "<password>" 
	#	And user click on the login button 
	Then loggin should success 
	Examples: 
		|username|password|
		|ortoniKC|Pass123$|
		|admin|pass|
@smoke @sanity		
Scenario: Login Positive 
	When user enter the username as "some user" 
	And user enter the as "pass" 
	And user click on the login button 
	Then loggin should success 
