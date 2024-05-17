# Maven Demo Application

Run
```
mvn clean package
java -cp app/target/app-1.1-SNAPSHOT.jar:module1/target/module1-1.1-SNAPSHOT.jar:module2/target/module2-1.1-SNAPSHOT.jar com.tibco.mvndemo.App
```

pkg
```
cd pkg
mvn dependency:copy-dependencies -DoutputDirectory=libs
mvn dependency:build-classpath -Dmdep.prefix="libs"
java -cp libs/app-1.1-SNAPSHOT.jar:libs/module1-1.0.jar:libs/module2-1.1-SNAPSHOT.jar com.tibco.mvndemo.App

# Update only Module2
cd ../module2
mvn install
cd ../pkg
mvn dependency:build-classpath -Dmdep.prefix="libs"
java -cp libs/app-1.1-SNAPSHOT.jar:libs/module1-1.0.jar:libs/module2-1.1-SNAPSHOT.jar com.tibco.mvndemo.App

```