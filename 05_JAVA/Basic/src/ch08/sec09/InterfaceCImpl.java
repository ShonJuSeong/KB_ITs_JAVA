package ch08.sec09;
// 어떤메서드가호출되는지출력하는코드로각메서드를정의
// InterfaceCImpl-methodA() 실행
// InterfaceCImpl-methodB() 실행
// InterfaceCImpl-methodC() 실행


public class InterfaceCImpl implements InterfaceC {
    public void methodA() {
        System.out.println("InterfaceCImpl.methodA() 실행");
    }


    public void methodB() {
        System.out.println("InterfaceCImpl.methodB() 실행");
    }

    public void methodC() {
        System.out.println("InterfaceCImpl.methodC() 실행");
    }
}