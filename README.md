# Universidad Politécnica Salesiana

## Estudiante: William Berrezueta

## Practica 4: Comparación situacional de algoritmos de ordenamiento
### Fecha: 2026-06-02
## Descripción:

Para esta practica se nos pide comparar los tiempos de ejecucuión de los metodos QuickSort y InsertionSort con listas de personas creadas al azar de 3 distintos tamaños [ 10000 - 50000 - 100000 ], se registran primero 6 tiempos de las listas desordenadas, y tambien se registran otros 6 tiempos de las listas casi ordenadas a estas sumandole una persona.

### Tabla 1. Escenario 1: arreglo completamente desordenado

| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
|-------------------|------------------|------------------|----------------------|-------------|
| 10.000 | 770.66ms | 7.96ms | QuickSort | QuickSort fue mucho más rápido |
| 50.000 | 23974.76ms | 39.14ms | QuickSort | Inserción tuvo un aumento de x20 |
| 100.000 | 112948.30ms | 115.84ms | QuickSort | QuickSort mantuvo mejor rendimiento |

### Tabla 2. Escenario 2: arreglo ordenado más una nueva persona

| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
|-------------------|------------------|------------------|----------------------|-------------|
| 10.001 | 1.37ms | 3.84ms | Inserción | Insertion mejoro demasiado su tiempo a comparación del primer escenario |
| 50.001 | 2.04ms | 33.40ms | Inserción | Inserción fue más rápido |
| 100.001 | 10.56ms | 106.39ms | Inserción | Inserción fue más rápido y con mas diferencia |

## Análisis requerido

Después de completar las tablas, se debe responder:

- ¿Qué algoritmo fue más rápido en el escenario desordenado?

  Respuesta: El algoritmo más rápido fue QuickSort.

- ¿Qué algoritmo fue más rápido en el escenario casi ordenado?

  Respuesta: El algoritmo más rápido fue InsertionSort.

- ¿El crecimiento del tamaño de muestra afectó por igual a ambos algoritmos?

  Respuesta: No, no afectó por igual a los dos algoritmos, por ejemplo, Inserción aumentó mucho su tiempo en el arreglo desordenado, mientras que QuickSort mantuvo tiempos más bajos.

- ¿Por qué Inserción puede mejorar cuando el arreglo ya está casi ordenado?

  Respuesta: Porque cuando el arreglo ya está casi ordenado no necesita hacer muchos movimientos y solo compara y acomoda pocos elementos.

- ¿Por qué QuickSort suele ser mejor cuando los datos están muy desordenados?

  Respuesta: Porque divide el arreglo en partes más pequeñas y las ordena por separado.

## Conclusiones

Se debe redactar al menos tres conclusiones propias. Las conclusiones deben estar relacionadas directamente con los tiempos obtenidos.

- Conclusión 1: Inserción fue mucho mejor cuando el arreglo ya estaba casi ordenado, porque solo tuvo que acomodar pocos elementos.
- Conclusión 2: El tamaño de la muestra sí afectó los tiempos, mas a Inserción.
- Conclusión 3: El tiempo de ejecución aumentó cuando se usaron más personas en el arreglo, afecto mas a Insercion que aumentaba en gran medida.