package com.algorithm.lur;

import java.util.LinkedHashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class lur<K, V> extends LinkedHashMap<K, V>{
    private final int CACHE_SIZE;

	public lur(int cacheSize){
		super((int)Math.ceil(cacheSize/0.75)+1,0.75f,true);
		CACHE_SIZE = cacheSize;
	}
    @Override
	protected boolean removeEldestEntry(Map.Entry<K, V> map){
		return size() > CACHE_SIZE;
	}
}
