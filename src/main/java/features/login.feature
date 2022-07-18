Feature: Login into Application

Scenario: positive test validating login
Given Initialize browser in chrome 
And Navigating to "https://www.qaclickacademy.com/" site
And Click on login link
When user enter "debasishroy999@gmail.com" and "abc@123" and logsin
Then verify that user is successfully login

Scenario Outline: positive test validating login
Given Initialize browser in chrome 
And Navigating to "https://www.qaclickacademy.com/" site
And Click on login link
When user1 enter <username> and <password> and logsin
Then verify that user is successfully login

Examples:
|username		|password  |
|test123		|test123   |
|test1234		|test1234  |