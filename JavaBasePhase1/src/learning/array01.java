package learning;

public class array01 {

	public static void main(String[] args) {
		//coding for 1 dimensional array 
		//step1 (declaration) //dataType[] arrayName;OR dataType []arrayName;dataType arrayName[];
		//step2 (Construction) firstName = new String[5]; //arrayNAme = new DataType[size];
		String [] firstName = new String[5];
		int [] age = new int[5];
		/*Multidimensional arrays,
		 * dataType[][] arrayRefVar;
		 * dataType arrayRefVar[][];
		 * dataType[] arrayRefVar[];
		 */
		String arr[][];
		arr = new String[5][5];// means 5rows and 5 columns.
		int[][] arr1= new int[2][3]; //2 rows 3 columns.
		// dataType could be primitive and non-primitive such an object.
		Object [] InOutAndSalary = new Object[5];
		
		
		
		int []
				[] MofB= {{7,2020}, {3,2019}, {5,2017}, {6,2010}, {8,2020}, {2,2014}};
	//income,outcome, and salary
		double [][] d= {{74.9,79.3}, {57.4,25,34.086}, {45.7,81.3,40.01}, {73.4,6.79,57.1038},{81.3,40.01}, {73.4,6.79,57.1038}};

				
		//step3 (Initialization)
		firstName[0] = "Salem";
		firstName[1] = "Khaled";
		firstName[2] = "Saeed";
		firstName[3] = "Laila";
		firstName[4] = "Kholoud";
		
		age [1]=22;
		age [0]=26;
		age [3]=24;
		age [4]=27;
		age [2]=22;
		

		//InOutAndSalary[0]= 74.9, 79.3
		//InOutAndSalary[1]= 57.4, 25,34. 086
		//InOutAndSalary[2]= 45.7, 81.3, 40.01
		//InOutAndSalary[3]= 73.4, 6.79, 57.1038
		//InOutAndSalary[4]= 81.3, 40.01
		
	//step4 printing the values from the arrays
		
		
		for (int i=0; i<age.length; i++)
			System.out.println(age[i]);
			
		}
		
}
