import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      char[] brac = new char[100];
        Stack <Character> s = new Stack<Character>();
      while (sc.hasNext()) {
          int flag=0;
          char temp;
          
             String input=sc.next();
            //Complete the code
          for(int i=0;i<input.length();i++)
          {
               if(input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[')
                {
                    s.push(input.charAt(i));
                }
               else
                {
                   
                   if(s.empty())
                    {
                        System.out.println("false");
                        flag=1;
                        break;
                    }
                      temp=s.peek();
    if((temp=='{' && input.charAt(i)=='}') ||(temp =='(' && input.charAt(i)==')')||(temp=='[' &&                                                                                          input.charAt(i)==']'))
                    {
                        s.pop();
                    }
                    else
                    {
                        System.out.println("false");
                        flag=1;
                        break;
                    }
          }
              
      }
            if(flag==0)
            {
          if(s.empty())
              System.out.println("true");
          else
               System.out.println("false");
            }
          s.empty();
   }
    
}
}

