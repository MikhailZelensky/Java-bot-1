import java.util.*;

public class ChatBot {
    static Map<Integer,Player> players = new HashMap<Integer, Player>();
    static String help = "Я бот, умею выдавать русское слово,\nполучать перевод слова на английском" +
            "и оценивать корректность перевода\nЧтобы начать игру, введите \"играть\"" +
            "\nЧтобы вывести справку, введите \"help\"";
    public static void getMessage(String message, Integer id) {
        switch (message) {
            case "играть":
                if (!players.containsKey((id))) {
                    players.put(id, new Player());
                    Game.play("", players.get(id));
                }
                else System.out.println(players.get(id).lastQuestion);
                break;
            case "help":
                System.out.println(help);
                break;
            default:
                if (id == 0)
                    System.out.println("Чтобы начать игру, введите \"играть\"");
                else {
                    Game.play(message, players.get(id));
                    System.out.println(players.get(id).point);
                }
        }
    }
}