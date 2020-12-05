package poe_cis350;

public class SimpleCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
    
    public int pow(int a, int b) {
    	int power;
    	
    	if (b == 0) {
    		power = 0;
    	}
    	else {
    		power = a;
    	}
    	
    	for (int i = 1; i < b; i++) {
    		power *= a;
    	}
    	
    	return power;
    }
    
    public int sqrt(int a) {
    	int i = 0;
    	
    	while (i*i <= a) {
    		if (i*i == a) {
    			break;
    		}
    		i++;
    	}
    	
    	return i;
    }

    public static final void main(String[] args) {
        System.out.println("Hey there CIS350.");
    }

}
