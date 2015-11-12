package mathBubble;

public class Mathlibrary {
	
	static String arrayUnsortiert="";
	
	public Mathlibrary()
	{
		
	}
	
	public static void printArray(final int array[])  //(gibt array[] auf der Console aus Verzichten Sie auf die Benutzung der Klasse Arrays)
	{
		
		for (int i = 0; i < array.length; i++) {
			arrayUnsortiert += array[i];
			if(i != array.length-1) arrayUnsortiert += ", ";
			else arrayUnsortiert += " ";
		}
		System.out.println("Array unsortiert: " + arrayUnsortiert);
		
	}
	public static double getAverage(final int array[])  //(soll den Durchschnitt aller Zahlen aus array[] zurückgeben)
	{
		double average=0.0f;
		
		for (int i = 0; i < array.length; i++) {
			average = average + array[i];
		}
		average=average/array.length;
		
		return average;
	}
	public static int getMedian(final int array[])   //(liefert den Median von array[])
	{
		int median = 0;
		Mathlibrary.bubblesort(array);
		
		for (int i = 0; i < array.length; i++) 
		{
			if(i == array.length / 2)
			{
				median = array[i];
			}
		}
		
		return median;		
	}
	public static int getUpperQuartile(final int array[]) //(liefert das obere Quartil von array[])
	{
		int UpperQuartile = 0;
		Mathlibrary.bubblesort(array);

	        int up = Math.round(array.length * 75 / 100);
	        
	        UpperQuartile = array[up];

		return UpperQuartile;
	}
	public static int getLowerQuartile(final int array[])  //(liefert das untere Quartil von array[])
	{ 
		int LowerQuartile = 0;		
		Mathlibrary.bubblesort(array);

	        int low =  Math.round(array.length * 25 / 100);
	        
	        LowerQuartile = array[low];
		
		return LowerQuartile;
	}
	
	public static int[] bubblesort(int[] array) 
	{
		int temp;
		for(int i=1; i<array.length; i++) 
		{
			for(int j=0; j<array.length-i; j++)
			{
				if(array[j]>array[j+1]) 
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
			}
		}
		
		return array;
	}

}
