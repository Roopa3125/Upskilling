package com.cg.test;

public class SortingTest {

	
	public static void main(String[] args) {
	
		//Case 1: input: [1,2,3,1] -->true
		//case 2: input [1,2,3,4] ---->false
		//case 3: input [1,1,1,2,2,3,4,5]--->true
		int[] array = {1,2,3,1};
		int[] secondarray = {1,2,3,4};
     boolean res = populateSortingbasedInput(array);
     System.out.println("Final response" +res);
     boolean response = populateSort(secondarray);
	}

	public static boolean populateSortingbasedInput(int[] nums) {
		boolean flag = false;
		 for(int i = 0; i < nums.length; i++) {
	            for(int j = i + 1; j < nums.length; j++) {
	                if(nums[i] == nums[j]) {
	                	flag= true;
	                	System.out.println("Sorting :" +flag);
	                    return true;
	                }
	            }
	        }

	        return false;
		
		
	}
	private static boolean populateSort(int[] secondarray) {
		boolean flag = false;
		int length = secondarray.length;
		for(int i=0; i<length;i++) {
			for(int j=i + 1; j<length;j++) {
				if(secondarray[i] == secondarray[j]) {
					flag=true;
					System.out.println("Boolean second true : "+flag);
					return true;
				}
			}
			
			
		}
		return false;
		
		
	}

	

}
