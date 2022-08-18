public class h5
{
    public static void main(String[] args)
    {
      char name[]=new char[] {'M','O','H','A','M','M','E','D'};
      for(int i=0;i<=2;i++)
      {
          for(int j=0;j<=10;j++)
          {
            if(i==1&&j==2||i==1&&j==3||i==1&&j==4||i==1&&j==5||i==1&&j==6||i==1&&j==7||i==1&&j==8||i==1&&j==9)
                System.out.print(name[j-2]);
            else
            {
                System.out.print("*");
            }

            }
          System.out.print("\n");
      }
    }
}
