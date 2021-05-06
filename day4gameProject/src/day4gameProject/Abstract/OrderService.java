package day4gameProject.Abstract;

import day4gameProject.Entities.Campaign;
import day4gameProject.Entities.Game;
import day4gameProject.Entities.User;

public interface OrderService {
	void gameSale(Game game,User user);
	void campaignSale(Game game,User user,Campaign campaign);
}
