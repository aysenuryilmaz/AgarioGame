package tr.org.linux.kamp.agarioclone;

import java.awt.Color;

import tr.org.linux.kamp.agarioclone.logic.GameLogic;
import tr.org.linux.kamp.agarioclone.model.Difficulty;

public class AgarioCloneApp {
	public static void main(String[] args) {
		
		GameLogic gameLogic = new GameLogic("Guray",Color.black,Difficulty.EASY);
		gameLogic.startApplication();
	
	}
}
