import java.lang.reflect.Array;
import java.util.Arrays;

public class LetCode16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int best=10000;

        for(int i=0;i<n;i++)
        {
            //保证 前后两个不一样
            if(i>0&&nums[i]==nums[i-1])
            {
                continue;
            }
            //使用双指针移动后边两个数
            int j=i+1,k=n-1;
            while (j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target)
                {
                    return target;
                }
                if(Math.abs(sum-target)<Math.abs(best-target))
                {
                    best=sum;
                }
                if(sum>target)
                {
                    int k0=k-1;
                    while (j<k0&&nums[k0]==nums[k]){
                        --k0;
                    }
                    k=k0;
                }else {
                    int k1=j+1;
                    while (k1<k&&nums[k1]==nums[j]){
                        ++k1;
                    }
                    j=k1;
                }
            }
        }
        return best;


    }
}
