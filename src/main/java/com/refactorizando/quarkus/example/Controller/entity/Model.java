package com.refactorizando.quarkus.example.Controller.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Model.findByBrand", query = "SELECT m FROM Model m  where brand.name =: name")
public class Model {

  @Id
  private Long id;

  private String name;

  @ManyToOne
  @JoinColumn(name="brand")
  private Brand brand;



  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  @Override
  public String toString() {
    return "Model{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", brand=" + brand +
        '}';
  }
}
