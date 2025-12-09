package com.elloza;


/**
 * Main class for the application.
 */
public class Main {
    /***
     * Main method to run the application.
     * @param args
     */
    public static void main(String[] args) {
        String persona1String = "John Doe, 30";
        String persona2String = "Jane Smith,28";
        
        Persona persona1 = Persona.fromString(persona1String, ",");
        Persona persona2 = Persona.fromString(persona2String, ",");
        
        System.out.printf("Nombre: %s, Edad: %d%n", persona1.getNombre(), persona1.getEdad());
        System.out.printf("Nombre: %s, Edad: %d%n", persona2.getNombre(), persona2.getEdad());
    }
}