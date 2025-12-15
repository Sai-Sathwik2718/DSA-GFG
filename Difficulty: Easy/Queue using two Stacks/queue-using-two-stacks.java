// User function Template for Java
class StackQueue {
    Stack<Integer> first;
    Stack<Integer> second;
    public StackQueue(){
        first=new Stack<>();
        second=new Stack<>();
    }
    public void push(int B) {
        // code here
        first.push(B);
        
    }

    public int pop() {
        if(first.isEmpty() && second.isEmpty()){
            return -1;
        }
        if(second.isEmpty()){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
        }
        return second.pop();

        
        // code here
    }
}