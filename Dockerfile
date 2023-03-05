FROM openjdk:8
EXPOSE 8080
ADD target/cicdjava-image.jar cicdjava-image.jar
ENTRYPOINT ["java","-jar","/cicdjava-image.jar"]