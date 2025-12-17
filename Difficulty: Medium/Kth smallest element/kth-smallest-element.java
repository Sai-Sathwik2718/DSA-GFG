class Solution {
    public static int kthSmallest(int arr[], int k) {
        //  code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:arr){
            pq.add(x);
        }
        int b=0;
        for(int i=0;i<k;i++){
            b=pq.poll();
        }
        return b;
    }
}
