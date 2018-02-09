package com.hoochootong.references.java7;

public class Transaction {
	private int value;
	private Type type;
	public enum Type {
		GROCERY, VEGETABLE, FRUIT
	}

	public Transaction(int value, Type type) {
		super();
		this.value = value;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Transaction [value=" + value + ", type=" + type + "]";
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}