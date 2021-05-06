package day4gameProject.Concrete;

import day4gameProject.Abstract.GameService;
import day4gameProject.Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+ " oyunu eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+ " oyunu silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+ " oyunu gŁncellendi");
		
	}

}
