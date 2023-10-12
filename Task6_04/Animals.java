
package Task6_04;

public enum Animals {
    KOALA(5),
    BEAR(3),
    TIGER(11),
    SEAL(2),
    PYTHON(1),
    DOLPHIN(4);
    private int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name() + ": age is " + this.age;
    }
}
