package day11.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter("D:/exercise/메롱.txt")) {
            String s = "메롱메롱메롱\n 약오르지 ~ ㅋ";
            fw.write(s);

        } catch (IOException e) {
            System.out.println("저장에 실패했습니다");

        }

    }
}
