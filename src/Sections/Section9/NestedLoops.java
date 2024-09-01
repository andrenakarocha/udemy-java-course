package Sections.Section9;

public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Primeiro loop i = " + i);
            // Nested loop:
            for (int j = 0; j < 3; j++) {
                System.out.println("Segundo loop j = " + j);
            }
        }
    }
}
