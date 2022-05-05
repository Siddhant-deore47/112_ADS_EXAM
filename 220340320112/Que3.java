class TwoStacks{
	int[] arr;
	int size;
	int top1,top2;
	
	TwoStacks(int n){
		size = n;
		arr = new int[n];
		top2 =n/2;
		top1 = n/2 +1;
	}
	
	void push(int data){
	
		if(top1 > 0){
			top1--;
			arr[top1] = data;
		}else{
			System.out.println("StackOverFlow");
			return;
		}
	}
	
	void push2(int data){
		
		if(top2 < size-1){
			top2++;
			arr[top2] = data;
		}else{
			System.out.println("StackOverFlow");
			return;
		}
	}
	
	int pop(){
		
		if(top1 <= size/2){
			int n = arr[top1];
			top1++;
			return n;
		}else{
			System.out.println("StackUnderFlow");
			System.exit(1);
			
		}
		return 0;
	}
	
	int pop2(){
		
		if(top2 >= size/2 +1){
			int n = arr[top2];
			top2--;
			return n;
		}else{
			System.out.println("StackUnderFlow");
			System.exit(1);
		}
		return 1;
	}
};

class Que3{
	
	public static void main(String[] args){
		 TwoStacks ts = new TwoStacks(10);
		 
		 ts.push(5);
		 ts.push2(10);
		 ts.push2(15);
		 ts.push(11);
		 ts.push2(7);
		 
		 System.out.println("Popped element from stack1 is  "+ ts.pop());
		 ts.push2(40);
		 System.out.println("Popped element from stack2 is  "+ ts.pop2());
		
	}
}