# hello-maven-plugin

## Build Mojo

Install the plugin jar in the local repository:

```
mvn install
```

## Executing Mojo

### Executing on the Command Line

Specify a fully-qualified goal in the form of `groupId:artifactId:version:goal`. Example:

```
mvn com.tatsuyaoiw:hello-maven-plugin:1.0.0-SNAPSHOT:sayhi
```

Or omit version:

```
mvn com.tatsuyaoiw:hello-maven-plugin:sayhi
```

### Attaching the Mojo to the Build Lifecycle

Attach specific goals to a particular phase of the build lifecycle. Example:

```xml
<build>
  <plugins>
    <plugin>
      <groupId>com.tatsuyaoiw</groupId>
      <artifactId>hello-maven-plugin</artifactId>
      <version>1.0.0-SNAPSHOT</version>
      <executions>
        <execution>
          <phase>compile</phase>
          <goals>
            <goal>sayhi</goal>
          </goals>
        </execution>
      </executions>
    </plugin>
  </plugins>
</build>
```

This causes the simple mojo to be executed whenever Java code is compiled.
