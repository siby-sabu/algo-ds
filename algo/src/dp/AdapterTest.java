package dp;
class AdapaterTest {
    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.makeSound();
        ToyDuck td = new PlasticToyDuck();
        td.quack();

        BirdAdapter ba = new BirdAdapter(b);
        ba.quack();
    }
}