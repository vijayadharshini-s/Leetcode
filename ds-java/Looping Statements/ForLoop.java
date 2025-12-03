class ForLoop {
    public static void main(String[] args) {
        //Print numbers from 1 to 20
        int n=20;
        for(int i=1;i<=n;i++){
            System.out.print(i+ " ");
        }
        System.out.println();
       //Print the even numbers between 1 and 20.
       for(int i=0;i<=n;i++){
           if(i%2==0){
               System.out.print(i+" ");
           }
       }
       System.out.println();
       //Print the sum of numbers from 1 to 50.
       int sum=0;
       for(int i=0;i<=50;i++){
           sum+=i;
       }
       System.out.print(sum+" ");
       System.out.println();
       //Print the multiplication table of 5
       int num=5;
       System.out.println("Multiplication Table");
       for(int i=1;i<=10;i++){
           System.out.println(i+"x"+"5 = "+(num*i));
       }
       //Print the reverse numbers from 100 to 1.
       for(int i=100;i>0;i--){
           System.out.print(i+" ");
       }
       System.out.println();
       //Print the factorial of a number (ex: 5 → 120).
       int fact=1;
       for(int i =1;i<=5;i++){
           fact*=i;
       }
       System.out.println(fact);
       //Print all numbers divisible by 3 and 5 between 1 and 100.
       for(int i=1;i<=100;i++){
           if(i%3 == 0 & i%5 ==0 ){
               System.out.print(i+" ");
           }
       }
       System.out.println();
      //Print the digits of a number (ex: 567 → 5, 6, 7).
      int number =567;
      String s = Integer.toString(number);
      for(int i=0;i< s.length();i++){
          System.out.print(s.charAt(i));
          if(i<s.length()-1){
              System.out.print(", ");
          }
      }
      System.out.println(); 
      //Check whether a number is prime.
      int prime= 29;
      boolean isPrime = true;
      if(prime<=1){
          isPrime= false;
      }else{
          for(int i=2;i<=prime/2;i++){
              if(prime % i==0){
                  isPrime = false;
                  break;
              }
          }
      }
      if(isPrime){
          System.out.println(prime+" is a prime number.");
      }else{
          System.out.println(prime+" is not a prime number");
      }
      
    }
}