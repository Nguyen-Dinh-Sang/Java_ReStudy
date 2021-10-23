package com.sangnd.io;

import com.sangnd.io.demo.ByteStream;
import com.sangnd.io.demo.CharacterStream;

public class InputOutput {
    public static void main(String[] args) {
        executeDemo();
    }

    private static void executeDemo() {
        ByteStream byteStream = new ByteStream();
        byteStream.run();

        CharacterStream characterStream = new CharacterStream();
        characterStream.run();
    }
}
