# 11. 람다식

## ✅ 1. 람다식이란?
**익명 함수(이름 없는 함수)**를 간단하게 쓰는 문법  
Java 8부터 도입됨  
📌 "함수 자체를 값처럼 다루고", "변수에 저장하거나 메서드의 인자로 전달"할 수 있음.  

## ✅ 2. 기본 문법
### (매개변수) -> { 실행문 }
#### 🔹 예제 1: 가장 기본적인 형태
##### (int x, int y) -> { return x + y; }
#### 🔹 예제 2: 한 줄이면 {}와 return 생략 가능
##### (x, y) -> x + y
#### 🔹 예제 3: 매개변수가 하나일 때는 ()도 생략 가능
##### name -> System.out.println(name)

## ✅ 3. 람다식은 어디에 쓰이나?  
람다식은 **함수형 인터페이스(Functional Interface)**에서만 사용 가능  

#### 📌 함수형 인터페이스란?   
➝ 추상 메서드가 단 하나만 선언된 인터페이스  
(예: Runnable, Comparator<T>, Consumer<T> 등)  

## ✅ 4. 예제  
🔹 Runnable (기본 쓰레드용 인터페이스)  
Runnable run = () -> {  
    System.out.println("스레드 실행 중...");  
};  
  
new Thread(run).start();  
#### 🔹 Comparator (정렬용 인터페이스)  
 List<String> list = Arrays.asList("banana", "apple", "cherry");  
  
Collections.sort(list, (a, b) -> a.compareTo(b));  
System.out.println(list);  // [apple, banana, cherry]  

## ✅ 5. 함수형 인터페이스 예시 (java.util.function 패키지)
|인터페이스	|매개변수	|반환값	|설명|
|:----:|:----:|:----:|:----:|
|Consumer<T>	|O	|X|	값 소비 (예: 출력)|
|Supplier<T>	|X	|O|	값 공급 (예: 난수 생성)|
|Function<T,R>	|O|	O|	T → R로 변환|
|Predicate<T>	|O|	boolean|	조건 검사|

#### 🔹 예시: Consumer<String>  
Consumer<String> printer = name -> System.out.println("이름: " + name);  
printer.accept("홍길동");  

## ✅ 6. 람다식의 장점
|장점|	설명|
|:----:|:----:|
|코드 간결|	익명 클래스보다 훨씬 짧음|
|가독성 향상|	핵심 로직이 눈에 잘 들어옴|
|함수형 프로그래밍 가능|	자바에서도 함수처럼 다룰 수 있음|

## ✅ 요약
|항목|	설명|
|:----:|:----:|
|람다식	|이름 없는 함수|
|문법	|(매개변수) -> { 실행문 }|
|조건|	함수형 인터페이스에서만 사용 가능|
|장점	|코드 간결, 가독성 향상|
|관련 |인터페이스	Runnable, Comparator, Consumer, Function, Predicate, Supplier 등|


