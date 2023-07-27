package com.cc.java;

public class App {
    
    public static void main(String[] args) {
                
        /* Instanziierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable
        // output("Blick von aussen: " + cat1);
        Cat cat1 = new Cat("Grizabella", "White", 29);
        
        // Ausgabe
        output(cat1.getFirstName());
        output(cat1.getFurColor());
        cat1.setFurColor("grey");
        output(cat1.getFurColor());
        output(String.valueOf(cat1.getAge()));

        // Was nicht passt wird passend gemacht:
        // .. Typkonvertierung
        // Integer->toString
        // String->valueOf
        // output(Integer.toString(cat1.age));
        // output(String.valueOf(cat1.age));


        // output(cat1.tellYourAdress());
 
        output("---------------------");
        
        Cat cat2 = new Cat("Alonzo","Grey",35);

        // cat2.firstName = "Alonzo";
        // cat2.furColor  = "Grey";
        // cat2.age        = 35;

        output(cat2.getFirstName());
        output(cat2.getFurColor());
        output(String.valueOf(cat1.getAge()));
        
    }

    public static void output(String outputData) {
        System.out.println(outputData);
    }

}

