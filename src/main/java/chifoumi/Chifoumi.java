package chifoumi;

import java.util.Arrays;
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

        System.out.println("résultat= " + determineResult(userChoice, computerChoice));

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


