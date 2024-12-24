-- V3__crear_vista.sql

-- Elimina la vista si ya existe (opcional)
DROP VIEW IF EXISTS vista_practica_estudiante;

-- Crea la vista uniendo la información de dos tablas
CREATE VIEW vista_practica_estudiante AS
SELECT
    p.id AS practica_id,
    p.nombre AS practica_nombre,
    p.descripcion AS practica_descripcion,
    e.id AS estudiante_id,
    e.nombre AS estudiante_nombre,
    e.apellido AS estudiante_apellido
FROM
    practice p
        JOIN
    estudiante e ON p.estudiante_id = e.id;
