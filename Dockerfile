FROM maven:3.5.3-jdk-8

WORKDIR OldMFrame/
COPY pom.xml .
RUN ["mvn", "verify", "clean", "--fail-never"]
COPY . .
COPY WebTest.xml .


RUN mvn package

CMD java -cp target/OldMFrame-1.0-SNAPSHOT-jar-with-dependencies.jar org.testng.TestNG WebTest.xml