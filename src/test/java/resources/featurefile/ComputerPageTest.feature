Feature: Computer page test
  As a user I want to check following scenario on computer page of nop commerce website

  @Sanity@Regression
  Scenario: verify User Should Navigate To Computer Page Successfully
    Given I am on homepage
    And I click on"Computers" tab
    Then Verify the 'computer' text

  @Smoke@Regression
  Scenario: verify User Should Navigate To Desktops Page Successfully
    Given I am on homepage
    And I click on"Computers" tab
    And I click on"Desktops" sub tab
    Then Verify 'Desktops' text

  @Regression
  Scenario Outline:verify That User Should Build Your Own Computer And Add Them To Cart Successfully
    Given I am on homepage
    And I click on"Computers" tab
    And I click on"Desktops" sub tab
    And Click on product name "Build your own computer"
    And Select processor "<processor>"
    And Select RAM "<ram>"
    And Select HDD "<hdd>"
    And Select OS "<os>"
    And Select Software "<software>"
    And Click on 'ADD TO CART' Button
    And Verify message 'The product has been added to your shopping cart'
    Examples:

      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | VistaHome [+$50.00]     | Total Commander [+$5.00]   |
