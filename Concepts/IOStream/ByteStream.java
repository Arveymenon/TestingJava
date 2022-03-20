package Concepts.IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    FileInputStream inputStream = null;
    FileOutputStream outputStream = null;
    public ByteStream(){

        try {
            this.inputStream = new FileInputStream("/Users/arulvinayak/Desktop/Projects/java/Concepts/assets/source.txt");
            this.outputStream = new FileOutputStream("/Users/arulvinayak/Desktop/Projects/java/Concepts/assets/dest.txt");
    
            int content;
            while((content = inputStream.read()) != -1){
                // this.outputStream.write((byte) content);
                this.outputStream.write((char) content);
            }

        } catch(IOException e){
            System.err.println(e);
        }
    }
}