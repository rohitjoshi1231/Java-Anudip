package Practise.Arrays;

import java.io.Console;
import java.util.Arrays;

public class ConsoleRead {
    public static void main(String[] args) {
        Console console = System.console();
        String name = console.readLine();
        char[] password = console.readPassword();


    }
}
