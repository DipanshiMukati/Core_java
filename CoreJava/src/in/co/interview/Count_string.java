package in.co.interview;

public class Count_string {
         public static void main(String[] args) {
		
               String name = "dipanshimukati@1234";
               int count = 0;
               for (int ch = 'a'; ch<='z'; ch++) {
            	   
            	   for (int i = 0; i < name.length(); i++) {
					
            		   if (name.charAt(i)==ch) {
            	          count++ ;
            	   }
			}
        }
         System.out.println(count);
    }  
}

