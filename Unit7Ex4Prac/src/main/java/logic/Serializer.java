package logic;

import model.Employee;

import java.io.*;
import java.util.ArrayList;

public class Serializer {

    private String filepath;

    private FileInputStream fileInputStream;
    private ObjectInputStream objectInputStream;

    private FileOutputStream fileOutputStream;
    private ObjectOutputStream objectOutputStream;

    public Serializer(String filepath) {
        this.filepath = filepath;
    }

    public void serializeObject(ArrayList<Employee> employees) throws IOException {
        this.fileOutputStream = new FileOutputStream(filepath);
        objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employees);
        objectOutputStream.close();
    }

    public ArrayList<Employee> deserializeObject() throws IOException, ClassNotFoundException {
        this.fileInputStream = new FileInputStream(filepath);
        objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Employee> employees = (ArrayList<Employee>) objectInputStream.readObject();
        objectInputStream.close();
        return employees;
    }


}
