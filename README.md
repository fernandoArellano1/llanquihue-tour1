# Llanquihue Tour App

## Descripción del Proyecto
Este proyecto es una aplicación de consola desarrollada en Java para la asignatura Desarrollo Orientado a Objetos I de Duoc UC. Su propósito es gestionar de manera eficiente la información de tours de la agencia "Llanquihue Tour", cargando los datos de forma dinámica desde un archivo de texto plano (`tours.txt`), instanciando objetos basados en un modelo de clases, almacenándolos en una colección dinámica de tipo `ArrayList` y aplicando operaciones esenciales de recorrido y filtrado según condiciones de precio.

## Estructura de Carpetas
El proyecto se encuentra estructurado bajo el siguiente orden de paquetes dentro del directorio raíz de código fuente:
```text
src/
├── model/      # Contiene la clase de entidad (Tour.java) con atributos, getters, setters y toString()
├── data/       # Maneja la persistencia y lectura del archivo de texto (GestorDatos.java)
├── ui/         # Alberga la interfaz de usuario de consola y flujo principal (Main.java)
└── resources/  # Almacena el archivo físico de datos indexados (tours.txt)
