# Almacenamiento de Información de Cliente en Base de Datos Oracle

## Descripción
Este ejercicio aborda el desafío de almacenar la información de un cliente en una base de datos Oracle mediante un proceso de inserción. Se establecen restricciones y requisitos específicos para garantizar la consistencia y cumplir con estándares predefinidos.

## Restricciones
- La tabla esta dentro del esquema **WIKJ** y se debe nombrar **T_WIKJ_HAB_PRUEBAFINAL**.
- Campos de la tabla:
    - `id Number(5)` NOT NULL PRIMARY KEY
    - `nuip Number(10)`
    - `full_name VARCHAR(50)`
    - `phone VARCHAR(15)`
    - `address VARCHAR(30)`

## Tecnologías Utilizadas
- **Oracle Database**: Se utiliza una base de datos Oracle para almacenar la información del cliente.
- **APX-CLI**: Esta herramienta se utiliza para crear el Data Transfer Object (DTO), la librería y manejar las transacciones necesarias.
- **JDBC**: La utilidad JDBC generada por APX-CLI facilita la gestión de la conexión con la base de datos Oracle.
- **Esquema WIKJ**: Se establece un esquema específico dentro de la base de datos Oracle, en este caso, llamado WIKJ, donde se aloja la tabla de clientes.
- **Restricciones de la Tabla**: La tabla que almacena la información del cliente debe cumplir con ciertas restricciones, como el nombre de la tabla, los tipos de datos y la clave primaria.
- **Validación de Datos**: Antes de la inserción, se valida que el número de identificación único del cliente (NUIP) no exista previamente para evitar duplicados.
- **Buenas Prácticas de Programación**: Se evitan prácticas inseguras como el uso de `SELECT *` y la inserción de valores directos en las consultas SQL.

## Proceso y Salida
El proceso de inserción de datos debe asegurar la integridad y consistencia de la información. La salida esperada debe reflejar la misma información proporcionada como entrada. Esto se logra mediante una consulta SELECT utilizando el ID recibido o devolviendo directamente la información de entrada.

## Herramientas y Procedimientos
- Se debe utilizar **apx-cli** para crear el DTO, la librería y la transacción.
- Se requiere la utilidad JDBC generada por **apx-cli** para gestionar la conexión con la base de datos Oracle.

## Componentes Esenciales
- **DTO de Entrada y Salida**: Se utiliza un DTO (Data Transfer Object) tanto para la entrada como para la salida de datos, asegurando un intercambio seguro y eficiente de información.
- **Librería de Negocio**: Los datos pasan obligatoriamente por una librería de negocio, garantizando la coherencia y consistencia en su manejo.