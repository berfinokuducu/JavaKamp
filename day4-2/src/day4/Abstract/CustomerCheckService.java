package day4.Abstract;

import java.rmi.RemoteException;

import day4.Entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer) throws RemoteException;

}
 