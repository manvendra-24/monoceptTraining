package com.techlabs.model;

public class CustomMap<K,V> {
	private final IEvictionStrategy<K, V> strategy;

	public CustomMap(IEvictionStrategy<K, V> strategy) {
		this.strategy = strategy;
	}

	public V get(K key) {
		return strategy.get(key);
	}

	public void put(K key, V value) {
		strategy.put(key, value);
	}
}
