/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filereaderexample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author benja
 */
public class FileReaderExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        BufferedReader reader = null;
        try {
            // Membuka file
            reader = new BufferedReader(new FileReader("data.txt"));
            String line;
            System.out.println("Isi file:");
            // Membaca file baris per baris
            while ((line = reader.readLine()) != null) {
                // System.out.println(line);
                array.add(line);
            }
            for (String baris : array) {
                String[] arrayBaris = baris.split("[ .]+");
                switch (arrayBaris[arrayBaris.length - 1]) {
                    case "pertama" -> System.out.println("Ini adalah baris ke 1");
                    case "kedua" -> System.out.println("Ini adalah baris ke 2");
                    case "ketiga" -> System.out.println("Ini adalah baris ke 3");
                    case "keempat" -> System.out.println("Ini adalah baris ke 4");
                    case "kelima" -> System.out.println("Ini adalah baris ke 5");
                    case "keenam" -> System.out.println("Ini adalah baris ke 6");
                    case "ketujuh" -> System.out.println("Ini adalah baris ke 7");
                    case "kedelapan" -> System.out.println("Ini adalah baris ke 8");
                    case "kesembilan" -> System.out.println("Ini adalah baris ke 9");
                    case "kesepuluh" -> System.out.println("Ini adalah baris ke 10");
                    default -> System.out.println("Tidak bisa dikonversi menjadi angka");
                }

            }
        } catch (FileNotFoundException e) {
            // Menangani pengecualian jika file tidak ditemukan
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (IOException e) {
            // Menangani pengecualian input/output lainnya
            System.out.println("Terjadi kesalahan I/O: " + e.getMessage());
        } finally {
            // Memastikan file ditutup
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Terjadi kesalahan saat menutup file: " + e.getMessage());
                }
            }
        }
    }
}
