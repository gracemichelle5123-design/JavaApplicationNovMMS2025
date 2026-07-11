public class ReturnStatement{
	public static void main(String [] args) {
		System.out.println("The Area Of The Rectangle Is " + areaOfRectangle(7,20));
		System.out.println("The Area Of The Rectangle Is " + areaOfRectangle(10,30));
		System.out.println("The Area Of The Rectangle Is " + areaOfRectangle(2,5));
		System.out.println("The Area Of The Rectangle Is " + areaOfRectangle(245,530));
		System.out.println("The Area Of The Rectangle Is " + areaOfRectangle(53,20));
		System.out.println("The Area Of The Rectangle Is " + areaOfRectangle(5,510));
		System.out.println("The Area Of The Rectangle Is " + areaOfRectangle(60,400));
	
	}
	

		public static int areaOfRectangle(int length, int height) {
		
		int area = length * height;
		
		return area ;
	}
	
}

	
	