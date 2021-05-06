package day4gameProject.Abstract;

import java.rmi.RemoteException;

import day4gameProject.Entities.User;

public interface UserCheckService {
	boolean checkIfRealPerson(User user) throws RemoteException;
}
