package com.james

class Main {
  public static void main(String[] args) {
    int[][] array1 = {{1, 2},
    				  {3, 4}};
    int[][] array2 = {{2, 3},
    				  {2, 1}};
    int[][] productArray = new int[2][2];
    productArray[0][0] = (array1[0][0] * array2[0][0]) + (array1[0][1] * array2[1][0]);
    productArray[0][1] = (array1[0][0] * array2[0][1]) + (array1[0][1] * array2[1][1]);
    productArray[1][0] = (array1[1][0] * array2[0][0]) + (array1[1][1] * array2[1][0]);
    productArray[1][1] = (array1[1][0] * array2[0][1]) + (array1[1][1] * array2[1][1]);
    System.out.println("The new matrix is:");
    for (int i = 0; i < 2; i++) {
    	for (int j = 0; j < 2; j++) {
    		System.out.print(String.format("%1$-" + 4 + "s", productArray[i][j] + " "));
    	}
    	System.out.println();
    }
  }
}
