package exercises.ex3;

public class PaintingApplication {
    public static void main(String[] args) {
        Derek derek = new Derek();
        derek.hangPainting();

        Tool hammer = new Tool("hammer");
        derek.setTool(hammer);
        derek.hangPainting();
    }
}
