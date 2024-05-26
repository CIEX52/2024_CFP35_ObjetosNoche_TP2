-- Consultas de pruebas
SELECT * FROM autos;
SELECT * FROM motos;


SELECT *
FROM (
    SELECT autos.marca, autos.modelo, autos.precio FROM autos
    UNION
    SELECT motos.marca, motos.modelo, motos.precio FROM motos
) AS vehiculos
WHERE vehiculos.precio = (
    SELECT MAX(precio)
    FROM (
        SELECT autos.precio FROM autos
        UNION
        SELECT motos.precio FROM motos
    ) AS mas_caro);

SELECT *
FROM (
    SELECT autos.marca, autos.modelo, autos.precio FROM autos
    UNION
    SELECT motos.marca, motos.modelo, motos.precio FROM motos
) AS vehiculos
WHERE vehiculos.precio = (
    SELECT MIN(precio)
    FROM (
        SELECT autos.precio FROM autos
        UNION
        SELECT motos.precio FROM motos
    ) AS mas_caro);