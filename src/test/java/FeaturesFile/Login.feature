Feature: Application Login

Scenario: Home page default login
Given Initialize the browser with chrome
And Naviagate to url
And Click on login to home page to land on secure sign in page
When When user enteres username and password and logs in
Then Verify that user is succesfully signed in