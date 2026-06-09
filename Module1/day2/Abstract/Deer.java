package Module1.day2.Abstract;

class Deer implements Animal {
    @Override
    public void eat() {
        System.out.println("Deer is eats leave");
    }

    @Override
    public void sleep() {
        System.out.println("Deer is sleeeps in Jungle");
    }

    @Override
    public void talk() {
        System.out.println("Deer sound is Bleat");
    }
    public void run(){
        System.out.println("Deer runs super fast");
    }
}