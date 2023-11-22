package strategy.Strategies;

import strategy.GameStrategy;

public class AttackStrategy implements GameStrategy {

    @Override
    public void showTraining() {
        String[][] formation442 = {
                "Cambio a formacion de Ataque".split(""),

                {"  ","--DI--", "--MCO--", "--DD--"},

                {"  ","--MI--", "--MCD--", "--MD--", },

                {"--DFI--", "--DFC", "--DFC--", "--DFD--"},
                {"-----------PO--------------"}

        };

        for (String[] row : formation442) {
            for (String position : row) {
                if (position.isEmpty()) {
                    System.out.print("      ");
                } else {
                    System.out.print(position + " ");
                }
            }
            System.out.println();
        }


    }
}
