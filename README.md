E-Commerce Backend - Java Spring Boot

API REST backend de comercio electrónico desarrollada con Java y Spring Boot.
Proyecto orientado a demostrar una estructura básica de backend para la gestión de productos.

Tecnologías

Java

Spring Boot

Spring Data JPA

Hibernate

Base de datos H2 (en memoria)

Maven

Funcionalidades

Crear productos

Listar productos

Obtener un producto por ID

Actualizar productos

Eliminar productos

Carga inicial de datos

Ejecución del proyecto

Clonar el repositorio

git clone https://github.com/eric-martinez-dev/e-commerce.git

cd e-commerce

Ejecutar la aplicación

mvn spring-boot:run

O ejecutar la clase principal desde el IDE.

Acceso

API REST:
http://localhost:8080/products

Consola H2:
http://localhost:8080/h2-console

JDBC URL:
jdbc:h2:mem:testdb

Usuario:
sa

Password:
(vacío)

Estructura del proyecto

src/main/java  
└── com/backend/ecommerce  
    ├── controller  
    ├── model  
    ├── repository  
    ├── config  
    └── EcommerceBackendApplication.java  


Autor

Eric Martínez
Estudiante de Ingeniería
GitHub: eric-martinez-dev
