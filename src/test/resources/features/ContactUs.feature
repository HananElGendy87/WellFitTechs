Feature: submitting information to contact us Module

  Background: User is already on Contact Us page

    Scenario: USer submits invalid phone number and email address in contact us form


      Given user is on contact us page
      And user enters name "Hanan"
      And user enters company name "clinic"
      And user enters invalid phone number "1234567"
      Then user enters invalid email address "hanan@wellfit.han"
      Then user selects "DENTAL PLANS" from the options
      Then user clicks send button
      Then system should display the error message of your submission failed because of an error






