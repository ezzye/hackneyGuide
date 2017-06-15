# Created by ellioe03 at 26/03/2017
Feature: Hackney Guide
  You can ask me for an attraction, the local news, or  say help. What will it be?
  based on skill-sample-nodejs-city-guide

  Scenario: Launching app responds with launch message
    When launch-request message sent to Lambda
    Then Lambda will respond with a welcome message launch-response


  Scenario: After Launching ask for more information responds with an overview
    Given app has launched
    When getOverview intent message sent to Lambda
    Then Lambda will respond with overview response


