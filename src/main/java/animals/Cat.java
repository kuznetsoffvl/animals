package animals;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        this("noname");
    }

    @Override
    public String getVoice() {
        return "Meow";
    }

    @Override
    public String move() {
        return "Cat is running";
    }

}
