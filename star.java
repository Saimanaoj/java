class star {
  public static void main(String[] args) {

    
    int size = 5;
   
    for (int i = 0; i < size; i++) {
      // print column
      for (int j = 0; j <= i; j++) {
        System.out.print(j+1);
      }
      System.out.println();
    }
  }
}