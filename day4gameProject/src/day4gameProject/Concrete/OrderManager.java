package day4gameProject.Concrete;

import day4gameProject.Abstract.OrderService;
import day4gameProject.Entities.Campaign;
import day4gameProject.Entities.Game;
import day4gameProject.Entities.User;

public class OrderManager implements OrderService{

	@Override
	public void gameSale(Game game, User user) {
		System.out.println(game.getName()+" oyunu "+user.getFirstName()+" "+user.getLastName()+" tarafýndan satýn alýndý.");
		
	}

	@Override
	public void campaignSale(Game game, User user, Campaign campaign) {
		double price=game.getUnitPrice()-(game.getUnitPrice()* (campaign.getDiscount()/100));
		System.out.println(game.getName()+" oyunu "+campaign.getName()+" kampanyasýyla "+price+" fiyatýyla "+user.getFirstName()+" "+user.getLastName()+" tarafýndan satýn alýndý.");
		
	}

}
