@testAleatoire
Feature: Je souhaite verifier l affichage du choix aleatoire
  

  @Aleatoire
  Scenario: Je souhaite verifier l affichage du choix aleatoire
    Given Je me connecte sur l application bouletcorp "https://bouletcorp.com/"
    When Je tape sur le bouton aleatoire
    Then Je verifie la page change
    And Je verifie boutton twitter
    And Je verifie boutton facebook
    And je verifie boutton tumblr
    
