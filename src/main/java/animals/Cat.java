package animals;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        this("noname");
    }

    @Override
    protected String getVoice() {
        return "Meow";
    }

    @Override
    protected String move() {
        return "run";
    }

    public void run() {
        System.out.println("Cat is running");
    }

}
