package ChessClub;

public class ChessApp {
    public static void main(String[] args) {
        Player player1 = new Player("Lex", 0, -0.23f, true);
        Player player2 = new Player("Wim", 1963, 0.73f, false);
        Player player3 = new Player("Sebastiaan", 1993, 0.5f, false);
        Player player4 = new Player("Karan", 1993);
        Player.startGame(player2);
        Player.startGame(player3);
        Player.startGame(player2, player3);
    }
}
