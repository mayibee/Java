//We have a dog that likes to bark. We need to wake up if the dog is barking at night. Write a method bark that has 2 parameters. First parameter should be of type boolean and be named barking it represents if our dog is currently barking. Second parameter represents the hour of the day and is of type int with the name hourOfDay and has valid range of 0-23. We have to wake up if the dog is barking before 08:00 am or after 22:00 hours so in that case return true. In all other cases return false. If the hourOfDay parameter is less than 0 or greater than 23 return false.
//
//Sample Outputs:
//
//bark(true,1); = > true
//bark(false,2) = > false
//bark(true,8) = > false
//bark(true,-1) = > false
public class Assignment4Method {

	public static void main(String[] args) {
		System.out.println(bark(true,1));
		System.out.println(bark(false,2));
		System.out.println(bark(true,8));
		System.out.println(bark(true,-1));
	}
	public static boolean bark(boolean barking, int hour) {
		if (hour<0||hour>23) {
			return false;
		} else if (barking == true && (hour<8 || hour>22)) {
			return true;
		} else {
			return false;
		}
	}
}
