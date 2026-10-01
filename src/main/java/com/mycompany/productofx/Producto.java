// CONTRERAS MARTINEZ BRYAN DANIEL
package com.mycompany.productofx;

/**
 *
 * @author Tazit
 */
public class Producto {
 private String name;
 private double price;
 private int quantity;
 private String marca;
 
 //CONSTRUCTOR
 public Producto(String name, double price, int quantity, String marca){
     this.name = name;
     this.price = price;
     this.quantity = quantity;
     this.marca = marca;
 }
 
 //GET Y SET
 public String getName(){
    return name;
}
 
 public void setName(String name){
         this.name = name;
 }
 public double getPrice(){
     return price;
 }
 
 public void setPrice(double price){
     this.price = price;
 }
 
 public int getQuantity(){
     return quantity;
 }
 
 public void setQuantity(int quantity){
     this.quantity = quantity;
 }
 
 public String getMarca(){
     return marca;
 }
 
 public void setMarca(String marca){
     this.marca = marca;
 }
}
