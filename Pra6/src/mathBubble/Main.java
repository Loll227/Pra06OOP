package mathBubble;

public class Main {

	static String arraySortiert="";

	public static void main(String[] args) {
		int[] array = new int[]{50,30,10,80,20,40,90,70,15,60};
		Mathlibrary.printArray(array);
		for(int i=0; i<Mathlibrary.bubblesort(array).length;i++){
			arraySortiert += array[i];
			if(i != array.length-1) arraySortiert += ", ";
			else arraySortiert += " ";
		}
		System.out.println("Array sortiert: " + arraySortiert);	
		System.out.println();		
		System.out.println("Durchschnitt: " + Mathlibrary.getAverage(array));
		System.out.println("Median: " + Mathlibrary.getMedian(array));
		System.out.println("Unteres Quartil: " + Mathlibrary.getLowerQuartile(array));
		System.out.println("Oberes Quartil: " + Mathlibrary.getUpperQuartile(array));
	}

}
