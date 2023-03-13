@tag
Feature: Admin Login
  I want to use this template to check Admin Login Feature.

  @tag1
  Scenario: Check Admin Login with valid inputs 
  Given i opedggn browser with url "http://orangehrm.qedgetech.com"  
  Then i should see login page
  When i enter username as "Admin"
  And i enter password as "Qedge123!@#"
  And i click login
  Then i should see admin module
  When i click logout
  Then i should see login page
  When i close browser	
  
  
  
  
  @tag2	 
	Scenario Outline: Check Admin Loign with invalid inputs
	Given i open browser with url "http://orangehrm.qedgetech.com"  
  Then i should see login page
  When i enter username as "<uname>"
  And i enter password as "<pword>"
  And i click login
  Then i should see error message
  When i close browser
  
  Examples:
  |uname|pword|
  |Admin|xyz|
  |abc|QEdge123|
  |abc|xyz|  
  
  