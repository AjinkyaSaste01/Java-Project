class FizzBizz
{
    public static void main(String args[])
    {
     for(int i=1; i<=30; i++)
      {
         if(i%3==0 && i%5==0)
          {
                System.out.println("FizzBizz");
          }
            else if(i%3==0)
             {
                System.out.println("Fizz");
             }
            else if(i%5==0)
             {
              System.out.println("Bizz");
             }
              else
            {
               System.out.println(i);
            }
      }
    }
}