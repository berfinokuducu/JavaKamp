package eTicaret.core.concretes;

import eTicaret.core.abstracts.EPostaService;

public class EPostaManager implements EPostaService{

	@Override
	public void sendEPosta(String message) {
		System.out.println("Doðrulama için mail gönderildi "+message);
		
	}

}
