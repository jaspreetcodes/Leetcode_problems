class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        double m;
        int l=(a.length+b.length),i,j=0,temp;
        int c[]=new int[l];
        for(i=0;i<a.length;i++)
            c[j++]=a[i];
        for(i=0;i<b.length;i++)
            c[j++]=b[i];
        for(i=0;i<l-1;i++)
        {
            for(j=0;j<l-i-1;j++)
            {
                if(c[j]>c[j+1])
                {
                    temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
        }
        if(l%2==0)
            return (c[l/2]+c[(l/2)-1])/2.0;
            else
                return c[l/2]/1.0;
    }
}