FROM openjdk:8
EXPOSE 8080
ADD target/Calculator.jar Calculator.jar
ENTRYPOINT ["java", "-jar", "/Calculator.jar"]
CMD ["3","5"]
