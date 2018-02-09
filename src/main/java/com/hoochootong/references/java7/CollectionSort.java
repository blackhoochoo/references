package com.hoochootong.references.java7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionSort {
	public List<Transaction> readyTransactions() {
		List<Transaction> groceryTransactions = new ArrayList<>();
		groceryTransactions.add(new Transaction(1000, Transaction.Type.GROCERY));
		groceryTransactions.add(new Transaction(3000, Transaction.Type.GROCERY));
		groceryTransactions.add(new Transaction(1000, Transaction.Type.GROCERY));
		groceryTransactions.add(new Transaction(1000, Transaction.Type.GROCERY));
		groceryTransactions.add(new Transaction(1000, Transaction.Type.VEGETABLE));
		return groceryTransactions;
	}
	
	public void sortGroceries() {
		List<Transaction> groceryTransactions = readyTransactions();
		List<Transaction> groceries = new ArrayList<>();
		for(Transaction t: groceryTransactions) {
			if(t.getType() == Transaction.Type.GROCERY) {
				groceries.add(t);
			}
		}
		Collections.sort(groceryTransactions, new Comparator<Transaction>() {
		public int compare(Transaction o1, Transaction o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getValue(), o2.getValue());
			}
		});
		List groceryIds = new ArrayList<>();
		for(Transaction transaction : groceries) {
			groceryIds.add(transaction.getValue());
		}
		
		System.out.println(groceryIds);
	}
	
	public void sortGroceriesAsStream() {
		List<Transaction> groceryTransactions = readyTransactions();
		List groceryIds = 
				groceryTransactions.stream()
				.filter(t -> t.getType() == Transaction.Type.GROCERY) 
				.sorted(Comparator.comparing(Transaction::getValue))
				.map(Transaction::getValue)
				.collect(Collectors.toList());
				
		System.out.println(groceryIds);
	}
	
	public void collectIds() {
		List<Transaction> groceries = readyTransactions();
		List ids = 
				groceries.stream()
				.map(Transaction::getType)
				.collect(Collectors.toList());
		System.out.println(ids);
		
		Set<Transaction.Type> idSet = 
				groceries.stream()
				.map(Transaction::getType)
				.collect(Collectors.toSet());
		
		for(Transaction.Type id : idSet) {
			System.out.println(id);
		}
	}
	
	public static void main(String[] args) {
		CollectionSort collectionSort = new CollectionSort();
//		collectionSort.sortGroceries();
//		collectionSort.sortGroceriesAsStream();
		collectionSort.collectIds();
	}
}
