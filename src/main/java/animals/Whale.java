package animals;

public class Whale extends Animal {
    public Whale(String name) {
        super(name);
    }

    public Whale() {
        this("noname");
    }

    @Override
    public String getVoice() {
        return "<whale singing>";
    }

    @Override
    public String move() {
        return "Whale is swimming";
    }

}
