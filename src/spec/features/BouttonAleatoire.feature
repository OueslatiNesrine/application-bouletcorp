@testAleatoire
Feature: Je souhaite verifier l affichage du choix aleatoire
  

  @Aleatoire
  Scenario: Je souhaite verifier l affichage du choix aleatoire
    Given Je me connecte sur l application bouletcorp "https://bouletcorp.com/"
    When Je tape sur le bouton aleatoire
    Then Je verifie la page change
    And les widgets facebouk, twitter et tumblr sont bien affiches 
  
