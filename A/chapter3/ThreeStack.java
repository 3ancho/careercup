import java.util.*;
class ThreeStack {
    int init_size = 10; //single stack len
    int[] stack_len = {0,0,0}; 
    int[] array;

    public ThreeStack() {
        array = new int[this.init_size*3];
    }
    public ThreeStack(int init_size) {
        this.init_size = init_size;
        array = new int[init_size*3];
    }

    public void push(int stack_number, int data_obj) {
        if (!this.full(stack_number)) {
            this.array[this.stack_len[stack_number]++ + this.init_size * stack_number] = data_obj; 
        }
    }
    
    public boolean empty(int stack_number) {
       return stack_len[stack_number] == 0; 
    }

    public boolean full(int stack_number) {
        return this.stack_len[stack_number] == this.init_size - 1;
    }
    
    public int peak(int stack_number) {
        return this.array[this.stack_len[stack_number]];
    }
    
    public int pop(int stack_number) {
        return this.array[this.stack_len[stack_number]-- + this.init_size * stack_number]; 
    }
}
