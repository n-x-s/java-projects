package exercises.ex2;

public class DoorApplication {
    public static void main(String[] args) {
        Door door = new Door(66);
        Key key = new Key();
        key.open(door);
    }
}
