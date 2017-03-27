# Created by ellioe03 at 26/03/2017
Feature: Hackney Guide
  You can ask me for an attraction, the local news, or  say help. What will it be?

  Scenario: Launching app responds with launch message
    Given a client for aws Lambda
    When launch_message sent to Lamda
    Then Lambda will respond with a welcome_message


