package ch17.sec04.exam01;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //List 컬렉션 생성
        List<Product>list = new ArrayList<>();
        for(int i =1;i<=5;i++){
            Product product = new Product(i,"상품"+i,"멋진회사",(int)(10000*Math.random()));
            list.add(product);
        }//for
        //객체 스트림 얻기
        Stream<Product> productStream = list.stream();
        //메서드 참조형
        //productStream.forEach(System.out::println);
        productStream.forEach(p-> System.out.println(p));
    }
}