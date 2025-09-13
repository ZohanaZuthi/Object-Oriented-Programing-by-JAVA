class calculator {
    public void playMusic() {
        System.out.println("Music Playing ..");
    }

    public String getMeAPen(int cost) {
        if (cost > 100)
            return "Pen";
        else
            return "Nothing";
    }
}

public class Demo {
    public static void main(String a[]) {
        calculator com = new calculator();
        com.playMusic();
        String str = com.getMeAPen(0);
        System.out.println(str);
    }
}