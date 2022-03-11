# RingCentral SpringBoot (Java) App showing OAuth 2.0 with JWT

A Demo application showing how to use OAuth 2.0 with JWT when connecting with RingCentral Platform APIs.

## Setup & Run the Project

1. Login to [RingCentral Developer Portal](https://developers.ringcentral.com/login.html#/) and create an **REST API App** using **JWT Auth Flow** and provide it **ReadAccounts** permission under Security. If you don't have an account, you can get one for [free](https://developers.ringcentral.com/free-tier-sign-up.html)

2. Follow [step by step instructions](https://developers.ringcentral.com/guide/authentication/jwt/create-jwt) to JWT Credential for your application. Once you have the JWT Credentials, copy the same as we will need it in the next step.

3. Clone / Download this project and open it in your favorite IDE. Navigate to **application.properties** file and fill in the values in UPPERCASE with your application credentials that can be found in the RingCentral Developer Console including the JWT Credential that you created previously. Make sure to keep these credentials safe and avoid exposing them publicly.

```bash
rc.clientid = "YOUR APP CLIENT ID"
rc.clientsecret = "YOUR APP CLIENT SECRET"
rc.jwt = "YOUR PERSONAL JWT"
```

4. Build and Run the Maven Project

```
mvn install
./mvnw spring-boot:run
```

5. Navigate to **localhost:8080/account** and notice the webpage should say 'Confirmed' which is the status of your developer account that was returned by calling the RingCentral Platform API.

