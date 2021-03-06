package animals;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    protected abstract String getVoice();
    protected abstract String move();
    public String test() {
        return this.getClass() + ", name: " + name + ", voice: " + getVoice() + ", move: " + move();
    }

}
