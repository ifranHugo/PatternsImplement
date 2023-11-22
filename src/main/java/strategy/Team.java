package strategy;

import strategy.Strategies.PeacefulDefense;

public class Team {
    private GameStrategy gameStrategy;

    public Team(){
        this.gameStrategy = new PeacefulDefense();
    }
    public void setGameStrategy(GameStrategy gameStrategy){
        this.gameStrategy = gameStrategy;
    }
    public void showTraining(){
        this.gameStrategy.showTraining();
    }
}
