package Sections.Section9;

public class Labels {
    public static void main(String[] args) {
        // Com as labels, eu posso controlar qual loop eu desejo dar break ou continue usando as próprias labels
        loop1:
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop 1 = " + i);
            
            loop2:
            for (int j = 0; j < 5; j++) {
                System.out.println("Loop 2 = " + j);
                if(j >= 0 && j < 3){
                    System.out.println("Continue loop 2");
                    continue loop2;
                } else {
                    System.out.println("Break loop 1");
                    break loop1;
                }
            }
        }
    }
}
