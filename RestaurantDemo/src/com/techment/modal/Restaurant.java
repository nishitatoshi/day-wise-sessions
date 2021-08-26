package com.techment.modal;


public class Restaurant {

	String restaurantName;
    IHotDrink hotDrink;
    ISoftDrink softDrink;
    
    
	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}



	public void setSoftDrink(ISoftDrink softDrink) {
		this.softDrink = softDrink;
	}



	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	
	
	


	public void displayRestaurantDetails()
	{
		System.out.println("Restraunt Name: "+restaurantName);
	    hotDrink.drink();
	    softDrink.drink();
	}



	
}
