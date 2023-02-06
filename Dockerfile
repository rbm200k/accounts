FROM openjdk as build

MAINTAINER rbm200k	

COPY target/accounts-1.0.jar accounts-1.0.jar

ENTRYPOINT ["java","-jar","/accounts-1.0"]