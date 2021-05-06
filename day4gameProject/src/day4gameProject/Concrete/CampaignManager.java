package day4gameProject.Concrete;

import day4gameProject.Abstract.CampaignService;
import day4gameProject.Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" kampanyas� eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" kampanyas� g�ncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" kampanyas� g�ncellendi.");
		
	}

}
