# Autor: Deivis

@stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at Choucair academy with the automation course

  @scenario1

  Scenario: Search for a automation course
    Given than Deivis wants to complete a form telling us about him and his location
      | firtsname | lastname| email| monthBirth|
      | Deivis    | Miranda | deivis@gmail.com| January|
    When she search for the course on the Choucair academy plataform
    | strCourse |
    | Metodologia Bancolombia|
    Then he finds the course called
      | strCourse |
      | Metodologia Bancolombia|