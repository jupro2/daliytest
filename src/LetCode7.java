class LetCode7 {
    public int reverse(int x) {
        int m = 0;//return value
        int min=Integer.MIN_VALUE;//min value  -2^31
        int max= Integer.MAX_VALUE;//max value   2^31-1
       while (x!=0)
       {
           if(m<min/10||m>max/10)//判断边界问题！！！！！
           {
               return 0;
           }
           int val=x%10;
           m= m*10+val;
           x/=10;
       }
        return  m;
    }
}
