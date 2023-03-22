#Comme base de notre image, nous prendrons Alpine Linux compatible Java créé dans la section précédente.
FROM openjdk:17-jdk-alpine
#MAINTAINER baeldung.com
MAINTAINER baeldung.com
EXPOSE 8082
ARG JAR_FILE=target/*.jar
#Nous laissons Docker copier notre fichier jar dans l'image.
COPY ./target/gitcicd.jar app.jar
#Ce sera l'exécutable à démarrer au démarrage du conteneur.
ENTRYPOINT ["java","-jar","/app.jar"]