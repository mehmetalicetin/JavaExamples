/**
 * 
 */
package com.cetin.i2i.exnull;

/**
 * @author 7767
 *
 */
public class Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Ex1 a=null;
		//a.staticMethod();
		//a.nonStaticMethod();
		
		System.out.println("Am i null :"+a.isNull());
		
		checkNull();

	}

	private boolean isNull() {
		return null==null;
		
	}

	private static void nonStaticMethod() {
		System.out.println("Hello i am static. ");
	}

	private void staticMethod() {
		System.out.println("Hello I am not static. ");
	}
	
	
	public static void checkNull() {
		Long parentProdID = null;
		long prodID = 123456L;

		if ((parentProdID != null) && parentProdID == prodID) {
			System.out.println("Parent ");
		} else if (parentProdID == null) {
			System.out.println("Not Parent");
		}

	}
	
	public static void checkNull2() {
		Long parentProdID = null;
		Long prodID = 123456L;

		if ((parentProdID != null) && parentProdID == prodID) {
			System.out.println("Parent ");
		} else if (parentProdID == null) {
			System.out.println("Not Parent");
		}

	}

}
