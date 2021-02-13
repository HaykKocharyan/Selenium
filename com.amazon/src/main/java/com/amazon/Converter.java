package com.amazon;

public interface Converter<T1, T2> {
	T2 Execute (T1 item);
}