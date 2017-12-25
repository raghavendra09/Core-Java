class Animal
{
 void eat()
 {
  System.out.println("Animal is eating....");
 }
}
class Dog extends Animal
{
 void eat()
 {
  super.eat();
  System.out.println("Dog is eating....");
 }
}
class BabyDog extends Dog
{
 void eat()
 {
  super.eat();
  System.out.println("BabyDog is eating....");
 }
}
class Sample16
{
 public static void main(String args[])
 {
  Animal a;
  a=new Animal();
  a.eat();
  a=new Dog();
  a.eat();
  a=new BabyDog();
  a.eat();
  BabyDog b=new BabyDog();
  b.eat();
 }
}

