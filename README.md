# CS-320-software-test-automation

1.) How can I ensure that my code, program, or software is functional and secure?
  
  I ensure that my code is functional and secure by aligning implementation closely with documented requirements and validating each behavior through unit testing. 
In Project One, I created JUnit tests to verify both valid and invalid inputs, using techniques such as boundary-value and negative testing to catch errors early. Writing tests alongside the service classes helped confirm that constraints were enforced consistently and that failures were handled safely rather than allowing invalid data to propagate. This approach improved reliability, reduced regressions, and helped prevent defects from reaching production.

2.) How do I interpret user needs and incorporate them into a program?
  
  I interpreted user needs by carefully analyzing requirements and translating them into clear validation rules. Rather than assuming how a system should behave, I relied on requirements to define what inputs are allowed, what actions should be rejected, and how errors should be communicated. By encoding these rules into both the implementation and the tests, I ensured that the software behaved predictably from a user’s perspective.

3.) How do I approach designing software?
  
  When designing software, I focused on simplicity, separation of concerns, and testability. I structured classes so that each component has a single responsibility and could be tested in isolation. This approach made it easier to write unit tests and identify defects. I also design with maintainability in mind, knowing that software evolves and that most people are not computer-literate. 
