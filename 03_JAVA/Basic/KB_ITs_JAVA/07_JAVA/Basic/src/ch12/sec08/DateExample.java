package ch12.sec08;

import java.util.Date;
import java.util.*;
import java.text.*;

public class DateExample {
    public static void main(String[] args) {
        Date now = new Date();
        String strNow1 = now.toString();
        System.out.println(strNow1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strNow2 = sdf.format(now);
        System.out.println(strNow2);

    }
}


//현재 날짜 데이터를 "2024.06.15 15:22:20"와 같은 포맷으로 출력하세요.