package Module1.day2.Abstract;
class MainAnimal{
    public static void main(String[] args) {
         Animal animal = new Lion();
         animal.eat();
         animal.sleep();
         animal.talk();

         Animal dog = new Dog();
         dog.eat();
         dog.sleep();
         dog.talk();

         Animal deer = new Deer();
         deer.eat();
         deer.sleep();
         deer.talk();
         ((Deer) deer).run();

        Dog dogg = new Dog();
        dogg.petting();
        dogg.eat();
        dogg.sleep();
        dogg.talk();
    }
}
