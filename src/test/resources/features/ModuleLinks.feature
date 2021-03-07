@Basepage @ModuleLinks
Feature: Module Links
  Agile Story: As a user I should be able to go to any module I have right to access on the top menu
  Description: The purpose of this feature is to test if users can go all modules they are supposed to see

  Scenario Outline: Users should be able to go to any module they have right to access
    When the user login as a "<User Type>"
    Then the "<User Type>" should be able to go related modules
      | <Module1>  |
      | <Module2>  |
      | <Module3>  |
      | <Module4>  |
      | <Module5>  |
      | <Module6>  |
      | <Module7>  |
      | <Module8>  |
      | <Module9>  |
      | <Module10> |
      | <Module11> |
      | <Module12> |
      | <Module13> |
      | <Module14> |
      | <Module15> |
      | <Module16> |
      | <Module17> |
      | <Module18> |
      | <Module19> |
      | <Module20> |
      | <Module21> |
      | <Module22> |
    Examples:
      | User Type          | Module1 | Module2  | Module3 | Module4  | Module5 | Module6       | Module7   | Module8       | Module9   | Module10    | Module11      | Module12   | Module13        | Module14 | Module15  | Module16  | Module17    | Module18    | Module19   | Module20    | Module21 | Module22   |
      | POS Manager        | Discuss | Calendar | Notes   | Contacts | CRM     | Sales         | Website   | Point of Sale | Purchases | Inventory   | Manufacturing | Repairs    | Project         | Events   | Surveys   | Employees | Attendances | Leaves      | Expenses   | Maintenance | Fleet    | Dashboards |
      | Sales Manager      | Discuss | Calendar | Notes   | Contacts | CRM     | Sales         | Website   | Point of Sale | Purchases | Inventory   | Repairs       | Invoicing  | Email Marketing | Events   | Employees | Leaves    | Expenses    | Maintenance | Dashboards | -           | -        | -          |
      | Expenses Manager   | Discuss | Calendar | Notes   | Contacts | Website | Events        | Employees | Leaves        | Expenses  | Lunch       | Maintenance   | Dashboards | -               | -        | -         | -         | -           | -           | -          | -           | -        | -          |
      | Inventory Manager  | Discuss | Calendar | Notes   | Contacts | Website | Manufacturing | Employees | Leaves        | Expenses  | Maintenance | Dashboards    | -          | -               | -        | -         | -         | -           | -           | -          | -           | -        | -          |
      | Manufacturing User | Discuss | Calendar | Notes   | Contacts | Website | Events        | Employees | Leaves        | Expenses  | Maintenance | Dashboards    | -          | -               | -        | -         | -         | -           | -           | -          | -           | -        | -          |


