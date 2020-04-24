package dp;
class BirdAdapter implements ToyDuck {
    Bird bird;

    public BirdAdapter(Bird bird){
        this.bird = bird;
    }
    @Override
    public void quack() {
        bird.makeSound();

    }

}