import java.util.Random;

public class Game {
    static String[][] gloss = {
            {"стол", "table"},
            {"чай", "tea"},
            {"кофе", "coffee"},
            {"стул", "chair"},
            {"окно", "window"}
    };

    public static void play (String message, Player player) {
        Random random = new Random();
        int number = random.nextInt(5);
        if (!message.equals("")) {
            if (message.equals(player.expectedAnswer)) {
                player.point += 1;
                System.out.println("Перевод верный");
            }
            else System.out.println("Перевод неверный");
        }
        player.lastQuestion = gloss[number][0];
        player.expectedAnswer = gloss[number][1];
        System.out.println(player.lastQuestion);
    }

}