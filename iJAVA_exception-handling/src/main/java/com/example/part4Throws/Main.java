package com.example.part4Throws;

import java.io.*;

public class Main {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("abc.txt");
        fr.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Không tìm thấy file: " + e.getMessage());
        }
    }
}
