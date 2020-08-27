public class Assignment {
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		String str = obj.nextLine();
		String desiredString =str.replace('a', '4').replace('A','4')
				.replace('e', '3').replace('E', '3')
				.replace('i', '1').replace('I', '1')
				.replace('o', '0').replace('O', '0')
				.replace('s', '5').replace('S', '5')
				.replace('t', '7').replace('T', '7')
				.replace('b', '5').replace('D', '5');
		System.out.println(desiredString);
	

	

}


}
