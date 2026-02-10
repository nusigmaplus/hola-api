# Hola API

API simple en Quarkus que responde "hola" a peticiones POST.

## Requisitos

- Java 17+
- Maven 3.8+
- OpenShift CLI (oc) para despliegue

## Ejecutar Localmente
```bash
./mvnw quarkus:dev
```

## Probar
```bash
# POST request
curl -X POST http://localhost:8080/api/hola

# Health check
curl http://localhost:8080/api/health
```

## Desplegar en OpenShift
```bash
# Login a OpenShift
oc login -u developer https://api.crc.testing:6443

# Crear proyecto
oc new-project hola-api

# Desplegar
./mvnw package -Dquarkus.kubernetes.deploy=true
```