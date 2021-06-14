package Method;

public class MethodOverloading {
		static void foo() {
			System.out.println("Good Morning!!!!!!!!");
		}
		static void foo(int a) {
			System.out.println("Good Afternoon!!!!!!!!"+a);
         }
		static void foo(int a,int b) {
			
			System.out.println("Good Evening!!!!!!!!"+b+" "+a);

		}
			public static void main(String[] args) {
				foo();
				foo(100);
				foo(200,300);

		}


}

