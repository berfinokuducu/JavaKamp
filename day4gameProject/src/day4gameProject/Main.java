package day4gameProject;

import day4gameProject.Adapters.MernisServiceAdapter;
import day4gameProject.Concrete.CampaignManager;
import day4gameProject.Concrete.GameManager;
import day4gameProject.Concrete.OrderManager;
import day4gameProject.Concrete.UserManager;
import day4gameProject.Entities.Campaign;
import day4gameProject.Entities.Game;
import day4gameProject.Entities.User;

public class Main {

	public static void main(String[] args) {
		User user=new User();
		user.setId(1);
		user.setFirstName("Berfin");
		user.setLastName("Okuducu");
		user.setNationalityId("00000000000");
		user.setDateofBirth("1998");
		UserManager userManager=new UserManager(new MernisServiceAdapter());
		
		try
		{
			userManager.update(user);
		}
		catch(Exception e){
			System.out.println(e);
		}
		Game game=new Game(1,"xxx",100,100);
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		
		Campaign campaign=new Campaign(1,"yyy",10);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		
		OrderManager orderManager=new OrderManager();
		orderManager.campaignSale(game, user, campaign);

	}

}
