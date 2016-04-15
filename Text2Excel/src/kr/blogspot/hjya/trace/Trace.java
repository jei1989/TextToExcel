/**
 * 
 */
package kr.blogspot.hjya.trace;

/**
 * @author Administrator
 *
 */
public class Trace {

	/**
	 * 
	 */
	public static boolean istrace = true;

	public static void trace(String msg)
	{
		if( istrace ){
			System.out.println(msg);
		}
	}
	
	public static void trace(String msg, boolean istrue)
	{
		if( istrue ){
			System.out.println(msg);
		}
	}
}
