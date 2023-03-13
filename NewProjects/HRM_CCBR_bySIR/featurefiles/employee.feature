@tag
Feature: Employee Registration
  I want to use this template to check New Employee Registration.

  @tag1
  Scenario: Check New Employee Registration with valid inputs
  Given i open browser with url "http://orangehrm.qedgetech.com"  
  When i enter username as "Admin"
  And i enter password as "Qedge123!@#"
  And i click login
  And i goto add employee page
  And i enter firstname as "Anjan"
  And i enter lastname as "Demo"
  And i click save
  Then i should see registered employee in employee list
  When i click logout
  And i close browser