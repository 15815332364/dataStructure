//时间复杂度
public class TimeComplexity {
    /* 时间复杂度是O(n)
       n是nums中的元素个数
       算法和n呈线性关系

     */
    public static int sum(int []nums){
        int sum=0;
        for (int num:nums)sum+=num;
        return sum;
    }
}
