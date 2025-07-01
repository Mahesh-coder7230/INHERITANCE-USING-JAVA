
class Animal {
   public void displayInfo() {
      System.out.println("I am an animal.");
   }
}

class Dog extends Animal {
   public void displayInfo() {
      System.out.println("I am a dog.");
   }
}

class Main {
   public static void main(String[] args) {
      Animal d1 = new Animal();
      d1.displayInfo();
      Dog d2 = new Dog();
      d2.displayInfo();
   }
}