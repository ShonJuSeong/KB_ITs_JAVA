package ch18.sec07.exam02;

import java.io.*;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:/TEMP/test.txt"));

        int lineNo =1;
        while(true) {
            String str = br.readLine(); // 1행 단위로 읽음
            if (str == null) break;
            System.out.println(lineNo + "\t" + str);
            lineNo++;
        }
        br.close();
    }
}
