# DBMS-Lab-QueryDSL

## Execution
```
git clone https://github.com/lomayd/DBMS-Lab-QueryDSL.git

cd ./DBMS-Lab-QueryDSL

[Write down "MYSQL_ROOT_PASSWORD" in docker-compose.yml]

docker-compose up -d

[Write down "spring.datasource.password" in /src/main/resources/application.yml]

sudo chmod 755 ./gradlew

./gradlew build

java -jar build/libs/DBMS-Lab-QueryDSL-0.0.1-SNAPSHOT.jar 
```

## Contents
- Executing QueryDSL JPA Using QClass
