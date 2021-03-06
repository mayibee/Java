//Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes
//The method should not return anything(void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
//Then it needs to print a message in the format "XX KB = YY MB and ZZ KB". XX represents the original value kiloBytes. YY represents the calculated megabytes. ZZ represents the calculated remaining kilobytes.
//If the parameter kiloBytes is < 0 then print "Invalid Value"
//Sample Output:
//printMegaBytesAndKiloBytes(2050) = > "2050 KB = 2 MB and 2KB"
//Tip: 1 MB = 1024 KB
public class Assignment3Method {
	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2050);
		printMegaBytesAndKiloBytes(3078);
	}
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes<0) {
			System.out.println("Invalid Value");
		}
		int kB = kiloBytes%1024;
		int mB = kiloBytes/1024;
		System.out.println(kiloBytes+" KB = "+mB+" MB and "+kB+" KB");
	}
}
