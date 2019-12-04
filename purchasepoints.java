package preCourseWork;

public class purchasepoints {

	public static void main(String[] args) {
		
	/*	A retailer offers a rewards program to its customers, awarding purchasepoints based on each recorded purchase.
		A customer receives 2 purchasepoints for every dollar spent over $100 in each transaction, plus 1 point 
		for every dollar spent over $50 in each transaction
		(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 purchasepoints).
		Given a record of every transaction during a three month period, calculate the reward purchasepoints earned
		for each customer per month and total.
		
			*/
		 int[][] purchasepoints = {{ 48, 108, 167, 201}, 
				 		           { 180, 87, 108, 67},
				 		           {289, 341, 208, 135}};
	       int purchasepointsInMonth = 0;
	       int totalpurchasepoints = 0;
	       int temp = 0;
	       int i;
	       int j;

	            for (i = 0; i < purchasepoints.length; i++) {
	                for (j = 0; j < purchasepoints[i].length; j++) {
	                    if ((purchasepoints[i][j] > 50) && (purchasepoints[i][j] <= 100)) {
	                        purchasepointsInMonth = purchasepointsInMonth + purchasepoints[i][j] - 50;
	                    }
	                    if (purchasepoints[i][j] > 100) {
	                        purchasepointsInMonth = purchasepointsInMonth + 50;
	                        temp = 2 * (purchasepoints[i][j] - 100);
	                        purchasepointsInMonth = purchasepointsInMonth + temp;
	                      
	                    }
	                }
	               System.out.println("purchasepoints earned in month " + (i + 1) + ": " + purchasepointsInMonth);
	                totalpurchasepoints = totalpurchasepoints + purchasepointsInMonth;
	                purchasepointsInMonth = 0;
	            }
	               System.out.println("Total purchasepoints earned: " + totalpurchasepoints);
	        }
	
	
}


