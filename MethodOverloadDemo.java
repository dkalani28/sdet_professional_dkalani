package core_java.Lab_Solutions.Lab3;

public class MethodOverloadDemo{

		int calPerimeter(int num1)
	    {
	        return 4*num1;
	    }
	    int calPerimeter(int num1, int num2)
	    {
	        return 2*(num1+num2);
	    }
	    int calPerimeter(int num1, int num2, int num3)
	    {
	        return num1+num2+num3;
	    }
	    int calPerimeter(int num1, int num2, int num3,int num4)
	    {
	        return num1+num2+num3+num4;
	    }
	    
	    public static void main(String[] args) 
	    {    
	    	MethodOverloadDemo obj = new MethodOverloadDemo();
	    	
	    	int a=5, b=6, c=7, d=8;
	    	
	    	System.out.println("Perimeter of Square is: "+obj.calPerimeter(a));
	       
	        System.out.println("Perimeter of Rectangle is: "+obj.calPerimeter(a,b));
	       
	        System.out.println("Perimeter of Triangle is: "+obj.calPerimeter(a,b,c));
	        
	        System.out.println("Perimeter of Quadrilateral is: "+obj.calPerimeter(a,b,c,d));
	    }
}


