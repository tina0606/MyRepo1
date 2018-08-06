$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/capg/ConferenceQ/calculator.feature");
formatter.feature({
  "line": 3,
  "name": "Calculator",
  "description": "I want to do addition",
  "id": "calculator",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Addition of two numbers",
  "description": "",
  "id": "calculator;addition-of-two-numbers",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I want to add two numbers",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "to add \u003ca\u003e and \u003cb\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "result should be \u003cstatus\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "calculator;addition-of-two-numbers;",
  "rows": [
    {
      "cells": [
        "a",
        "b",
        "status"
      ],
      "line": 14,
      "id": "calculator;addition-of-two-numbers;;1"
    },
    {
      "cells": [
        "2",
        "5",
        "7"
      ],
      "line": 15,
      "id": "calculator;addition-of-two-numbers;;2"
    },
    {
      "cells": [
        "5",
        "7",
        "12"
      ],
      "line": 16,
      "id": "calculator;addition-of-two-numbers;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Addition of two numbers",
  "description": "",
  "id": "calculator;addition-of-two-numbers;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    },
    {
      "line": 7,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I want to add two numbers",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "to add 2 and 5",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "result should be 7",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Calculator.i_want_to_add_two_numbers()"
});
formatter.result({
  "duration": 249616642,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 7
    },
    {
      "val": "5",
      "offset": 13
    }
  ],
  "location": "Calculator.to_add_and(int,int)"
});
formatter.result({
  "duration": 1719678,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 17
    }
  ],
  "location": "Calculator.result_should_be(int)"
});
formatter.result({
  "duration": 106249,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Addition of two numbers",
  "description": "",
  "id": "calculator;addition-of-two-numbers;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    },
    {
      "line": 7,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I want to add two numbers",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "to add 5 and 7",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "result should be 12",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Calculator.i_want_to_add_two_numbers()"
});
formatter.result({
  "duration": 49638,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 7
    },
    {
      "val": "7",
      "offset": 13
    }
  ],
  "location": "Calculator.to_add_and(int,int)"
});
formatter.result({
  "duration": 109531,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 17
    }
  ],
  "location": "Calculator.result_should_be(int)"
});
formatter.result({
  "duration": 114043,
  "status": "passed"
});
});