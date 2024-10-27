# Utilitza una imatge base de Java
FROM openjdk:17-jdk-slim

# Estableix el directori de treball
WORKDIR /app

# Copia el fitxer JAR al contenidor
COPY build/libs/*.jar app.jar

# Exposa el port en què correrà l'aplicació
EXPOSE 8080

# Comanda per iniciar l'aplicació
ENTRYPOINT ["java", "-jar", "app.jar"]
