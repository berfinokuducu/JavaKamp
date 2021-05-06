package day4gameProject.Entities;

import day4gameProject.Abstract.Entity;

public class Game implements Entity{
	private int id;
	private String name;
	private double unitPrice;
	private int unitsInStock;
	public Game()
	{
		
	}
	public Game(int id, String name, double unitPrice, int unitsInStock) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
