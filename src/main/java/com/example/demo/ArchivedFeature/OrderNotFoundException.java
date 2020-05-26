package com.example.demo.ArchivedFeature;

public class OrderNotFoundException extends RuntimeException{
  OrderNotFoundException(Long id){
    super("Could not find order id: " + id + " Please Enter another id.");
  }
}

