# App Conversor de Moneda

Este es un proyecto en Java que permite convertir entre diferentes monedas utilizando la API [ExchangeRate](https://v6.exchangerate-api.com/v6/). El programa se ejecuta en la terminal y está desarrollado con **Maven**, lo que facilita su administración de dependencias y estructura.

---

## Características
- Conversión entre múltiples monedas en tiempo real.
- Consumo de datos desde la API ExchangeRate.
- Manejo de errores para fallos en la conexión o solicitudes inválidas.
- Diseño modular y orientado a objetos.

---

## Requisitos
- **Java 16** o superior.
- **Maven** instalado en tu sistema.
- Una cuenta en [ExchangeRate](https://www.exchangerate-api.com/) para obtener una clave API.

---

## Instalación y Ejecución

1. Clona este repositorio:
   ```bash
   git clone https://github.com/jmanriquecha/conversor-de-moneda.git
   cd conversor-moneda-terminal
2. Configura tu clave API en el archivo ConsultaMoneda:
   ```java
   key = "TU_CLAVE_API";
3. Compila el proyecto con Maven:
   ```bash
   mvn clean install
4. Ejecuta el programa:
   ```bash
   java -jar target/conversor-moneda-1.0.jar

---   

## Uso
1. Al iniciar, el programa solicitará:
   * Cantidad a convertir.
   * Moneda de origen (código ISO, por ejemplo, USD).
   * Moneda de destino (código ISO, por ejemplo, EUR).
2. El resultado se mostrará en tiempo real con los datos obtenidos de la API.

---

## Tecnologías Utilizadas
   * Java
   * Maven
   * HTTPClient para el consumo de la API.

---

## Autor
   * Jorge Manrique Chavarro
   * [LinkedIn](https://www.linkedin.com/in/jmanriquecha/) | [GitHub](https://github.com/jmanriquecha)

---
## Licencia
Este proyecto está bajo la licencia MIT. Para más detalles, consulta el archivo [LICENSE](https://github.com/jmanriquecha/conversor-de-moneda?tab=MIT-1-ov-file).