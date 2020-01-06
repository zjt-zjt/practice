package com.lanou.practice;

public class Test  {

	public static void main(String[] args) {
		
	Area<Integer, Integer, Integer> area = new Area<Integer, Integer, Integer>() {
		
		@Override
		public Integer yuan(Integer x1, Integer y1) {
			
			return x1-y1;
		}
	};
		
System.out.println(area.yuan(100, 125));
	}

	

}
