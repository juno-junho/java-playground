package com.example.exception;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourcesEx1 {

    public static void main(String[] args) {
        DataInputStream dataInputStream = null;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("./com/example/exception/score.dat");
            dataInputStream = new DataInputStream(fileInputStream);
            throw new FileNotFoundException("에러 1");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw new IOException("에러 2");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
