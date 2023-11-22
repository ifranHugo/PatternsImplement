package strategy;

import strategy.Strategies.AgressiveDefense;
import strategy.Strategies.AttackStrategy;
import strategy.Strategies.PeacefulDefense;

public class StrategyApp {
    public static void main(String[] args) {
        Team team = new Team();

        team.setGameStrategy(new AttackStrategy());

        team.showTraining();
        team.setGameStrategy(new PeacefulDefense());

        team.showTraining();
        team.setGameStrategy(new AgressiveDefense());

        team.showTraining();

    }
}
