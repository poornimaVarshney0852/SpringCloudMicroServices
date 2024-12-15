Echo service-registry: BUild and Packaging
cd service-registry/
@REM mvn clean install
mvn package

cd ..

Echo Employee-Service: BUild and Packaging
cd Employee-Service/
@REM mvn clean install
mvn package

cd ..

Echo Department-Service: BUild and Packaging
cd Department-Service/
@REM mvn clean install
mvn package

cd ..

Echo config-server: BUild and Packaging
cd config-server/
@REM mvn clean install
mvn package

cd ..

Echo API-Gateway: BUild and Packaging
cd API-Gateway/
@REM mvn clean install
mvn package

echo check the projects built status.

STOP

