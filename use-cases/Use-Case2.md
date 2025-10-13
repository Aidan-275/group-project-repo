# USE CASE: The organisation requires a report to be generated which displays the top number populated countries in the world, continent or region.

## CHARACTERISTIC INFORMATION

### Goal in Context

The organisation requires a report to be generated which displays the top number populated countries in the world, continent or region.

### Scope

Organisation.

### Level

Primary task.

### Preconditions

The database contains the data for Code, Name, Continent, Region, Population and Capital columns.

### Success End Condition

A report is available for the organisation to access.

### Failed End Condition

No report is produced.

### Primary Actor

Organisation employee.

### Trigger

A request for the information is made by the user with the desired parameters.

## MAIN SUCCESS SCENARIO

1. User is asked whether they want a report on the countries in the world, continent or region.
2. The user is inputs how many countries they want displayed.
3. The report is generated and the user can use it as they wish.

## EXTENSIONS

1. "Please input a valid number"
   -Occurs when a number is not a positive integer.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
