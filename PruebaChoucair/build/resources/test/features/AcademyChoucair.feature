# Autor: Deivis

@stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at Choucair academy with the automation course

  @scenario1

  Scenario: Search for a automation course
    Given than Deivis wants to complete a form telling us about him and his location
      | firtsname | lastname| email| monthBirth| dayBirth| yearBirth|  country| city| postal|
      | Deivis    | Miranda | deivis@gmail.com| May| 5   | 1992     |Colombia| Barranquilla, Atlantico, Colombia| 11151|

    When I want to add my devices
  |osComputer|version|languaOs|typeDevice|model|osMobile|
  |Linux   |Ubuntu     |Spanish | Xiaomi   |Redmi 8| Android 10|

    Then record all your data
      |  password|repeatPassword|
      | Deivisj92@ |Deivisj92@|