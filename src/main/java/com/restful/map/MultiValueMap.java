package com.restful.map;

import java.util.List;
import java.util.Map;
import org.springframework.lang.Nullable;

/**
 * Extension of the {@code Map} interface that stores multiple values.
 */
public interface MultiValueMap<K, V> extends Map<K, List<V>> {
	/**
	 * Return the first value for the given key.
	 * @param key the key
	 * @return the first value for the specified key, or {@code null} if none
	 */
	@Nullable
	V getFirst(K key);

	/**
	 * Add the given single value to the current list of values for the given key.
	 * @param key the key
	 * @param value the value to be added
	 */
	void add(K key, @Nullable V value);

	/**
	 * Add all the values of the given list to the current list of values for the given key.
	 * @param key they key
	 * @param values the values to be added
	 */
	void addAll(K key, List<? extends V> values);

	/**
	 * Add all the values of the given {@code MultiValueMap} to the current values.
	 * @param values the values to be added
	 */
	void addAll(MultiValueMap<K, V> values);

	/**
	 * Set the given single value under the given key.
	 * @param key the key
	 * @param value the value to set
	 */
	void set(K key, @Nullable V value);

	/**
	 * Set the given values under.
	 * @param values the values.
	 */
	void setAll(Map<K, V> values);

	/**
	 * Returns the first values contained in this {@code MultiValueMap}.
	 * @return a single value representation of this map
	 */
	Map<K, V> toSingleValueMap();
}
