class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int a:arr){
            pq.add(a);
        }
        int tot=0;
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            int cost=a+b;
            tot+=cost;
            pq.add(cost);
        }
        return tot;
    }
}