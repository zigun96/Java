package lambdaEx;
interface A1 {
   void abc();
}
class B1 {
   void bcd() { // ���ǵ� �޼ҵ�
      System.out.println("�޼ҵ�");
   }
}

public class InstanceMethod {
   public static void main(String[] args) {
      // 1. �͸��� �̳�Ŭ����
      A1 a1 = new A1() {
         @Override
         public void abc() {
            B1 b = new B1();
            b.bcd(); }
         };
      // 2. ���ٽ�
      A1 a2 = () -> {
         B1 b = new B1();
         b.bcd(); 
      };
      // 3. ���ǵ� �޼ҵ� ����
      B1 b = new B1();
      A1 a3 = b::bcd;
      
      // ���
      a1.abc();
      a2.abc();
      a3.abc();
   }
}

