class TapeDeck {

    boolean canRecord = false;

    void playTape() {
        System.out.println("tape playing");
    }

    void recordTape() {
        System.out.println("tape recording");
    }
}

class TapeDeckTestDrive {

    public static void main(String [] args) {
        TapeDeck t = new TapeDeck();

        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }

        int i = 3;
        while (--i > 0) {
            TapeDeckTestDrive.moveUpAndRight();
        }
    }

    private static void moveUpAndRight() {
        System.out.println("Move Up");
        System.out.println("Move Right");
    }
}