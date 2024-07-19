package com.example.aadassignment;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        Student student = new Student(1, "Ashinshana Navodi", "Computer Science");

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ashin\\Desktop\\AAD\\Student.txt"))) {
            oos.writeObject(student);
            System.out.println("Serialization successful: " + student);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\ashin\\Desktop\\AAD\\Student.txt"))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("Deserialization successful: " + deserializedStudent);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}
