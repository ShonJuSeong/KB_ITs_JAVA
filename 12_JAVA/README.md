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

## ✅ 스트림 연산 종류
|종류	|메서드|	설명|
|:---:|:---:|:---:|
|시작점|stream()|	컬렉션을 스트림으로 바꿈 (데이터 흐름 시작)|	
|중간 연산	|filter()	|조건에 맞는 요소만 필터링|
|중간 연산	|map()	|요소를 다른 값으로 변환|
|중간 연산	|sorted()	|정렬|
|중간 연산	|distinct()	|중복 제거|
|중간 연산	|limit() / skip()|	일부만 사용|
|최종 연산	|forEach()|	요소 하나씩 출력|
|최종 연산	|count()	|개수 세기|
|최종 연산|	collect()	|리스트, 셋 등으로 다시 수집|
|최종 연산|	reduce()|	누적 계산|

## ✅ 3. 스트림 처리 흐름 (중요!)
컬렉션.stream()  
       .중간연산1()  
       .중간연산2()  
       ...  
       .최종연산();  
## ✅ 4. 주요 요소 처리 메서드  
🔹 중간 연산 (Intermediate Operations)
→ 스트림을 변형하며, 스트림을 리턴함. 최종 연산이 실행되기 전까지는 실행되지 않음 (지연 연산)

### ① filter() - 조건에 맞는 요소만 추출
List<String> names = List.of("홍길동", "이순신", "강감찬");    
names.stream()   
     .filter(name -> name.startsWith("이"))   
     .forEach(System.out::println);  // 출력: 이순신   
➡ startsWith("이") 조건에 맞는 요소만 추출 

### ② map() - 요소 변형
List<String> names = List.of("hong", "lee", "kang");     
names.stream()  
     .map(name -> name.toUpperCase())  
     .forEach(System.out::println);  // 출력: HONG, LEE, KANG  
➡ 각 요소를 대문자로 변환

### ③ sorted() - 정렬  
List<Integer> nums = List.of(5, 3, 8, 1);  
nums.stream()  
    .sorted()  
    .forEach(System.out::println);  // 출력: 1 3 5 8  
➡ 기본 오름차순 정렬

### ④ distinct() - 중복 제거  
List<Integer> nums = List.of(1, 2, 2, 3, 3, 3);  
nums.stream()  
    .distinct()  
    .forEach(System.out::println);  // 출력: 1 2 3  
➡ 중복된 값 제거

### ⑤ limit(n) / skip(n) - 일부만 처리
List<Integer> nums = List.of(10, 20, 30, 40, 50);   
nums.stream().limit(3).forEach(System.out::println);  // 출력: 10 20 30  
nums.stream().skip(2).forEach(System.out::println);   // 출력: 30 40 50  
➡ limit(n): 처음 n개만  
➡ skip(n): 처음 n개를 건너뜀  

## 🔹 최종 연산 (Terminal Operations)
→ 스트림을 소비하고, 결과를 생성하거나 출력함

### ⑥ forEach() - 하나씩 꺼내서 처리 
List<String> names = List.of("홍길동", "이순신", "강감찬");   
names.stream().forEach(name -> System.out.println(name));   
➡ 요소 하나씩 꺼내서 처리  
  
### ⑦ collect() - 결과 수집  
List<String> names = List.of("홍", "김", "이");   
List<String> result = names.stream()   
                           .filter(n -> n.startsWith("김"))   
                           .collect(Collectors.toList());  
System.out.println(result);  // 출력: [김]   
➡ 필터링된 결과를 리스트로 수집 

### ⑧ reduce() - 누적 계산
List<Integer> nums = List.of(1, 2, 3, 4, 5);  
int sum = nums.stream()  
              .reduce(0, (a, b) -> a + b);  
System.out.println(sum);  // 출력: 15  
➡ 초기값 0부터 시작해서 모두 더함
  
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



## ✅::
// :: 의 쓰임  

.filter(set::contains)  
는 사실상  
.filter(x -> set.contains(x))  
과 똑같은 코드임.  


|형태 |	의미|
|:---:|:---:|
|x -> x.length()	|"x의 길이를 구해"|
|String::length	"String| 객체의 length 메서드를 써"|
|x -> set.contains(x)|	"set에 x가 있니?"|
set::contains	|위 코드를 짧게 줄인 것
