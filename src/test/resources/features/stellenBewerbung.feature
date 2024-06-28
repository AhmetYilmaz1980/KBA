Feature: Navigate to job listings on KBA website and apply for an IT job


  Scenario: User navigates to the job listings page and applies for an IT job
    Given the user is on the KBA home page
    When the user clicks on the "Karriere" link
    And the user clicks on the "Unsere Stellenangebote" link on Karriere page
    And the user clicks on a job listing containing "IT"
    And the user clicks on the Jetzt bewerben button
    And the user clicks on the "Neuanmeldung60" button
    Then the user verifies that they are on the "Kandidatenregistrierung" page