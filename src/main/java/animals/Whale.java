package animals;

public class Whale extends Animal {
    public Whale(String name) {
        super(name);
    }

    public Whale() {
        this("noname");
    }

    @Override
    protected String getVoice() {
        return "<singing>";
    }

    @Override
    protected String move() {
        return "swim";
    }

    public void swim() {
        System.out.println("Whale is swimming");
    }
}
