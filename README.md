# Eagle Platform Backoffice

## Deploying Backoffice
As we need a Liferay Portal 7 as runtime, we need to specify the `deploy`
folder for the portal. For that reason, we can set a Gradle property in
`gradle.properties` file for user, located in `~/.gradle/gradle.properties`.

The Gradle property you have to configure is `eagle.backoffice.deploy.dir`:
```
eagle.backoffice.deploy.dir=/tmp/deploy
```