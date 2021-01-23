package main;

public class Program {

	/**
	 * @param n is a number of seconds since the beginning of the day
	 * @result is a number of full minutes 
	 */
	public static int integerTask(int n) {
		int result = -1;
		if (n>0)
			result =  n / 60;
		return result;
	}
	
	/**
	 * @param a is a random number
	 * @param b is a random number
	 * @param c is a random number
	 * @result is true if |a| == |b| or  |a| == |c| or  |b| == |c|
	 */
	public static boolean booleanTask(int a, int b, int c) {
		boolean result = false;
		if (Math.abs(a) == Math.abs(b) || Math.abs(a) == Math.abs(c) || Math.abs(b) == Math.abs(c))
			result = true;
		return result;
	}
	
	/**
	 * @param numbers is random array with 4 elements, where only one element is unique
	 * @result is an index of unique element
	 */
	public static int ifTask(int[] numbers) {
		int result = -1;
		boolean f1 = false, f2 = false;
		if (numbers.length !=4)
			return result;
		int count = 0;
		for (int i = 0; i < numbers.length; i++ ) {
			for (int j = 0; j < numbers.length; j++ ) 
				if (numbers[i] == numbers[j])
					count++;
			if (count == 1) {
				f1 = true;
				result =  i+1;
			}
			else if (count == 3) {
				f2 = true;
			}				
			count = 0;			
		}
		if (!f1 || !f2)
			result = -1;
		return result;
	}
	
	/**
	 * @param year is a random year
	 * @result is a string which describes inputed year by South-African calendar
	 */
	public static String caseTask(int year) {
		if (year <=0) 
			return "Invalid data";
		String result = "The year of ";
		year%=60;
		if(year == 0)
			return "The year of black pig";
		switch((int)(Math.ceil(year/12))) {
		case 1:
			result+="green ";
			break;
		case 2:
			result+="red ";
			break;
		case 3:
			result+="yellow ";
			break;
		case 4:
			result+="white ";
			break;
		case 5:
			result+="black ";
			break;
		}
		switch(year%12) {
		case 0:
			result+="pig";
			break;
		case 1:
			result+="rat";
			break;
		case 2:
			result+="cow";
			break;
		case 3:
			result+="tiger";
			break;
		case 4:
			result+="rabbit";
			break;
		case 5:
			result+="dragon";
			break;
		case 6:
			result+="snake";
			break;
		case 7:
			result+="horse";
			break;
		case 8:
			result+="sheep";
			break;
		case 9:
			result+="monkey";
			break;
		case 10:
			result+="chicken";
			break;
		case 11:
			result+="dog";
			break;
		}
		return result;
	}
	
	/**
	 * @param n in a random number
	 * @result is a factorial of number n
	 */
	public static int forTask(int n) {
		if (n < 0)
			return -1;
		int result = 1;
		for(int i = 2; i <= n; i++)
			result*=i;
		return result;
	
	}
	
	/**
	 * @param n in a random number
	 * @result is a reverse number(12345 -> 54321)
	 */
	public static int whileTask(int n) {
		int result = 0;
		if (n < 0)
			result = -1; 
		while(n>0) {
			result = result * 10 + n % 10;
			n/=10;
		}
		return result;
	}
	
	/**
	 * @param numbers is a random array
	 * @result is a count of min elements of the array
	 */
	public static int minMaxTask(int numbers[]) {
		int result = 0, min = numbers[0];
		for (int i = 1; i < numbers.length; i++ )
			if (min > numbers[i]) 
				min=numbers[i];
		for (int i = 0; i < numbers.length; i++ )
			if (min==numbers[i])
				result++;
		return result;		
	}
	
	/**
	 * @param numbers is a random array with 10 elements
	 * @result is last elements which satisfies the condition: A[1] < A[i] < A[10]
	 */
	public static int arrayTask(int numbers[]) {
		int result = -1;
		if (numbers[0] >= numbers[numbers.length-1]) 
			return result;
		for(int i = numbers.length - 2; i > 0; i--) {
			if (numbers[i] < numbers[numbers.length-1] && numbers[i] > numbers[0]) {
				result = i + 1;
				break;
			}
		}
		return result;
	}
	
	/**
	 * @param numbers is a random matrix
	 * @result is an array whose elements are sums of matrix's row elements
	 */
	public static int[] matrixTask(int Matrix[][]) {
		int[] result = new int[Matrix.length];
		for (int i = 0; i < Matrix.length; i++) {
			result[i]=0;
			for(int j = 0; j < Matrix[0].length; j++)
				result[i]+=Matrix[i][j];
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("1)" + integerTask(3061));
		System.out.println("2)" + booleanTask(3, -4, 4));
		int[] Arr1 = {5, 9, 5 ,5} ; System.out.println("3)" + ifTask(Arr1));
		System.out.println("4)" + caseTask(2020));
		System.out.println("5)" + forTask(6));
		System.out.println("6)" + whileTask(1234));
		int[] Arr2 = {7, 7, 4, 8, 5, 3, 7, 2, 1, 1};
		System.out.println("7)" + minMaxTask(Arr2));
		System.out.println("8)" + arrayTask(Arr2));
		int matrix[][] = {	{ 1,  2, 3,  4, 5,  6, 7,  8, 9},
							{ 9,  8, 7,  6, 5,  4, 3,  2, 1},
							{ 1,  1, 1,  1, 1,  1, 1,  1, 1},
							{ 2, -2, 2, -2, 2, -2, 2, -2, 2 }  };
		System.out.print("9)"); int[] Arr3 = matrixTask(matrix);
		for (int i = 0; i < Arr3.length; i++)
			System.out.print(Arr3[i]+ "\t");
	}

}
