FROM openjdk:17-slim as build

RUN apt-get update && apt-get install -y \
    wget \
    unzip && \
    wget https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.4/apache-maven-3.9.4-bin.zip -P /tmp && \
    unzip /tmp/apache-maven-3.9.4-bin.zip -d /opt && \
    ln -s /opt/apache-maven-3.9.4 /opt/maven && \
    ln -s /opt/maven/bin/mvn /usr/bin/mvn

WORKDIR /app
COPY . /app
RUN mvn clean package -DskipTests

FROM openjdk:17-slim
COPY --from=build /app/target/*.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
