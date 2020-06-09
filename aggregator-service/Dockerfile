FROM java:8

EXPOSE 8080

ADD target/aggregator-service.jar aggregator-service.jar

ENTRYPOINT ["java","-jar","aggregator-service.jar"]