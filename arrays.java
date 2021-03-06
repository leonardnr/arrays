/**
 * 		arrays
 *
 * 			Methods for dealing with arrays
 *
 * 		Nick Leonard
 */


public class arrays{

	public static void main(String[] args) {
		int[] nums = {3, 6, 4, 3, 2, 1, 5, 6};
		System.out.println(threes(nums));

		System.out.println(avg(nums));
	}

	/**
	 * avg
	 * 		Finds the mean of an array
	 *
	 *
	 * @param nums - the array
	 * @return the mean
	 */
	public static double avg(int[] nums){
		return (sum(nums)) / nums.length;

	}

	/**
	 * sum
	 * 		Finds the sum of an array
	 *
	 * @param nums - the array
	 * @return the sum
	 */
	public static double sum(int [] nums){
		double counter = 0;
		
		for(int i = 0; i < nums.length; i++){
			counter += nums[i];
		}

		return counter;
	}
	/**
	 * threes
	 * 		Finds the number of 3's in an array
	 *
	 * @param nums - the array
	 * @return the number of 3's in the array
	 */
	public static int threes(int[] nums){
		int counter = 0;

		for(int i = 0; i < nums.length; i++){
			if(nums[i] == 3){
				counter++;
			}
		}

		return counter;
	}


}