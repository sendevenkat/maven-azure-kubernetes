FROM openjdk:11
ADD target/*.jar ltimgenie-azuredevops-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","ltimgenie-azuredevops-0.0.1-SNAPSHOT.jar"]