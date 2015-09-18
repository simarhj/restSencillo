/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author ECCI
 */
@Path("calculadora")
public class CalculadoraREST {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CalculadoraREST
     */
    public CalculadoraREST() {
    }

    /**
     * Retrieves representation of an instance of ws.CalculadoraREST
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/html")
    public String getHtml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }
    
    @GET
    @Path("{n1}/{n2}")
    @Produces("text/html")
    public String sumar(@PathParam("n1") int n1, @PathParam("n2") int n2){
        int res = n1+n2;
        return "<html><body><h1>"+res+"</h1></body></html>";
    }

    /**
     * PUT method for updating or creating an instance of CalculadoraREST
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/html")
    public void putHtml(String content) {
    }
}
