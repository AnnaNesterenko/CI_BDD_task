Meta:

@importance smoke
@smoke2

Scenario: Bdd Test - Add New Place
Given the customer selects the location for adding new place
When the customer requests adding new place
And the customer fills in all required fields for new place with number 4
And the customer submits adding new place
Then the customer should see the new place 4 is added



