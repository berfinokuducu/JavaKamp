package eTicaret.business.concretes;

import java.util.Scanner;

import eTicaret.business.abstracts.EPostaVerificationService;

public class EPostaVerificationManager implements EPostaVerificationService{

	@Override
	public boolean activate() {
		Scanner input=new Scanner(System.in);
		System.out.println("Doðrulamak için yes giriniz : ");
		String activate=input.nextLine();
		if(activate.equals("yes"))
		{
			return true;
		}
		return false;
	}
	

}
