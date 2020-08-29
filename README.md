Angular + Spring App

Built via Maven

Quick-start:
```
git clone https://github.com/oktadeveloper/okta-spring-boot-2-angular-8-example.git

cd okta-spring-boot-2-angular-8-example/client

npm install

ng serve &

cd ../server

./mvnw spring-boot:run
```

Reference:

https://developer.okta.com/blog/2019/05/13/angular-8-spring-boot-2

Tips:

If using IntelliJ (or if Lombok annotation is not working in general) you must first install the Lombok IDE plugin.

Installing Angular may result in an error if Node installer was used (which installs npm in a local directory). To resolve the issue, install node using a Node Version Manager (NVM) which will install npm globally, resolving any permission errors during an npm install.

Technologies used:

Okta
Lombok
