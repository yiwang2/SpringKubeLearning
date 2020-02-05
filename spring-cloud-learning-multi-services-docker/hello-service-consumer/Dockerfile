FROM openjdk:12.0.2

EXPOSE 8080

ADD ./target/*.jar hello-service-consumer.jar

ENTRYPOINT ["java","-jar","/hello-service-consumer.jar"]