Angular + Spring App

Built with Maven

Quick-start:
```
# To pull and install dependencies
git clone https://github.com/Hondasan/carbase.git
cd carbase-client/client
npm install (requires nvm/npm installed, and Angular Cli)

# To build & serve Angular app
ng serve &
cd ../carbase-server

# To build & run Java Spring
./mvnw spring-boot:run (for Mac)
# For Windows, run CarbaseApplication as a Java application
# If needed, ensure Maven script is imported and dependencies are pulled
```
**Note: If cloning the project only, an Okta account must be created and the auth files must be updated with the appropriate Okta domains for the project to work. Otherwise, the authentication/login will fail. See tutorial for more information.

---

Reference:

https://developer.okta.com/blog/2019/05/13/angular-8-spring-boot-2

Tips & troubleshooting:

- If using IntelliJ (or if Lombok annotation is not working in general) you must first install the Lombok IDE plugin.

- Installing Angular may result in an error if Node installer was used (which installs npm in a local directory). To resolve the issue, install node using a Node Version Manager (NVM) which will install npm globally, resolving any permission errors during an npm install.

- --enable-ivy option may not be recognized with newer versions of Angular, which is set to true by default

- New version of Angular (9+) no longer allows imports from '@angular/material'; each import must be defined with its specific source folder.

- If some imports don't work (especially due to commenting out Okta dependency in the beginning of Okta tutorial) go to: File > Invalidate Caches and Restart

---

Towards the end, there are a lot of issues getting Okta login to work correctly that are not addressed in the tutorial.

The fixes:

In the app's settings in Okta console, make sure the options are set as such:
- Authorization Code is checked
- Implicit is checked
- Both items under implicit are also checked

Login redirect URI and Initiate Login URI: http://localhost:4200/implicit/callback

Logout redirect URI: http://localhost:4200

Login initiated by: App Only

Check the tutorial's repo for the correct code / files:

- auth-routing-module.ts (delete the scopes attribute; Insert the client ID and issuer in the oktaConfig as necessary, and make sure the redirectUri has /implicit/callback; Make sure the path a few lines down is also implicit/callback)
- auth.interceptor.ts (just copy the code from the repo and use it to completely replace the auto-generated code from the schematic command)


