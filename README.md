# workshop-sb-rating-microservice

SpringBoot Rating Microservices Continuum Workshop

## Comandos gradle
                                                                          
| Comando | Descripción |
| ------- | ----------- |
| `./gradlew bootrun -x test` | Ejecuta la aplicación, sin ejecutar los tests |
| `./gradlew bootjar -x test` | Crea el jar de la aplicacion, sin ejecutar los tests |
| `./gradlew test` | Ejecuta los tests |
| `./gradlew clean` | Limpia el proyecto de clases y recursos auto-generados |

## Ejecutar aplicacion producción

### compilar y crear JAR
```
./gradlew bootjar -x test
```

### ejecutar el JAR
```
java -jar build/libs/workshop-sb-rating-microservice-0.0.1.jar
```
