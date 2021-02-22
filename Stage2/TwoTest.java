import static org.junit.jupiter.api.Assertions.*;
import edu.yu.cs.com1320.project.impl.*;

import org.junit.jupiter.api.Test;
import java.net.URI;
import java.net.URISyntaxException;
import edu.yu.cs.com1320.project.Stack;
import edu.yu.cs.com1320.project.impl.StackImpl;
import edu.yu.cs.com1320.project.stage2.*;
public class TwoTest {
    @Test
    public void oneStackImpl(){
        Stack<Integer> stack = new StackImpl();
        for(int i = 0; i < 100; i++){
            stack.push(i);
            
        }
        for(int i = 99; i >= 0; i--){
            assertEquals(stack.peek(), i);
            assertEquals(stack.pop(), i);
        }
    }
    public void p(String s){
        System.out.println(s);
    }
    
    
}
