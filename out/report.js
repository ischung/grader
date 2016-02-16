$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("calculateGrade/CalculateGradeSteps.feature");
formatter.feature({
  "line": 1,
  "name": "give grades",
  "description": "\r\nAs a professor\r\nthe professor can give the students the grades easily and accurately\r\nso that the professor can make no mistakes for grading students",
  "id": "give-grades",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Calculate grade",
  "description": "",
  "id": "give-grades;calculate-grade",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "the student with id \"1234\" has mid exam score 30 and final exam score 30  and homework  score 30",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "the student with id \"2345\" has mid exam score 10 and final exam score 15  and homework  score 15",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the student with id \"3456\" has mid exam score 33 and final exam score 35  and homework  score 30",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the professor gives the students grades",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the grade of the student with id \"3456\"  should be \"A\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 21
    },
    {
      "val": "30",
      "offset": 46
    },
    {
      "val": "30",
      "offset": 70
    },
    {
      "val": "30",
      "offset": 94
    }
  ],
  "location": "CalcGradeStepDefs.addScore(String,int,int,int)"
});
formatter.result({
  "duration": 136485442,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2345",
      "offset": 21
    },
    {
      "val": "10",
      "offset": 46
    },
    {
      "val": "15",
      "offset": 70
    },
    {
      "val": "15",
      "offset": 94
    }
  ],
  "location": "CalcGradeStepDefs.addScore(String,int,int,int)"
});
formatter.result({
  "duration": 210054,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3456",
      "offset": 21
    },
    {
      "val": "33",
      "offset": 46
    },
    {
      "val": "35",
      "offset": 70
    },
    {
      "val": "30",
      "offset": 94
    }
  ],
  "location": "CalcGradeStepDefs.addScore(String,int,int,int)"
});
formatter.result({
  "duration": 365713,
  "status": "passed"
});
formatter.match({
  "location": "CalcGradeStepDefs.theProfessorGivesTheStudentsGrades()"
});
formatter.result({
  "duration": 118711,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3456",
      "offset": 34
    },
    {
      "val": "A",
      "offset": 52
    }
  ],
  "location": "CalcGradeStepDefs.theGradeOfTheStudentWithIdShouldBe(String,Grade)"
});
formatter.result({
  "duration": 6584882,
  "status": "passed"
});
});