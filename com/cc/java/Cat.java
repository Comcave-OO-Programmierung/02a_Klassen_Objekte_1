package com.cc.java;

public class Cat {
    /*
    //  Felder (fields) 
    // Attribute (attibutes) 
    // Eigenschaften (properties)
    */
    public String firstName;
    public String furColor;
    int age;



    // this ----> Instanzvariable

// public void tellYourAdress() {
//     System.out.println("Blick von innen: " + this);
   
// }

public String tellYourAdress() {
    return "Blick von innen: " + this;
}

}
