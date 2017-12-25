package ss.week5;

import java.util.HashMap;
import java.util.List;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapUtil {
	
	/*@ ensures (\forall K k1;
	  @ map.keySet().contains(k1);
	  @ (\forall K k2; map.keySet().contains(k2) && k1!=k2; map.get(k1)!=map.get(k2)))==\result;
	  @*/
    public static <K, V> boolean isOneOnOne(Map<K, V> map) {
    	for (K k1 : map.keySet()) {
    		int count=0;
    		for (K k2 : map.keySet()) {
    			if (map.get(k1)==map.get(k2)) {
    				count++;
    			}
    		}
    		if (count!=1) {
    			return false;
    		}
    	}
        return true;
    }
    
    /*@ ensures (\forall V v;
      @ range.contains(v);
      @ (\exists K k; map.keySet().contains(k); map.get(k)==v))==\result;
      @*/
    public static <K, V>  boolean isSurjectiveOnRange(Map<K, V> map, Set<V> range) {
    	for (V v: range) {
    		boolean exists=false;
    		for (K k: map.keySet()) {
    			if (v==map.get(k)) {
    				exists=true;
    			}
    		}
    		if (!exists) {
    			return false;
    			}
    		}
        return true;
    }
    
    /*@ ensures (\forall K k;
      @ map.keySet().contains(k);
      @ \result.get(map.get(k)).contains(k));
      @*/
    public static <K, V> Map<V, Set<K>> inverse(Map<K, V> map) {
    	Map<V, Set<K>> invMap = new HashMap<V, Set<K>>();
    	for (K k: map.keySet()) {
    		if (!invMap.containsKey(map.get(k))) {
    			Set<K> s = new HashSet<K>(); 
    			s.add(k);
    			invMap.put(map.get(k), s);
    			
    		}
    		else {
    			invMap.get(map.get(k)).add(k);
    		}
    	}
        return invMap;
	}
    
    /*@ ensures (\forall K k;
      @ map.keySet().contains(k);
      @ \result.get(map.get(k))==k);
      @*/
	public static <K, V> Map<V, K> inverseBijection(Map<K, V> map) {
		Map<V, K> invMap = new HashMap<V, K>();
    	for (K k: map.keySet()) {
    		invMap.put(map.get(k), k);
    		}
        return invMap;
	}
	
	/*@ ensures (\forall K k;
	  @ f.keySet().contains(k);
	  @ g.keySet().contains(f.get(k)))==\result;
	  @*/
	public static <K, V, W> boolean compatible(Map<K, V> f, Map<V, W> g) {
		for (K k:f.keySet()) {
			if (!g.containsKey(f.get(k)))
				return false;
		}
        return true;
	}
	
	/*@ ensures (\forall K k;
	  @ f.keySet().contains(k);
	  @ \result.get(k)==g.get(f.get(k)));
	  @*/
	public static <K, V, W> Map<K, W> compose(Map<K, V> f, Map<V, W> g) {
		Map<K, W> map = new HashMap<K, W>();
		for (K k:f.keySet()) {
			map.put(k, g.get(f.get(k)));
		}
        return null ;  
	}
}
