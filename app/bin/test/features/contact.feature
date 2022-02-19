@Contact
Feature: Contact Page

    Background: Navigate to Contact page
        Given I am in the Contact page

    @Message
    Scenario: As a user I will be able to see contact page.
        Then I can visualize, No hay contactos guardados message

    @AddContact
    Scenario Outline: As a user I will be able to add a new contact
        When I choose Nuevo Contacto button
        And I enter my <name>
        And I type my <mail>
        Then I can validate input data sort alphabetically on grid table

        Examples:
            | name  | mail            |
            | perro | perro@perro.com |


