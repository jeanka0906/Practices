@Celfar
Feature: Celfar converter page

    Background: Navigate to Celar converter page
        Given I am in the Celfar page

    @Scenario1
    Scenario Outline: As a user I will be convert Celcius to Fahrenheit
        When I cilck on then numeric field
        And I enter the following data <cel>
        And click on convertir button
        Then I will be able to validate the output data <far>

        Examples:
            | cel     | far                                           |
            | 10      | 50                                            |
            | -30     | -22                                           |
            | -273    | -459.4                                        |
            | -274    | El valor ingresado está debajo del 0 absoluto |
            | 123456  | 222252.8                                      |
            | 1234567 | El valor ingresado es muy largo               |
    


