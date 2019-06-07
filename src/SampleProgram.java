
public class SampleProgram
{
    public static void main(String[]args)
    {
        String s1="navinaa";
        int count=0;
        boolean flag=false;
        for(int i=0;i<s1.length();i++)
        {
            count=0;
            for(int j=i;j<s1.length();j++)
            {
                if(s1.charAt(i)==s1.charAt(j))
                {
                    count++;
                }
            }
            for(int k=0;k<i;k++)
            {
                if(s1.charAt(i)==s1.charAt(k))
                {
                    flag=true;
                    break;
                }
                else
                    flag=false;
            }
            if(flag==false && s1.charAt(i)!=' ')
                System.out.println((s1.charAt(i)) +" count is =" +count);
        }
    }
}
