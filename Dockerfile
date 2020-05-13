FROM openjdk:14-alpine
COPY target/MicronautTest-*.jar MicronautTest.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "MicronautTest.jar"]