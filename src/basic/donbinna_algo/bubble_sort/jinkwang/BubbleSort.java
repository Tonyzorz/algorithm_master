package basic.donbinna_algo.bubble_sort.jinkwang;

public class BubbleSort
{
	public static void main(String[] args)
	{
		int array[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int i, j, temp;
		for (i = 0; i < array.length; i++)
		{
			for (j = 0; j < array.length - 1 - i; j++)
			{

				if (array[j] > array[j + 1])
				{
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (int k = 0; k < array.length; k++)
		{
			if (k < array.length - 1)
			{
				System.out.print(array[k] + ", ");
			}
			else
			{
				System.out.print(array[k]);

			}
		}
	}
}
