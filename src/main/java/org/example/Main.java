package org.example;

import org.example.model.SqlCommand;
import org.example.model.SqlCommandParser;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("Hello and welcome!"));
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(";");

        SqlCommandParser parser = new SqlCommandParser();

        while (true) {
            IO.println(String.format("Please insert your command or use ctrl+d to terminate."));
            String userResponse = scanner.next();

            SqlCommand command = parser.parseSqlCommand(userResponse);
        }
    }
}
