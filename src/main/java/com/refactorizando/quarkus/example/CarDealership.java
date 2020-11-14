package com.refactorizando.quarkus.example;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.refactorizando.quarkus.example.entity.Model;
import com.refactorizando.quarkus.example.service.CarDealerShipService;

@Path("/dealership")
@Produces("application/json")
@Consumes("application/json")
public class CarDealership {


  @Inject
  CarDealerShipService carDealerShipService;

  @GET
  @Path("/models")
  public Model[] getModelsByBrand(@QueryParam("brand") String brand) {
    return carDealerShipService.findModelCarByBrandName(brand).toArray((new Model[0]));

  }
}