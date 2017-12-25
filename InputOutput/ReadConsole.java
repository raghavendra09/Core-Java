package com.dbcore.InputOutput;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Project: CoreJava
 * FileName: ReadConsole
 * Author: test
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ReadConsole {
    public static void main(String[] args) throws IOException {
        InputStreamReader cin = null;

        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit.");
            char c;
            do {
                c = (char) cin.read();
                System.out.print(c);
            } while (c != 'q');
        } finally {

            if (cin != null) {
                cin.close();
            }
        }
    }
}
