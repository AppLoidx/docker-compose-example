# build stage
FROM maven:3.6.3-openjdk-11 as target
WORKDIR /build
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src/ /build/src/
RUN mvn package

# image run stage

FROM openjdk:11

EXPOSE 4567
COPY --from=target /build/target/*.jar /app/api.jar
CMD exec java $JAVA_OPTS -jar /app/api.jar
