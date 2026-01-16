# My League - Sistema de Gestión de Ligas e Históricos

![Autor](https://img.shields.io/badge/Autor-Sergio%20GD-blue?style=flat-square)
![Java](https://img.shields.io/badge/Java-25-orange?style=flat-square)

**My League** es una plataforma backend diseñada para gestionar competiciones de fútbol, permitiendo a los usuarios consultar clasificaciones dinámicas no solo de la temporada en curso, sino de todo el histórico de la liga.

El sistema está diseñado específicamente para alimentar interfaces modernas que requieran animaciones de "subida y bajada" en la tabla de posiciones, calculando el ranking jornada a jornada.

## 🎯 Objetivo del Proyecto

El núcleo del proyecto es ofrecer una persistencia histórica real. A diferencia de otros sistemas que solo muestran el estado actual, My League permite:
* **Revisión Histórica:** Navegar entre temporadas pasadas con datos congelados en el tiempo.
* **Gestión de Ascensos y Descensos:** Control dinámico de qué equipos participan en cada temporada específica.
* **Ranking Snapshot:** Generación de "fotos" de la clasificación en cada jornada para comparar la evolución de los equipos.

## 🛠️ Stack Tecnológico

Proyecto desarrollado íntegramente de forma individual, utilizando tecnologías de vanguardia para garantizar control y rendimiento:

* **Lenguaje:** Java 25 (aprovechando las últimas mejoras de rendimiento y sintaxis).
* **Persistencia:** MyBatis 3.5.x (mapeo manual para un control total sobre las consultas SQL).
* **Base de Datos:** PostgreSQL (uso intensivo de UUIDs, Procedimientos Almacenados y Triggers).
* **Arquitectura:** Basada en servicios con lógica de negocio desacoplada.



## 🏗️ Modelo de Datos

La arquitectura de la base de datos se ha diseñado para evitar redundancias pero permitir consultas rápidas de rankings complejos:

* **`SEASON_TEAM`**: Tabla relacional que gestiona la participación de equipos por temporada (crucial para gestionar ascensos y descensos).
* **`MATCH`**: Registro detallado de encuentros con estados de finalización.
* **`STANDING`**: Tabla de snapshots que almacena puntos, goles y posición exacta tras cada jornada.

## 🚀 Características Técnicas Implementadas

1.  **Cálculo de Ranking Jornada a Jornada:** Mediante un `STORED PROCEDURE`, el sistema procesa los resultados de los partidos y genera la tabla de posiciones actualizando la columna `POSITION`, facilitando el cálculo de tendencias (si un equipo sube o baja).
2.  **Mapeo Robusto con MyBatis:** Configuración avanzada de `ResultMaps` para el manejo de tipos `UUID` de PostgreSQL y tipos `LocalDate` de Java.
3.  **Transaccionalidad Controlada:** Gestión manual de los recálculos de clasificación para optimizar el rendimiento durante la carga masiva de resultados.
