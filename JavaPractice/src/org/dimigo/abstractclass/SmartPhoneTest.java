/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author : KHH
 * @version : 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		
		SmartPhone[] phones = {
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		
		for (SmartPhone phone : phones) {
			System.out.println(phone);
			phone.turnOff();
			phone.pay();
			phone.useSpecialFunction();
			phone.turnOff();
			System.out.println();
		}
		
	}

}
