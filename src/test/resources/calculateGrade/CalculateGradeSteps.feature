Feature: give grades

As a professor
the professor can give the students the grades easily and accurately
so that the professor can make no mistakes for grading students


 Scenario: Calculate grade
  	Given the student with id "1234" has mid exam score 30 and final exam score 30  and homework  score 30
  	And the student with id "2345" has mid exam score 10 and final exam score 15  and homework  score 15 
  	And the student with id "3456" has mid exam score 33 and final exam score 35  and homework  score 30 
   	When the professor gives the students grades
   	Then the grade of the student with id "3456"  should be "A"

 
