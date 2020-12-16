package com.chess.util;

public class StringUtil {

	/**
	 * Determine whether string is empty
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		return (str == null || str.trim().equals(""));
	}
	
	/**
	 * Determine whether string is not empty
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str) {
		return (str != null && !str.trim().equals(""));
	}
}
