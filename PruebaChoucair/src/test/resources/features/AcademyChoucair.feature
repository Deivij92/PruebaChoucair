# Autor: Deivis

@stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at Choucair academy with the automation course

  @scenario1

  Scenario: Search for a automation course
    Given than Rose want to learn automation at the Academy Choucair
    | strUser    | strPassword|
    | 1068664830 | Choucair2021*|
    When she search for the course on the Choucair academy plataform
    | strCourse |
    | Metodologia Bancolombia|
    Then he finds the course called
      | strCourse |
      | Metodologia Bancolombia|