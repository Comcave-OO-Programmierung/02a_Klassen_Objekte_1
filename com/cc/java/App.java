package com.cc.java;

public class App {
    
    public static void main(String[] args) {
                
        /* Instanziierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable
        
        Cat cat1 = new Cat();
        // output("Blick von aussen: " + cat1);
        
        // cat1.firstName = "Grizabella";
        // cat1.furColor  = "white";
        // cat1.age        = 29;

        output(cat1.firstName);
        output(cat1.furColor);

        // Was nicht passt wird passend gemacht:
        // .. Typkonvertierung
        // Integer->toString
        // String->valueOf
        output(Integer.toString(cat1.age));
        output(String.valueOf(cat1.age));


        // output(cat1.tellYourAdress());
 
        output("---------------------");
        
        Cat cat2 = new Cat();

        cat2.firstName = "Alonzo";
        cat2.furColor  = "Grey";
        cat2.age        = 35;

        output(cat2.firstName);
        output(cat2.furColor);
        output(String.valueOf(cat2.age));
        
    }

    public static void output(String outputData) {
        System.out.println(outputData);
    }

}

