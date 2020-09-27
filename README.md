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

--enable-ivy option may not be recognized with newer versions of Angular, which is set to true by default

New version of Angular (9+) no longer allows imports from '@angular/material'; each import must be defined with its specific source folder

If some imports don't work (especially due to commenting Okta dependency in the beginning) go to: File > Invalidate Caches and Restart

Towards the end, there are alot of issues getting Okta login to work correctly that are not addressed in the tutorial.

The fixes:

In the app's settings in Okta console, make sure the options are set as such:
- Authorization Code is checked
- Implicit is checked
- Both items under implicit are also checked

Login redirect URI and Initiate Login URI: http://localhost:4200/implicit/callback

Logout redirect URI: http://localhost:4200

Login initiated by: App Only

Check the repo or the correct code for the files:

- auth-routing-module.ts (delete the scopes attribute; Insert the client ID and issuer in the oktaConfig as necessary, and make sure the redirectUri has /implicit/callback; Make sure the path a few lines down is also implicit/callback)
- auth.interceptor.ts (just copy the code from the repo and use it to completely replace the auto-generated code from the schematic command)



Technologies used:

Okta
Lombok
