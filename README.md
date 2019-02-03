The API is built to cater to multiple parallel threads and increment a number field in the database corresponding to each thread.

Method and Base URL:
You must always POST  to all counterRest API endpoints. The base URL is HTTP://<ServerName or IP(localhost)> : <Port number(8080)> /counter/incrementcounter
Eg- http://localhost:8080/counter/incrementcounter

Response:
The response consists of the String -
“success for number < xxx>” where xxx points to the value of the counter in the database corresponding to thread.
