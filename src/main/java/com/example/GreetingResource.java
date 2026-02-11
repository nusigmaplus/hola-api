package com.example;

// Importa la anotacion GET para definir que este metodo responde a peticiones HTTP GET
import jakarta.ws.rs.GET;
// Importa Path para definir la ruta del endpoint
import jakarta.ws.rs.Path;
// Importa Produces para indicar el tipo de contenido que devuelve el endpoint
import jakarta.ws.rs.Produces;
// Importa MediaType para usar constantes de tipos MIME
import jakarta.ws.rs.core.MediaType;
// Importa QueryParam para poder leer parametros de la URL (?respuesta=1)
import jakarta.ws.rs.QueryParam;

// Define que esta clase maneja las peticiones que lleguen a /hello
@Path("/hello")
public class GreetingResource {

    // Indica que este metodo responde a peticiones GET
    @GET
    // Indica que la respuesta sera texto plano
    @Produces(MediaType.TEXT_PLAIN)
    // El parametro 'respuesta' se extrae automaticamente del query string de la URL
    // Por ejemplo: /hello?respuesta=1 -> el valor de respuesta sera "1"
    public String hello(@QueryParam("respuesta") String respuesta) {

        // Si no se envia el parametro respuesta, devuelve un mensaje por defecto
        if (respuesta == null) {
            return "Envia el parametro 'respuesta' con valor 1, 2 o 3";
        }

        // Evalua el valor del parametro respuesta y devuelve el saludo correspondiente
        switch (respuesta) {
            case "1":
                // Si respuesta=1 devuelve "Hola"
                return "Hola";
            case "2":
                // Si respuesta=2 devuelve "Adios"
                return "Adios";
            case "3":
                // Si respuesta=3 devuelve "Pollo"
                return "Pollo";
            default:
                // Si el valor no es 1, 2 o 3, devuelve un mensaje de error
                return "Valor no valido. Usa 1 (Hola), 2 (Adios) o 3 (Pollo)";
        }
    }
}