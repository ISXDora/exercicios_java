static int ff( int n) {

    if (n == 1) return 1;

    if (n % 2 == 0) return ff( n/2);

    return ff( (n-1)/2) + ff( (n+1)/2);

}

 

public static void main(String[] args) {

  System.out.println(ff(7));                     

}