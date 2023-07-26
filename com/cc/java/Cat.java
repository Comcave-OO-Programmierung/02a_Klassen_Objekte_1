package com.cc.java;

public class Cat {
    
    // this ----> Instanzvariable

public void tellYourAdress() {
    System.out.println("Blick von innen: " + this);
   
}

public void testObject() {
    System.out.println("Grüße aus dem Objekt" + this);
}

public static void testClass() {
    System.out.println("Grüße aus der Klasse" + this);
}


}
