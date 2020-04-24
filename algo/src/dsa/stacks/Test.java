package dsa.stacks;

class Test {
    public static void main(String[] args) {
        Stack<Integer> s = new ArrayStack<>();
        System.out.println(s.pop());
        s.push(1);
        s.push(10);
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.pop());


    }
}