package ctec.controller;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import ctec.model.Customer;
import ctec.model.Dish;

public class DataController
{
	private Queue<Customer> customerQueue;
	private Stack<Dish> dishes;
	
	public void start()
	{
		doStuffToDishes();
		useTheCustomerQueue();
	}
	
	private void doStuffToDishes()
	{
		dishes = new Stack<Dish>();
		dishes.add(new Dish(true, java.awt.Color.BLUE, 9));
		System.out.println(dishes.size());
		dishes.pop();
		dishes.push(new Dish(false, java.awt.Color.CYAN, 65));
	}
	
	private void useTheCustomerQueue()
	{
		customerQueue = new LinkedList<Customer>();
		customerQueue.add(new Customer(false, "", 3255.32));
		customerQueue.remove();
	}
}
