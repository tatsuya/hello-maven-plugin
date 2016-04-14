# hello-maven-plugin

## Build Mojo

Install the plugin jar in the local repository:

```
mvn install
```

## Executing Mojo

Specify a fully-qualified goal in the form of:

```
mvn com.tatsuyaoiw:hello-maven-plugin:1.0.0-SNAPSHOT:sayhi
```

Or omit version:

```
mvn com.tatsuyaoiw:hello-maven-plugin:sayhi
```
