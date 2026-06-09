package Module1.day2.Abstract;


    class Dog extends Pet implements Animal {
        public void eat() {
            System.out.println("The dog is eating dog food.");
        }
        public void sleep() {
            System.out.println("The dog is sleeping in its kennel.");
        }
        public void talk() {
            System.out.println("The dog barks.");
        }
    }

