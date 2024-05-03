## Sistema de Gestión de Cine

Este proyecto es un sistema de gestión de cine desarrollado con Spring Boot para el backend y React para el frontend. Permite la programación de películas, la administración de salas, la gestión de horarios de proyección y el proceso de reservaciones por parte de los clientes.

### Características principales:
- **Películas:** Registro detallado de películas con título, director, duración y fecha de estreno.
- **Salas:** Administración de salas con número de sala y capacidad.
- **Horarios de Proyección:** Programación de horarios de proyección con fecha y hora de inicio.
- **Reservaciones:** Proceso de reservaciones que incluye datos del cliente y cantidad de asientos reservados.

### Tecnologías utilizadas:
- **Backend:** Spring Boot, Java, Hibernate, PostgreSQL.
- **Frontend:** React, Material-UI.

### Instalación:
1. Clonar el repositorio del backend: `git clone [[URL del repositorio del backend]](https://github.com/AnotherEngineerHere/TechnicalAssesmentBackend)`
2. Configurar la base de datos PostgreSQL y actualizar las credenciales en el archivo `application.properties` del backend.
3. Ejecutar el backend con Spring Boot.
4. Clonar el repositorio del frontend: `git clone [[URL del repositorio del frontend]](https://github.com/AnotherEngineerHere/TechnicalAssesmentFrontend)`
5. Instalar las dependencias del frontend: `npm install`.
6. Ejecutar el frontend: `npm start`.

### Uso:
- Utilizar los endpoints proporcionados por el backend para realizar operaciones CRUD sobre las entidades del sistema.
- Acceder al frontend para interactuar con las funcionalidades del sistema.

### Contribución:
Las contribuciones son bienvenidas. Si deseas contribuir al proyecto, por favor sigue los siguientes pasos:
1. Haz un fork del proyecto.
2. Crea una nueva rama (`git checkout -b feature/feature-name`).
3. Realiza tus cambios y haz commits (`git commit -am 'Add new feature'`).
4. Haz push a la rama (`git push origin feature/feature-name`).
5. Crea un nuevo Pull Request.

### Ejecución de las inserciones:
Para ejecutar las inserciones en la base de datos, utiliza los scripts proporcionados en la documentación del backend.
