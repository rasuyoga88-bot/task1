README.md

Performance Test Report – ReqRes API


Test Details

Task: Performance Testing

Target URL:
https://reqres.in/api/users?page=1

Method:
GET

Concurrent Users:
50

Test Duration:
2 Minutes

Tool Used:
Postman Performance Runner


Objective

The objective of this performance test is to evaluate the response time, throughput, reliability, and overall behavior of the ReqRes API under concurrent user load.


Test Configuration

API Endpoint:
GET /api/users?page=1

Concurrent Virtual Users:
50

Execution Duration:
2 minutes

Load Pattern:
Fixed Profile

Environment:
Local Execution using Postman Performance Runner


Performance Metrics

Total Requests Sent:
13,800

Requests per Second (Throughput):
114.16 req/s

Average Response Time:
350 ms

P90 Response Time:
550 ms

P95 Response Time:
762 ms

P99 Response Time:
1,433 ms

Error Rate:
0.00%

Failure Rate:
0.00%

Peak CPU Usage:
85.6%

Peak Memory Usage:
94.4%


Response Time Analysis

Average Response Time

The API maintained an average response time of 350 ms, showing good responsiveness under load.

Minimum and Maximum Response Time

Minimum response time remained stable during execution.

Maximum response time reached approximately 1,433 ms during peak load.

Percentile Analysis

P90 = 550 ms

P95 = 762 ms

P99 = 1,433 ms

These percentile values indicate that most requests completed successfully within acceptable limits while only a small number experienced higher latency.


Throughput Analysis

The system processed 114.16 requests per second.

Total requests executed during the test:
13,800

Throughput remained consistent throughout the execution.


Error Analysis

Failed Requests:
0

Error Percentage:
0.00%

Failure Percentage:
0.00%

No request failures or errors were observed during execution.


Resource Utilization

Peak CPU Usage:
85.6%

Peak Memory Usage:
94.4%

Observation

CPU utilization remained high but manageable.

Memory usage reached a high utilization level and should be monitored during larger-scale testing.


Final Observation

The ReqRes API performed successfully under a load of 50 concurrent users for 2 minutes.

Key Findings

Stable throughput of 114.16 req/s

Low average response time of 350 ms

Zero request failures

Acceptable latency distribution across P90 and P95

High memory utilization observed during peak execution


Conclusion

The performance test confirms that the ReqRes API can handle moderate concurrent traffic efficiently with stable response times and no observed failures.

Further testing with increased users and longer execution duration is recommended to validate scalability and improve resource optimization.


Prepared By:
Yoga R

03-06-2026
