# Conversor de Divisas

Este proyecto es un conversor de divisas desarrollado como parte de la formación **"Java Orientado a Objetos G7 - ONE"** de Alura Latam en el programa **Oracle Next Education (ONE)** por parte de **Cesar Martinez (sun3v)** .

## Descripción

El Conversor de Divisas es una aplicación de consola desarrollada en Java que permite realizar conversiones entre diversas monedas en tiempo real. Utiliza la API de Exchange Rate para obtener las tasas de cambio actualizadas y aplica conceptos fundamentales de la programación orientada a objetos (POO). Este proyecto fue creado como parte del curso Java Orientado a Objetos G7 - ONE de Alura Latam dentro del programa Oracle Next Education (ONE).

La aplicación está diseñada para ser modular, con una estructura que separa responsabilidades en paquetes específicos, incluyendo lógica de negocio, manejo de APIs y modelos de datos. Con un enfoque en la simplicidad y la robustez, el conversor maneja errores comunes como entradas inválidas y problemas de conexión.

Además, el proyecto destaca por su facilidad de configuración y su diseño limpio, lo que lo convierte en una excelente práctica para desarrollar habilidades en Java.


### Características principales:

- Conversión de montos entre diferentes monedas.
- Consulta en tiempo real a la API de Exchange Rate.
- Manejo de errores para entradas inválidas o problemas de conexión.
- Diseño modular y orientado a objetos.

## Tecnologías utilizadas

- **Java 17**
- **API de Exchange Rate**
- **Gson**: Para la manipulación de JSON.
- **Java HttpClient**: Para realizar las solicitudes HTTP.

## Requisitos

Antes de ejecutar este proyecto, asegúrate de tener:

- Java Development Kit (JDK) 17 o superior.
- Un editor de código, como IntelliJ IDEA o VS Code.
- Una clave de acceso válida para la API de Exchange Rate.

## Instalación y ejecución

### Obtener tu clave de API:

Para configurar correctamente el proyecto, necesitas obtener una clave de acceso para la API de Exchange Rate. Sigue estos pasos:

1. Ingresa a la página oficial de [Exchange Rate API](https://www.exchangerate-api.com/).
2. Registra tu correo electrónico en la plataforma.
3. Activa tu cuenta desde el enlace que recibirás en tu correo (verifica la carpeta de SPAM si no lo encuentras).
4. Una vez activado, inicia sesión y localiza tu clave de API en el panel principal.

**Notas importantes:**
- Asegúrate de que tu clave esté actualizada.
- El uso gratuito de la API tiene un límite de solicitudes y tiempo de validez. Considera actualizar tu plan o renovar la clave periódicamente.
- Consulta las condiciones de uso directamente en el sitio web.

1. **Clonar el repositorio:**

   ```bash
   git clone https://github.com/tu_usuario/conversor-divisas.git
   ```

2. **Abrir el proyecto:**
   Abre el proyecto en tu IDE preferido.

3. **Configurar la clave de la API:**

   - Ve a la clase `ConsultaAPI` en el paquete `com.alura.conversordivisas.conexionhttp`.
   - Reemplaza el valor de la variable `apiKey` con tu propia clave de la API de Exchange Rate.

   ```java
   String apiKey = "TU_CLAVE_DE_API";
   ```

4. **Ejecutar el proyecto:**

   - Corre la clase principal: `com.alura.conversordivisas.principal.Principal`.

## Uso

1. Ejecuta la aplicación.
2. Selecciona una de las opciones del menú para realizar una conversión.
3. Ingresa el monto que deseas convertir.
4. El programa mostrará el resultado basado en la tasa de conversión actual.

## Estructura del proyecto

El proyecto sigue una estructura modular para separar responsabilidades:

- **`principal`**: Contiene la clase principal y el flujo del programa.
- **`calculos`**: Lógica para realizar los cálculos de conversión.
- **`conexionhttp`**: Manejo de solicitudes a la API.
- **`modelos`**: Clases para mapear los datos de la API y manejar la información de divisas.

## Ejemplo de salida

```
****************************************************
¡Bienvenido/a al Conversor de Monedas!

En este programa puedes elegir diferentes tipos de
monedas para realizar conversiones.

Elige una opción para convertir el monto interesado:

1. Dólar a Peso Argentino
2. Peso Argentino a Dólar
3. Dólar a Real Brasilenio
4. Real Brasilenio a Dólar
5. Dólar a Peso Colombiano
6. Peso Colombiano a Dólar
7. Salir
****************************************************
Elige una opción válida: 1

Ingresa el monto que deseas convertir: 100

El valor 100.00 [USD] corresponde al valor final de: 9800.00 [ARS]
```

## Autor

Este proyecto fue desarrollado por **Cesar Martinez** como parte del programa **Oracle Next Education**.

## Licencia

Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

## Recursos adicionales

- [Documentación de Exchange Rate API](https://www.exchangerate-api.com/)

- [Link a versiones Jar de Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson) - Versión recomendada: 2.11.0\



