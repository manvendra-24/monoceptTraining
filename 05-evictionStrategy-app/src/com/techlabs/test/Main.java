package com.techlabs.test;

import com.techlabs.model.CustomMap;
import com.techlabs.model.IEvictionStrategy;
import com.techlabs.model.LFUStrategy;
import com.techlabs.model.LRUStrategy;
import com.techlabs.model.FIFOStrategy;

public class Main {
	public static void main(String[] args) {

		IEvictionStrategy<String, Integer> strategy1 = new FIFOStrategy<>(3);
		IEvictionStrategy<String, Integer> strategy2 = new LRUStrategy<>(3);
		IEvictionStrategy<String, Integer> strategy3 = new LFUStrategy<>(3);
		
		CustomMap<String, Integer> customMap1 = new CustomMap<>(strategy1);
		CustomMap<String, Integer> customMap2 = new CustomMap<>(strategy2);
		CustomMap<String, Integer> customMap3 = new CustomMap<>(strategy3);
		
		customMap1.put("a", 1);
		customMap1.put("b", 2);
		customMap1.put("c", 3);
		customMap1.put("d", 4);
		
		customMap2.put("a", 1);
		customMap2.put("b", 2);
		customMap2.put("c", 3);
		customMap2.put("d", 4);
		
		customMap3.put("a", 1);
		customMap3.put("b", 2);
		customMap3.put("c", 3);
		customMap3.put("d", 4);

		System.out.println("FIFO Strategy ------ ");
		System.out.println(customMap1.get("a"));
		System.out.println(customMap1.get("b"));
		System.out.println(customMap1.get("c"));
		System.out.println(customMap1.get("d"));
		
		System.out.println("LRUStrategy ------ ");
		System.out.println(customMap2.get("a"));
		System.out.println(customMap2.get("b"));
		System.out.println(customMap2.get("c"));
		System.out.println(customMap2.get("d"));
		
		System.out.println("LFUStrategy ------ ");
		System.out.println(customMap3.get("a"));
		System.out.println(customMap3.get("b"));
		System.out.println(customMap3.get("c"));
		System.out.println(customMap3.get("d"));
	}
}
