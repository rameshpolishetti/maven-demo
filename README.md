# Maven Demo Application

Run
```
mvn clean package
java -cp app/target/app-1.0-SNAPSHOT.jar:module1/target/module1-1.0-SNAPSHOT.jar:module2/target/module2-1.0-SNAPSHOT.jar com.tibco.mvndemo.App
```

pkg
```
cd pkg
mvn dependency:copy-dependencies -DoutputDirectory=libs
java -cp libs/app-1.0-SNAPSHOT.jar:libs/module1-1.0-SNAPSHOT.jar:libs/module2-1.0-SNAPSHOT.jar com.tibco.mvndemo.App
```