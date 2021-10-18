public class NextGreaterElement2nd {
    
    public int[] nextGreaterElements(int[] nums) {
     
        int n=nums.length;
        int a[]=new int[n+(n-1)];
        for(int i=0;i<a.length;i++)
        {
            if(i<n)
            {
                a[i]=nums[i];
            }
            else
            {
                a[i]=nums[i%n];
            }
        }
        
        int ans[]=new int[n];
        a=nge(a);
        
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=a[i];//=ans[i];
        }
        return nums;
    }
    
    public static int[] nge(int []a)
    {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[a.length];
      //  int i=a.length-1;
       for(int i=a.length-1;i>=0;i--)
        {
            if(st.size()==0)
            {
                ans[i]=-1;
                st.push(a[i]);
            }
            else
            {
                if(st.peek()>a[i])
                {
                    ans[i]=st.peek();
                    st.push(a[i]);
                }
                else  if(st.peek()<=a[i])
                {
                    while(st.size()>0 && st.peek()<=a[i])
                    {
                        st.pop();
                    }
                    
                    if(st.size()==0)
                    {
                        ans[i]=-1;
                        st.push(a[i]);
                    }
                    else
                    {
                        ans[i]=st.peek();
                        st.push(a[i]);
                    }
                }
                
            }
        }
        
        return ans;
    }
}
