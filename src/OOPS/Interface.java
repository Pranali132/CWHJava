package OOPS;
interface Bicycle{
	int a=45;
	void applyBrake(int decrement);
	void speedup(int increment);
}
interface HornBicycle{
	int x=78;
	void blowHornK3g();
	void blowHornmhn();
}
class AvonCycle implements Bicycle,HornBicycle{
	public void blowHornK3g() {
		System.out.println("Pee Pee Poo Poo");
	}
	public void applyBrake(int decrement) {
		System.out.println("Applying Brake");
     }
	public void speedup(int increment) {
		System.out.println("Applying SpeedUp");
   }
	public void blowHornmhn() {
		System.out.println("Main Hoon na");
    }
}

public class Interface {

	public static void main(String[] args) {
		AvonCycle Harry=new AvonCycle();
		Harry.applyBrake(2);
		Harry.speedup(2);

		System.out.println(Harry.a);
		System.out.println(Harry.x);
        Harry.blowHornK3g();
        Harry.blowHornmhn();



	}

}
