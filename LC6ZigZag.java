/*static String ZIG_ZAG(String s,int n)
{
    StringBuilder[] row=new StringBuilder[n];
    boolean goingupward=false;
    for(int i=0;i<n;i++)
    {
        row[i]=new StringBuilder();
    }
    int current=0;
    for(char c:s.toCharArray())
    {
        row[current].append(c);
        if(current==0||current==n-1)
        {
            goingupward=!goingupward;
        }
    }
    StringBuilder ans=new StringBuilder();

    for(StringBuilder r :row)
    {
        ans.append(r);
    }
    return ans.toString();
}
public class ZigZagLC6 {
    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        System.out.println(ZIG_ZAG(s,3));
    }

}*/

void main() {
}
static String ZIG_ZAG(String s, int n)
{
    if(n == 1) return s; // edge case

    StringBuilder[] row = new StringBuilder[n];
    boolean goingupward = false;

    for(int i = 0; i < n; i++)
    {
        row[i] = new StringBuilder();
    }

    int current = 0;

    for(char c : s.toCharArray())
    {
        row[current].append(c);

        if(current == 0 || current == n - 1)
        {
            goingupward = !goingupward;
        }

        current += goingupward ? -1 : 1;
    }

    StringBuilder ans = new StringBuilder();

    for(StringBuilder r : row)
    {
        ans.append(r);
    }

    return ans.toString();
}
