package com.elloza;

/**
 * Represents a person with basic information.
 * This class encapsulates the properties of a person including their name and age.
 */
public class Persona {
    
    /** The name of the person */
    private String nombre;
    /** The age of the person */
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Factory method that creates a Persona instance from a delimited string.
     * The string should contain the person's name and age separated by the specified delimiter.
     *
     * @param data the input string containing name and age separated by delimiter
     * @param delimiter the character or string that separates the name and age
     * @return a new Persona instance parsed from the input string
     * @throws IllegalArgumentException if the data format is invalid or age cannot be parsed as an integer
     * @throws ArrayIndexOutOfBoundsException if the data does not contain enough parts after splitting
     */
    public static Persona fromString(String data, String delimiter) {
        String[] parts = data.split(delimiter);
        if (parts.length < 2) {
            throw new IllegalArgumentException("Invalid format: data must contain name and age separated by delimiter");
        }
        try {
            String nombre = parts[0].trim();
            int edad = Integer.parseInt(parts[1].trim());
            return new Persona(nombre, edad);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid age format: age must be a valid integer", e);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}