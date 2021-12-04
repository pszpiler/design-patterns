package com.szpiler._24_template_method;

import com.szpiler._24_template_method.model.Game;
import com.szpiler._24_template_method.model.SoccerGame;
import com.szpiler._24_template_method.model.StrategyGame;
import com.szpiler._24_template_method.model.VideoGame;

public class Program {
  public static void main(String[] args) {
    Game videoGame = new VideoGame();
    Game strategyGame = new StrategyGame();
    Game soccerGame = new SoccerGame();

    videoGame.play();
    System.out.println("-----------------");

    strategyGame.play();
    System.out.println("-----------------");

    soccerGame.play();
    System.out.println("-----------------");
  }
}
