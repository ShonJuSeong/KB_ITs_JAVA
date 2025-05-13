# 13. 데이터 입출력  
자바에서 **데이터 입출력(I/O: Input/Output)**이란,   
프로그램이 외부 자원과 데이터를 읽거나 쓰는 과정을 의미.   
예를 들어, 키보드에서 입력을 받거나, 파일에 저장하거나,   
네트워크를 통해 데이터를 주고받는 모든 것이 입출력.  

 
### 1. 📌 자바 I/O의 정의
**자바 I/O(Input/Output)**는 Java에서 데이터를 읽고 쓰기 위해 제공하는 기능  
입출력은 크게 다음과 같이 나뉨:  

|구분|	예시|
|:----:|:----:|
|입력(Input)|	키보드 입력, 파일 읽기, 네트워크로부터 데이터 받기 등|
|출력(Output)	|화면 출력, 파일 저장, 네트워크로 데이터 보내기 등|
  
자바는 이 작업들을 위해 java.io 패키지를 기본으로 제공하고,  
java.nio, java.util.Scanner, java.nio.file 등 다양한 보조 패키지도 존재  

###2. 📌  입출력 종류  
🧩 스트림(Stream)  
스트림은 데이터를 연속적인 흐름으로 처리하는 개념  
자바 I/O는 스트림 기반으로 작동    
  
InputStream / Reader : 데이터 읽기  

OutputStream / Writer : 데이터 쓰기  
  
🌊 바이너리 스트림  
InputStream, OutputStream  
→ 이미지, 영상, 파일 등 바이트 단위 입출력  
  
🌊 문자 스트림  
Reader, Writer  
→ 텍스트 등 문자 단위 입출력  


### 📌 3. 자주 사용하는 입출력 클래스
|목적	|클래스|
|:----:|:----:|
|바이트 입력|	FileInputStream|
|바이트 출력	|FileOutputStream|
|문자 입력	|FileReader|
|문자 출력|	FileWriter|
|키보드 입력|	Scanner, BufferedReader|
|화면 출력	|System.out.println(), PrintWriter|

### 📌 4. 정리 요약
|구분	|클래스|
|:----:|:----:|
|InputStream	|바이트 입력 스트림	|
|OutputStream	|바이트 출력 스트림	|
|Reader	|문자 입력 스트림	|
|Writer	|문자 출력 스트림	|
|Scanner	|텍스트 입력을 간편하게 처리	|
|BufferedReader	|입력을 버퍼로 빠르게 처리	|
|FileReader / FileWriter	|텍스트 파일 입출력 전용 클래스|
