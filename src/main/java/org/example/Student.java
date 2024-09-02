package org.example;

public record Student(String id, String name, String postalcode, String age) {

    public static Student createStudentFromCSVLine(String line){
        String[] parts = line.split(",");
        if(parts.length<4){
            return null;
        }
        return new Student(parts[0], parts[1], parts[2], parts[3]);
    }
    }

