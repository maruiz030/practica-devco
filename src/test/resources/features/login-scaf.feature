Feature: Login SCAF

  Scenario Outline: Login scaf
    Given User is on the login page
    When User attempts to login with credentials:
      | username   | password   |
      | <username> | <password> |
    Then he should be presented message
      | message   |
      | <message> |

    Examples:
      | username | password  | message     |
      | maruiz   | Admin002* | Biienvenido |
