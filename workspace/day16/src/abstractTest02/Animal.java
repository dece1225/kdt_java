package abstractTest02;
//5번 : 추상클래스와 강제성
public class Animal {
   //필드
   String name;
   int age;
   
   //추상 메소드
   void crying() {
      System.out.println(this.name + "이/가 운다");
   }
}