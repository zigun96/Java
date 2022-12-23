package lambdaEx;
interface A1 {
   void abc();
}
class B1 {
   void bcd() { // 정의된 메소드
      System.out.println("메소드");
   }
}

public class InstanceMethod {
   public static void main(String[] args) {
      // 1. 익명의 이너클래스
      A1 a1 = new A1() {
         @Override
         public void abc() {
            B1 b = new B1();
            b.bcd(); }
         };
      // 2. 람다식
      A1 a2 = () -> {
         B1 b = new B1();
         b.bcd(); 
      };
      // 3. 정의된 메소드 참조
      B1 b = new B1();
      A1 a3 = b::bcd;
      
      // 출력
      a1.abc();
      a2.abc();
      a3.abc();
   }
}

