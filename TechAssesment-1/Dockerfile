# Usar una imagen base de OpenJDK 17
FROM adoptopenjdk/openjdk17:alpine

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR de la aplicación al contenedor
COPY target/TechAssesment-1-0.0.1-SNAPSHOT.jar /app

# Comando para ejecutar la aplicación cuando se inicie el contenedor
CMD ["java", "-jar", "TechAssesment-1-0.0.1-SNAPSHOT.jar"]
