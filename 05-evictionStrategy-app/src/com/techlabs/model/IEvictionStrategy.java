package com.techlabs.model;

public interface IEvictionStrategy<K,V> {
	V get(K key);
	void put(K key, V value);
}
