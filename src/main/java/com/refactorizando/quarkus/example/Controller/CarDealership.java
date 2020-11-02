package com.refactorizando.quarkus.example.Controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.refactorizando.quarkus.example.Controller.entity.Model;
import com.refactorizando.quarkus.example.Controller.service.CarDealerShipService;

@Path("/dealership")
@Produces("application/json")
@Consumes("application/json")
public class CarDealership {


  @Inject
  CarDealerShipService carDealerShipService;

  @GET
  @Path("/modelsByBrand/{brand}")
  public Model[] getModelsByBrand(@PathParam String brand) {
    return carDealerShipService.findModelCarByBrandName(brand).toArray((new Model[0]));

  }
}