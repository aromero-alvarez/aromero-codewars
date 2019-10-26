package com.aromero.fundamentals;

import com.aromero.fundamentals.model.Fighter;

public class FighterKata {

    /*
    Create a function that returns the name of the winner in a fight between two fighters.

    Each fighter takes turns attacking the other and whoever kills the other first is victorious.
    Death is defined as having health <= 0.

    Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.

    Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0.
    You can mutate the Fighter objects.
     */

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        Fighter first = firstAttacker.equalsIgnoreCase(fighter1.name) ? fighter1 : fighter2;
        Fighter second = !firstAttacker.equalsIgnoreCase(fighter1.name) ? fighter1 : fighter2;
        String winnerName;

        for (;;) {
            second.health = second.health - first.damagePerAttack;
            if (second.health <= 0){
                winnerName = first.name;
                break;
            }
            first.health = first.health - second.damagePerAttack;
            if (first.health <= 0){
                winnerName = second.name;
                break;
            }
        }
        return winnerName;
    }
}
