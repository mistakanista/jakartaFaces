package net.veda;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class HelloBean {
  private String name = "World";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
