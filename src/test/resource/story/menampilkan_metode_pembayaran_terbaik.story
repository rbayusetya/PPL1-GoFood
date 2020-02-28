Find out the best payment method

Narrative:
In order to pay for order
As a customer
I want to choose the best payment method

Scenario: Recommend payment method if balance enough
Given rhio has balance 1000
When amount is 500
Then system should recommend gopay payment method

Scenario: Recommend payment method if balance not enough
Given adjie has balance 10000
When amount is 15000000
Then system should recommend cash payment method

Scenario: Using Go-Pay + Cash, reduce balance
Given Adjie has balance 10000
When amount is 15000
Then system must set balance to 0
And system must set cash to 5000