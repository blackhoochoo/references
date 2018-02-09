package com.hoochootong.references.java8;

import java.util.ArrayList;
import java.util.List;

public class Stream {
	class Color {
		public final static String RED = "RED";
		public final static String BLACK = "BLACK";
	}
	class Block {
		private String color = null;
		private int weight;

		
		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public Block(String color, int weight) {
			super();
			this.color = color;
			this.weight = weight;
		}
		
		
	}
	public void sumOfWeights() {
		List<Block> blocks = new ArrayList<>();
		blocks.add(new Block(Color.BLACK, 100));
		blocks.add(new Block(Color.BLACK, 200));
		blocks.add(new Block(Color.BLACK, 300));
		blocks.add(new Block(Color.RED, 100));
		int sumOfWeights = 
				blocks.stream()
				.filter(b->b.getColor() == Color.BLACK)
				.mapToInt(b->b.getWeight())
				.sum();
		System.out.println(sumOfWeights);
	}
	
	public static void main(String[] args) {
		Stream stream = new Stream();
		stream.sumOfWeights();
	}
}
