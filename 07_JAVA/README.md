# 7. 예외처리, 라이브러리  
## 1. 예외처리 (Exception Handling)  
🔹 예외(Exception)란?  
프로그램 실행 도중 오류가 발생하는 상황을 말함.  
예: 0으로 나누기, 없는 파일 읽기, 잘못된 배열 접근 등.
예외처리	프로그램 오류를 처리해서 강제 종료 막는 방법  
try-catch	예외 발생 시 대응  
finally	예외와 상관없이 항상 실행됨  


## 2. 라이브러리 (Library)  
🔹 라이브러리란?  
미리 만들어진 코드 묶음 (함수, 클래스 등)  
반복적으로 쓰이는 기능을 개발자가 직접 안 만들고 불러와서 사용함.  

🔹 Java의 기본 라이브러리 (Java API)
자바에는 기본적으로 수천 개의 클래스가 포함된 **표준 라이브러리(Java API)**가 있음.

예시:

| 패키지| 설명 | 주요 클래스 |
|------|:----:|:----:|
|java.lang	|기본 클래스	|String, Math, Integer|
|java.util|	자료구조	|ArrayList, HashMap, Collections|
|java.io	|입출력	|File, BufferedReader, FileInputStream|
|java.net|	네트워크|	Socket, URL|
|java.sql|	데이터베이스	|Connection, Statement, ResultSet|
