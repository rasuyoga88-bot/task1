README.md

Manual Testing Report

Project Name:
ReqRes API Testing

Tester Name:
Yoga R

Testing Type:
Manual Testing

Testing Approach:
Functional Testing

Environment:
Postman

Test Execution Date:
03-06-2026

Project Description

The objective of this testing activity is to validate the functionality of the ReqRes API and ensure that API endpoints work correctly according to expected behavior. Testing was performed manually using Postman by sending requests and validating responses.

Scope of Testing

The following areas were covered during testing:

User retrieval

API response validation

Status code verification

Data accuracy validation

Request and response handling

Error handling

Test Environment

Tool Used:
Postman

API Base URL:
https://reqres.in/api

Operating System:
Windows

Test Scenarios Executed

TC_001
Verify GET Users API

Request:
GET /users?page=1

Expected Result:
Users list should be returned successfully.

Actual Result:
Users data returned correctly.

Status:
PASS

TC_002
Verify Single User Details

Request:
GET /users/2

Expected Result:
Selected user details should be displayed.

Actual Result:
User information displayed correctly.

Status:
PASS

TC_003
Verify User Creation

Request:
POST /users

Expected Result:
New user should be created successfully.

Actual Result:
User created successfully.

Status:
PASS

TC_004
Verify User Update

Request:
PUT /users/2

Expected Result:
User details should update successfully.

Actual Result:
User updated successfully.

Status:
PASS

TC_005
Verify User Deletion

Request:
DELETE /users/2

Expected Result:
User should be deleted successfully.

Actual Result:
Deletion completed successfully.

Status:
PASS

Execution Summary

Total Test Cases:
5

Passed:
5

Failed:
0

Blocked:
0

Pass Percentage:
100%

Defects Found

No defects were identified during execution.

Final Observation

All executed manual test cases passed successfully.

The ReqRes API responded correctly for GET, POST, PUT, and DELETE operations.

Response validation and status verification were completed successfully.

Conclusion

Manual testing confirmed that the ReqRes API functions as expected for the executed test scenarios. The application demonstrated stable behavior and correct responses during testing.

Prepared By:
Yoga R

