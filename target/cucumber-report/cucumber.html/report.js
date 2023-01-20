$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("topmenutab.feature");
formatter.feature({
  "line": 1,
  "name": "Virgin Free Game Feature",
  "description": "",
  "id": "virgin-free-game-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8340572600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "As a user I am testing top menu Free Game",
  "description": "",
  "id": "virgin-free-game-feature;as-a-user-i-am-testing-top-menu-free-game",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on virgin game home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I am clicking on Free Games",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I am on Free Game Page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I verify that I am on free game page \"Experience a Selection of Free Games\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnVirginGameHomePage()"
});
formatter.result({
  "duration": 121005800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAmClickingOnFreeGames()"
});
formatter.result({
  "duration": 237431400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAmOnFreeGamePage()"
});
formatter.result({
  "duration": 16500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Experience a Selection of Free Games",
      "offset": 38
    }
  ],
  "location": "MyStepdefs.iVerifyThatIAmOnFreeGamePage(String)"
});
formatter.result({
  "duration": 366518200,
  "status": "passed"
});
formatter.after({
  "duration": 846452200,
  "status": "passed"
});
});