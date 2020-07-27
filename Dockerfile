FROM openjdk:8-jdk
MAINTAINER Nithish Selvakumaran
WORKDIR /usr/local/bin
COPY ./target/demo-0.0.1-SNAPSHOT.jar .
CMD ["java" ,"-jar", "demo-0.0.1-SNAPSHOT.jar" ]
