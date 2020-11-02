package com.refactorizando.quarkus.example.Controller.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Brand {

  @Id
  private Long id;

  private String name;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Brand{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
