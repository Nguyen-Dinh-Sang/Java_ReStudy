package com.sangnd.io.demo;

import java.io.*;

public class CharacterStream {
    public void run() {
//        demoReadWriterCharacter();
//        demoReadFile();
    }

    private void demoReadWriterCharacter() {
        try {
            File file = new File("file_writer.txt");
            FileWriter out = new FileWriter(file);
            out.write("Doc ghi dữ liệu trong Java!");
            out.write("\n");
            out.write("Sử dụng Stream character");
            out.close();

            FileReader in = new FileReader(file);
            System.out.println("Doc tu file:...");
            int ch = in.read();
            while (ch != -1) {
                System.out.println((char) ch);
                ch = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void demoReadFile() {
        try {
            FileReader frr = new FileReader("file_writer.txt");
            BufferedReader bufferedReader = new BufferedReader(frr);
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                System.out.println(text);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
