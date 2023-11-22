package strategy.Strategies;

import strategy.GameStrategy;

public class AgressiveDefense implements GameStrategy {
    @Override
    public void showTraining() {
        String[][] formation442 = {

                "Cambio a formacion de defensa agresiva".split(""),


                {"     ","--DI--","--DD--"},

                {"    ","--MI--", "--MCD--", "--MD--", },

                {"--DFI--", "--DFC","--DFC--", "--DFC--", "--DFD--"},
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
