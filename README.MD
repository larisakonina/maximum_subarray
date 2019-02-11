#XML Validator

## Buid and run

1. Clone this repository
2. Use gradle to build docker image. Run this command from project root directory:
``./gradlew dockerImage``
3. Run docker image using docker
`` docker run -t --rm -p 80:80 xmlvalidation/xmlvalidation:0.999``


## Running examples

Example files are provided in examples directory of this project.

Post files via curl:

`` curl -F "xml=@valid.xml" -F "xsd=@schema.xsd" http://127.0.0.1:80/``

If files are valid response status 200 - ok.

Posting invalid files would cause an error:

`` curl -F "xml=@invalid.xml" -F "xsd=@schema.xsd" http://127.0.0.1:80/``

Response:

``Validation error: cvc-complex-type.2.4.b: The content of element 'shipto' is not complete. One of '{address}' is expected.``





