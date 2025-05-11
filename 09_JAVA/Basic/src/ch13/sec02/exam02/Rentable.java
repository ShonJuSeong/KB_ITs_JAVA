package ch13.sec02.exam02;

public interface Rentable<P> {
    P rent();
    //타입 파라미터P정의 및 P를 리턴 타입으로 사용.
}
