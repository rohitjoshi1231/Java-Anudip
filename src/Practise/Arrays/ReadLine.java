package Practise.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

// Java readLine
public class ReadLine {

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name: ");
        String name = null;
        try {
            name = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name);
    }

}
