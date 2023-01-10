# Autor : Nestor Eduardo Rincon Mora
@stories
Feature: Testing the reto
  As a user, I want to test the Elements tools

  @scenario1
  Scenario Outline: Test the Elements tools
    Given than I want to test the elements
    When I perform different actions
      | strUserName   | strPassword   |
      | <strUserName> | <strPassword> |
    Then I expect get the correct result

    Examples:
      | strUserName | strPassword                                      |
      | 520624      | 10df2f32286b7120Mi00LTQyNjAyNQ==30e0c83e6c29f1c3 |

