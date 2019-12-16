package pkg2;

import pkg3.OutsidePackage;

 class AccessingVariablesofOtherPackage {
	
	 class parent2 extends OutsidePackage{
		 void method1(){
		 System.out.println(i);
			// System.out.println(j);
			// System.out.println(a.k);
	}
   }
 }
 