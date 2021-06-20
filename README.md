# ProjectSPQ

Configuración
------------- 

**Base de datos**

Crear una base de datos llamada *jersey* y dar permisos al usuario por defecto

    CREATE DATABASE recuperaciondb;
    USE recuperaciondb;
    CREATE USER IF NOT EXISTS 'spq'@'localhost' IDENTIFIED BY 'spq';
    GRANT ALL ON recuperaciondb.* TO 'spq'@'localhost';

La configuración por defecto para la base de datos y los usuarios puede ser actualizada en el fichero *resources/datanucleus.properties*.

Las clases de datos antes de generar las tablas:

    mvn datanucleus:enhance

Para la creación de las tablas:

    mvn datanucleus:schema-create

**Datos de prueba**


**Inicio del servidor**

    mvn exec:java

Si el servidor ha sido iniciado correctamente se pueden obtener los datos de prueba accediendo con el navegador a la URL http://localhost:8080/myapp/users.

**Inicio de la aplicación cliente**


    mvn -Pcliente exec:java
