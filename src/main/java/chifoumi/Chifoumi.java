package chifoumi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Chifoumi {

    static String userChoice = "pierre";
    static String computerChoice = "pierre";

    // index [i][0] choix utilisateur
    // index [i][1] choix ordinateur
    // index [i][2] résultat
    static String[][] result = {
            {"pierre", "pierre", "égalité"},
            {"ciseau", "ciseau", "égalité"},
            {"pierre", "ciseau", "utilisateur gagne"}
    };

    public static void main(String[] args) {

        String result = determineResult(userChoice, computerChoice);
        String translation = translateResult(result);
        System.out.println("résultat= " + result);
        System.out.println("traduction= " + translation);
        }

    private static String translateResult(String result) {
        Map<String, String> translateMap = new HashMap<>();
        translateMap.put("égalité", "rejoue encore");
        translateMap.put("utilisateur gagne", "ça veut dire que tu peux te casser maintenant");
        return Objects.equals(result, " ") ? "je ne sais pas" : translateMap.get(result);
    }

    public static String determineResult(String userChoice, String computerChoice){
            for (String[] res : result) {
                if (res[0].equals(userChoice) && res[1].equals(computerChoice)) {
                    return res[2];
                }
            }
            return " ";
        }
    }


