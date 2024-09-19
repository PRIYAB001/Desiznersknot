Feature:Verify the signup flow for designers

  Scenario: Verify Designer is able to create a account
    Given Designer is on signup page
    When Designer enters the name in signup Page
    And Designer enters the mailid in signup page
    And Designer enters username and password in signup page
    And Designer selects the profile in sign up page
    And Designer accepts the terms and conditions in signup page
    And click on signup button
    Then verify user is redirected to create profile page
    And user add a profile image in create profile page
    And user enters the location as "Chennai" in create profile page
    And user click on done button in create profile page
    And verify user is redirected to dashboard page
#    Given Designer click on the sign up link in login page