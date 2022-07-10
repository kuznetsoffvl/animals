package animals;

public class Bat extends Animal {
    public Bat(String name) {
        super(name);
    }

    public Bat() {
        this("noname");
    }

    @Override
    protected String getVoice() {
        return "<ultrasound>";
    }

    @Override
    protected String move() {
        return "fly";
    }

    public void fly() {
        System.out.println("Bat is flying");
    }
}
