$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ModuleLinks.feature");
formatter.feature({
  "name": "Module Links",
  "description": "  Agile Story: As a user I should be able to go to any module I have right to access on the top menu\n  Description: The purpose of this feature is to test if users can go all modules they are supposed to see",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ModuleLinks"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Users should be able to go to any module they have right to access",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user login as a \"\u003cUser Type\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the \"\u003cUser Type\u003e\" should be able to go related modules",
  "keyword": "Then ",
  "rows": [
    {
      "cells": [
        "\u003cModule1\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule2\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule3\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule4\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule5\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule6\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule7\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule8\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule9\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule10\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule11\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule12\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule13\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule14\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule15\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule16\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule17\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule18\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule19\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule20\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule21\u003e"
      ]
    },
    {
      "cells": [
        "\u003cModule22\u003e"
      ]
    }
  ]
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "User Type",
        "Module1",
        "Module2",
        "Module3",
        "Module4",
        "Module5",
        "Module6",
        "Module7",
        "Module8",
        "Module9",
        "Module10",
        "Module11",
        "Module12",
        "Module13",
        "Module14",
        "Module15",
        "Module16",
        "Module17",
        "Module18",
        "Module19",
        "Module20",
        "Module21",
        "Module22"
      ]
    },
    {
      "cells": [
        "POS Manager",
        "Discuss",
        "Calendar",
        "Notes",
        "Contacts",
        "CRM",
        "Sales",
        "Website",
        "Point of Sale",
        "Purchases",
        "Inventory",
        "Manufacturing",
        "Repairs",
        "Project",
        "Events",
        "Surveys",
        "Employees",
        "Attendances",
        "Leaves",
        "Expenses",
        "Maintenance",
        "Fleet",
        "Dashboards"
      ]
    },
    {
      "cells": [
        "Sales Manager",
        "Discuss",
        "Calendar",
        "Notes",
        "Contacts",
        "CRM",
        "Sales",
        "Website",
        "Point of Sale",
        "Purchases",
        "Inventory",
        "Repairs",
        "Invoicing",
        "Email Marketing",
        "Events",
        "Employees",
        "Leaves",
        "Expenses",
        "Maintenance",
        "Dashboards",
        "-",
        "-",
        "-"
      ]
    },
    {
      "cells": [
        "Expenses Manager",
        "Discuss",
        "Calendar",
        "Notes",
        "Contacts",
        "Website",
        "Events",
        "Employees",
        "Leaves",
        "Expenses",
        "Lunch",
        "Maintenance",
        "Dashboards",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-"
      ]
    },
    {
      "cells": [
        "Inventory Manager",
        "Discuss",
        "Calendar",
        "Notes",
        "Contacts",
        "Website",
        "Manufacturing",
        "Employees",
        "Leaves",
        "Expenses",
        "Maintenance",
        "Dashboards",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-"
      ]
    },
    {
      "cells": [
        "Manufacturing User",
        "Discuss",
        "Calendar",
        "Notes",
        "Contacts",
        "Website",
        "Events",
        "Employees",
        "Leaves",
        "Expenses",
        "Maintenance",
        "Dashboards",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Users should be able to go to any module they have right to access",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ModuleLinks"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user login as a \"POS Manager\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_login_as_a(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"POS Manager\" should be able to go related modules",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.ModuleLinksStepDefs.the_should_be_able_to_go_related_modules(java.lang.String,java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Users should be able to go to any module they have right to access",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ModuleLinks"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user login as a \"Sales Manager\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_login_as_a(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Sales Manager\" should be able to go related modules",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.ModuleLinksStepDefs.the_should_be_able_to_go_related_modules(java.lang.String,java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Users should be able to go to any module they have right to access",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ModuleLinks"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user login as a \"Expenses Manager\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_login_as_a(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Expenses Manager\" should be able to go related modules",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.ModuleLinksStepDefs.the_should_be_able_to_go_related_modules(java.lang.String,java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Users should be able to go to any module they have right to access",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ModuleLinks"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user login as a \"Inventory Manager\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_login_as_a(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Inventory Manager\" should be able to go related modules",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.ModuleLinksStepDefs.the_should_be_able_to_go_related_modules(java.lang.String,java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Users should be able to go to any module they have right to access",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ModuleLinks"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user login as a \"Manufacturing User\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.LoginStepDefs.the_user_login_as_a(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Manufacturing User\" should be able to go related modules",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.smlsnnshn.step_definitions.ModuleLinksStepDefs.the_should_be_able_to_go_related_modules(java.lang.String,java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});