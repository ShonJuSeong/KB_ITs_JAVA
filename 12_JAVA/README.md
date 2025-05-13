# 12. 스트림 요소 처리

## ✅ 1. 스트림(Stream)이란?
자바 8부터 도입된 기능으로,
배열이나 컬렉션의 데이터를 반복·필터·변환·집계 처리할 수 있는 API.

### Stream`<T>`  

데이터가 저장된 게 아니라 흐름(파이프라인처럼) 처리만 함

원본 데이터는 변경되지 않음

중간 연산 + 최종 연산으로 구성

## ✅ 2. 스트림 요소 처리란?
스트림 안의 데이터 요소들 하나하나를 어떻게 처리할지 정의하는 작업.  
즉, map, filter, forEach 같은 함수로 데이터를 변형하거나 필터링, 출력함.  

## ✅ 3. 스트림 처리 흐름 (중요!)
컬렉션.stream()  
       .중간연산1()  
       .중간연산2()  
       ...  
       .최종연산();  
## ✅ 4. 주요 요소 처리 메서드  
### 🔹 ① forEach() - 하나씩 꺼내서 처리 (최종연산)  

List`<String>` names = List.of("홍길동", "이순신", "강감찬");  
names.stream().forEach(name -> System.out.println(name));  
➡ 요소 하나씩 꺼내서 name에 넣고 출력  

#### 🔹 ② filter() - 조건에 맞는 요소만 추출 (중간연산)  
List`<String>` names = List.of("홍길동", "이순신", "강감찬");  
names.stream()  
     .filter(name -> name.startsWith("이"))  
     .forEach(System.out::println);  // 이순신  
➡ 이로 시작하는 이름만 추려냄    

#### 🔹 ③ map() - 요소 변형하기 (중간연산)  
List`<String>` names = List.of("hong", "lee", "kang");    
names.stream()  
     .map(name -> name.toUpperCase())  // 대문자로 바꿈  
     .forEach(System.out::println);    // HONG, LEE, KANG  
➡ 각 요소를 대문자로 변형  

#### 🔹 ④ sorted() - 정렬 (중간연산)
List`<Integer>` nums = List.of(5, 3, 8, 1);  
nums.stream()  
    .sorted()  
    .forEach(System.out::println);  // 1 3 5 8  
      
#### 🔹 ⑤ distinct() - 중복 제거 (중간연산)
List`<Integer>` nums = List.of(1, 2, 2, 3, 3, 3);
nums.stream()
    .distinct()
    .forEach(System.out::println);  // 1 2 3  
      
#### 🔹 ⑥ limit() / skip() - 일부만 처리 (중간연산)  
List`<Integer>` nums = List.of(10, 20, 30, 40, 50);  
nums.stream().limit(3).forEach(System.out::println);  // 10 20 30  
nums.stream().skip(2).forEach(System.out::println);   // 30 40 50  
  
#### 🔹 ⑦ collect() - 결과 모으기 (최종연산)   
List`<String>` names = List.of("홍", "김", "이");  
List`<String>` result = names.stream()  
                           .filter(n -> n.startsWith("김"))  
                           .collect(Collectors.toList());  
System.out.println(result);  // [김]  
  
#### 🔹 ⑧ reduce() - 누적 계산 (최종연산)  
List`<Integer>` nums = List.of(1, 2, 3, 4, 5);  
int sum = nums.stream()  
              .reduce(0, (a, b) -> a + b);  
System.out.println(sum);  // 15    
  
## ✅ 5. 전체 예제 (요소 필터 + 변형 + 출력)  
List`<String>`  names = List.of("apple", "banana", "cherry", "avocado");

names.stream()  
     .filter(s -> s.startsWith("a"))       // 'a'로 시작하는 것만  
     .map(String::toUpperCase)             // 대문자로 변환  
     .sorted()                             // 정렬  
     .forEach(System.out::println);        // 출력  
  
### 📌  
출력:
objectivec  
APPLE  
AVOCADO  
## ✅ 6. 주요 스트림 요소 처리 메서드 정리표
|메서드|	타입	|설명|
|:----:|:----:|:----:|
|forEach()	|최종	모든 요소를 하나씩 처리|
|filter()	|중간	조건에 맞는 요소만 통과|
|map()	|중간	요소를 변형|
|sorted()	|중간	정렬|
|distinct()|	중간	중복 제거|
|limit(n)|	중간	앞에서 n개만|
|skip(n)	|중간	앞에서 n개 건너뛰기|
|collect()|	최종	결과를 리스트 등으로 수집|
|reduce()|	최종	하나의 값으로 누적 계산|

## ✅ 마무리 요약
|개념|	설명|
|:----:|:----:|
|스트림|	데이터 흐름을 처리하는 API (Java 8부터)|
|중간 연산|	map, filter, sorted, distinct, limit, skip 등|
|최종 연산	|forEach, collect, reduce, count 등|
|특징|	원본 데이터 변경 안 함, 선언형(간결), 병렬 처리도 가능|
