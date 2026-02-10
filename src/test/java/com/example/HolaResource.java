package com.example;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

// Define la ruta base para este recurso REST
@Path("/api")
public class HolaResource {

    // Responde a peticiones POST en /api/hola
    @POST
    @Path("/hola")
    // Acepta cualquier tipo de contenido en el request
    @Consumes(MediaType.WILDCARD)
    // Responde con texto plano
    @Produces(MediaType.TEXT_PLAIN)
    public String holaPost() {
        return "hola";
    }

    // Endpoint GET para health checks y pruebas rapidas
    @GET
    @Path("/health")
    @Produces(MediaType.TEXT_PLAIN)
    public String health() {
        return "OK";
    }
}