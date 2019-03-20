package com.coding.studiodemo.pojo.service.impl;

import com.coding.studiodemo.pojo.service.HelloService;

public class HelloServiceImpl implements HelloService{
  public void sayHello(String name){
    if(name == null || name.trim() == ""){
      throw new RuntimeException("parameter is null!!!");
    }
    System.out.println("Hello "+ name);
  }
}