FROM openjdk:8-jre-alpine

COPY ./target/helloworld.war helloworld.war

EXPOSE 8080

CMD ["java","-jar","helloworld.war"]