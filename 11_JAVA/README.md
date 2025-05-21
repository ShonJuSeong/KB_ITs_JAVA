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

## ✅ 자바 람다식 주요 함수형 인터페이스 정리표

| 인터페이스 이름                 | 메서드 시그니처                | 설명                           | 람다식 예시                                | 메서드 참조 예시                   |
| ------------------------ | ----------------------- | ---------------------------- | ------------------------------------- | --------------------------- |
| **Function\<T, R>**      | `R apply(T t)`          | T를 받아 R을 리턴 (입력 → 출력)        | `(x) -> x.length()`                   | `String::length`            |
| **BiFunction\<T, U, R>** | `R apply(T t, U u)`     | 두 개 입력 T, U → 결과 R 반환        | `(a, b) -> a + b`                     | `Math::pow` (예: `pow(2,3)`) |
| **Consumer<T>**          | `void accept(T t)`      | T를 받아 소비 (출력만, 반환 없음)        | `x -> System.out.println(x)`          | `System.out::println`       |
| **BiConsumer\<T, U>**    | `void accept(T t, U u)` | T, U 둘 다 소비                  | `(a, b) -> System.out.println(a + b)` | 없음 (직접 정의 필요)               |
| **Supplier<T>**          | `T get()`               | 입력 없이 T 타입 값 공급 (리턴만 존재)     | `() -> "Hello"`                       | `String::new`               |
| **Predicate<T>**         | `boolean test(T t)`     | T를 받아 조건 판별 후 true/false 리턴  | `x -> x > 0`                          | `Objects::isNull`           |
| **BiPredicate\<T, U>**   | `boolean test(T, U)`    | 두 입력으로 조건 판단                 | `(a, b) -> a.equals(b)`               | `String::equals`            |
| **UnaryOperator<T>**     | `T apply(T t)`          | 입력과 출력 타입이 동일한 Function      | `x -> x * x`                          | `Math::sqrt`                |
| **BinaryOperator<T>**    | `T apply(T t, T u)`     | 두 입력(T) 받아 T 반환 (ex. 합, 곱 등) | `(x, y) -> x + y`                     | `Integer::sum`              |


