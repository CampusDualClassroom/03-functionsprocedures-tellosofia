# Ejercicio - Funciones y Procedimientos
## Descripción del ejercicio
Se realizará una primera toma de contacto con el manejo de funciones y procedimientos.

### Objetivos
* Dada la clase ``Exercise`` proporcionada, y los métodos ``greetings()``, ``error()`` y ``checkUser()``, seguir las instrucciones
  indicadas en los ``TODO`` comentados para comprobar la diferencia entre una función y un procedimiento. El objetivo es completar un
  método que recibe un nombre de usuario y una contraseña, los compara con datos válidos y luego invoca a otro método según los datos
  sean o no correctos.

### Métodos a implementar
* El método ``greetings()`` recibe un String por parámetro. Usará ese parámetro en la construcción de otro String y devolverá éste último.
* El método ``error()`` recibe un String por parámetro. Usará ese parámetro en la construcción de otro String y devolverá éste último.
* El método ``checkUser()`` recibe dos Strings por parámetro, un usuario y una contraseña. El método debe comparar en un if-else si los
  datods recibidos por parámetro son iguales a los datos válidos que contiene. Si los datos son correctos, invoca al método ``greetings()
  `` pasándole el nombre del usuario. Si los datos no son válidos, invoca al método ``error()`` pasándole el nombre del usuario.
* Desde el método ``main()`` se llamará al método ``checkUser()`` dos veces: una pasándole ambos datos correctos y otra pasándole ambos
  datos incorrectos.

### Requisitos
* No se pueden modificar en absoluto las clases de test.

### Test

```
mvn test
```
