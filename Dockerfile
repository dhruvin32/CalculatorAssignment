FROM openjdk:8
EXPOSE 8080
ADD target/spe_calculator.jar spe_calculator.jar
ENTRYPOINT ["java", "-jar", "/spe_calculator.jar"]
CMD ["3","5"]
