package animals;

public class Bat extends Animal {
    public Bat(String name) {
        super(name);
    }

    public Bat() {
        this("noname");
    }

    @Override
    public String getVoice() {
        return "<ultrasound>";
    }

    @Override
    public String move() {
        return "Bat is flying";
    }

}
