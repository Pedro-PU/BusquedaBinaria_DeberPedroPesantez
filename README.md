
# Práctica de Búsqueda Binaria

## 📌 Información General

- **Título:** Práctica de Búsqueda Binaria con Seguimiento Detallado
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Pedro Pesántez
- **Fecha:** 18/04/2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto implementa el algoritmo de **Búsqueda Binaria** en Java para localizar una persona en un arreglo ordenado por edad.

Incluye funcionalidades como:

- Ordenamiento previo del arreglo utilizando el **método burbuja**.
- Búsqueda binaria con impresión detallada del proceso:
  - Rango actual de búsqueda.
  - Índices de `bajo`, `alto`, `centro`.
  - Valor del centro y dirección tomada (IZQUIERDA, DERECHA, ENCONTRADO).
- Visualización del nombre de la persona si se encuentra por edad.

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Entrada

```plaintext
Cuantas personas quieres ingresar: 9
---------------------------------------------
Ingrese el nombre de la persona 1: Pablo
Ingrese la edad de la persona 1: 4
---------------------------------------------
Ingrese el nombre de la persona 2: Maria
Ingrese la edad de la persona 2: 5
---------------------------------------------
Ingrese el nombre de la persona 3: Juan
Ingrese la edad de la persona 3: 18
---------------------------------------------
Ingrese el nombre de la persona 4: David
Ingrese la edad de la persona 4: 60
---------------------------------------------
Ingrese el nombre de la persona 5: Mateo
Ingrese la edad de la persona 5: 25
---------------------------------------------
Ingrese el nombre de la persona 6: Diego
Ingrese la edad de la persona 6: 12
---------------------------------------------
Ingrese el nombre de la persona 7: Ana
Ingrese la edad de la persona 7: 8
---------------------------------------------
Ingrese el nombre de la persona 8: Alicia
Ingrese la edad de la persona 8: 9
---------------------------------------------
Ingrese el nombre de la persona 9: Jaime
Ingrese la edad de la persona 9: 40
---------------------------------------------
Personas ordenadas por edad:
4 | 5 | 8 | 9 | 12 | 18 | 25 | 40 | 60
Ingrese la edad a buscar: 18
4 | 5 | 8 | 9 | 12 | 18 | 25 | 40 | 60
bajo=0 alto=8 centro=4 valorCentro=12 --> DERECHA
18 | 25 | 40 | 60
bajo=5 alto=8 centro=6 valorCentro=25 --> IZQUIERDA
18
bajo=5 alto=5 centro=5 valorCentro=18 --> ENCONTRADO
La persona con la edad 18 es: Juan
```

---

