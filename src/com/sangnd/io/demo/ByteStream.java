package com.sangnd.io.demo;

import java.io.*;

public class ByteStream {
    public void run() {
//        demoFileOutputStream();
//        demoFileInputStream();
//        demoDataOutputStream();
//        demoDataInputStream();
//        demoWriteObject();
//        demoReadObject();
//        demoRandomFile();
    }

    private void demoFileOutputStream() {
        try {
            FileOutputStream fos = new FileOutputStream("file_output_stream.dat");
            String text = "The quick brown fox jumped over the lazy dog";
            byte[] textAsBytes = text.getBytes();
            fos.write(textAsBytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void demoFileInputStream() {
        try {
            FileInputStream fis = new FileInputStream("file_output_stream.dat");
            int c;
            while ((c = fis.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void demoDataOutputStream() {
        try {
            FileOutputStream fos = new FileOutputStream("file_data_output_stream.dat");
            DataOutputStream dos = new DataOutputStream(fos);
            final int number = 5;
            dos.writeInt(number);
            for (int i = 0; i < number; i++) {
                dos.writeInt(i);
            }
            dos.writeUTF("Hello!");
            dos.writeDouble(100.75);
            dos.flush();
            dos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void demoDataInputStream() {
        try {
            FileInputStream fis = new FileInputStream("file_data_output_stream.dat");
            DataInputStream dis = new DataInputStream(fis);
            int items = dis.readInt();
            for (int i = 0; i < items; i++) {
                int n = dis.readInt();
                System.out.println(n);
            }
            System.out.println(dis.readUTF());
            System.out.println(dis.readDouble());
            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void demoWriteObject() {
        try {
            FileOutputStream fos = new FileOutputStream("file_object.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Stock[] stocks = {new Stock(1, "CD ROM", 75.00, 30),
                    new Stock(2, "DRAM", 75.00, 30),
                    new Stock(3, "P4 Processor", 300.00, 100),
                    new Stock(4, "Canon Jet", 80.00, 10),
                    new Stock(5, "HP Scanner", 75.00, 90)};
            oos.writeObject(stocks);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void demoReadObject() {
        try {
            FileInputStream fis = new FileInputStream("file_object.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Stock[] stocks = (Stock[]) ois.readObject();
            System.out.println("Read file:");
            for (Stock s: stocks) {
                System.out.println(s.toString());
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void demoRandomFile() {
        try {
            RandomAccessFile file = new RandomAccessFile("file_random.txt", "rw");
            file.writeChar('a');
            file.writeInt(100);
            file.writeDouble(8.75);
            file.seek(0); //Đưa con trỏ về vị trí đầu file và đọc dữ liệu
            System.out.println(file.readChar());
            System.out.println(file.readInt());
            System.out.println(file.readDouble());
            file.seek(2); //Dịch chuyển con trỏ file vào vị trí thứ 2
            System.out.println("Vị trí thứ 2: " + file.readInt());
            file.seek(file.length()); //Dịch chuyển con trỏ tới cuối file
            file.writeBoolean(true);
            file.seek(4);
            System.out.println("Vi trí thứ 4: " + file.readBoolean());
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
