package com.refactorizando.quarkus.example.Controller.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import java.util.List;

import com.refactorizando.quarkus.example.Controller.entity.Model;

@ApplicationScoped
public class CarDealerShipService {

  @Inject
  EntityManager entityManager;

  public List<Model> findModelCarByBrandName(String brand) {

    return entityManager.createNamedQuery("Model.findByBrand", Model.class)
        .setParameter("name", brand)
        .getResultList();

  }

}
