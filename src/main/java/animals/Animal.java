package animals;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract String getVoice();
    public abstract String move();
    public String test() {
        return this.getClass() + ", name: " + name + ", voice: " + getVoice() + ", move: " + move();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
