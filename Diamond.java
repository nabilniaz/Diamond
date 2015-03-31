class Diamdon {
  public static void main(String[] args) {
    for (int i = 1; i <=5; i += 2) {
      for (int j = 0; j < 3 - i / 2; j++)
        System.out.print(" ");

      for (int j = 0; j < i; j++)
        System.out.print("*");

      System.out.print("\n");
    } // seperates the top half of the diamond
    for (int i=3; i>=0; i-=2 ){ // this starts the loop at 3 astrixes
    	for (int j =0; j<3-i/2; j++) // deals with the spacing.
    		System.out.print(" ");
    	for (int j=0; j<i; j++) // loop to print stars
    		System.out.print("*");
    	System.out.print("\n");
    }

  }
}