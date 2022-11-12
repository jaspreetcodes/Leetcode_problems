class Solution {
    public int[] twoSum(int[] a, int target) {
        int i,j,c[]=new int[2];
        for(i=0;i<a.length-1;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==target)
                {
                    c[0]=i;
                    c[1]=j;
                    return c;
                }
            }
        }
    return c;
    }
}