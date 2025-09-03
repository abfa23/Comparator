package Lesson4;

public class TivoliRide {
    private String RideName;
    private static int Height;

    public TivoliRide(int Height) {
        this.Height = Height;
    }

    public void getHeight(int Height) {
        if (Height > 150 ) {
            System.out.println("You may enter.");
        } else {
            System.out.println("Get lost midget.");
        }
    }
}