Feature: Footer
  As a user
  I should navigate through footer links appropriately

  @footer @footerMenu
  Scenario Outline: Validate the redirection of Footer links
    Given I am on home page"https://ekaya.in/"
    When I click on "<footerLinkName>"
    Then I should be on page with text as "<expectedPageText>"

    Examples:
      | footerLinkName     | expectedPageText    |
      | Our Story          | Our Story           |
      | In The Press       | Press               |
      | Contact Us         | Get in Touch        |
      | Shipping & Returns | Shipping and Return |

 @footer @MenuNov
  Scenario Outline: Validate the redirection of Footer links
    Given I am on home page"https://ekaya.in/"
    When I click on "<footerLinkName>"
    Then I should be on page with text as "<expectedPageText>"

    Examples:
      | footerLinkName    | expectedPageText |
      | Privacy Policy    | Our Story        |
      | Return & Exchange | Press            |
      | Terms of Service  | Get in Touch     |
      | Refund Policy     | Refund Policy    |

