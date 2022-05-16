public class GuessGame {
    //TODO: write code

    private void startGame() {
        //TODO: write code
    }

    public static void main(String[] args) {
        new GuessGame().startGame();
        GuessGame pereminna = new GuessGame();
        pereminna.startGame();
        pereminna = new GuessGame();
        pereminna.startGame();
        System.out.println("koza");
        String k = "asda";
        System.out.println(k);


        Player p1 = new Player();
        Player p2 = new Player();

        p1.guess();
        p2.guess();

        System.out.println(p1.number + ", " + p2.number);
    }
}

class Player {
    int number = 0;

    void guess() {
        number = (int) (Math.random() * 10);
    }

}
