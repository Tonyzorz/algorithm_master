package basic.donbinna_algo.heap_sort.jinkwang;

public class HeapSort
{
	public static void main(String[] args)
	{
		int[] array = {9, 5, 3, 8, 2, 0, 1, 7};
		heapSort(array);
		//출력
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}

	}

	/**
	 * 배열을 받아 heap sort한다.
	 * @param array
	 */
	public static void heapSort(int[] array)
	{

		heapify(array, array.length);

		for (int i = array.length - 1; i > 0; i--)
		{
			swap(array, 0, i);// 젤큰 수가 0에 있으니까 그걸 맨 뒤에 i와 바꾸어서 배열을 정렬해준다.
			heapify(array, i);// 완전 2진 트리로 만드는 작업 최대값이 root로 오게 한다.( min방식도 있는데 그건 젤 큰값이
								// leaf로 가면됨)
		}
	}

	/**
	 * 완전 2진트리로 만들고 최대값을 root에 저장한다.
	 * @param array
	 * @param idx
	 */
	public static void heapify(int[] array, int idx)
	{

		for (int i = 1; i < idx; i++)
		{
			int child = i;
			while (child > 0)
			{
				int parent = (child - 1) / 2;
				if (array[child] > array[parent])
				{
					swap(array, child, parent);
				}
				child = parent;
			}
		}
	}

	/**
	 * 부모와 자식 노드를 비교하여 자리를 바꿔준다. 조건에 따라 바뀌지만 최대값에선 부모쪽이 큰값이 오도록, 최소값에선 부모쪽이 작은값이 오도록 교환한다.
	 * @param array
	 * @param child
	 * @param parent
	 */
	public static void swap(int[] array, int child, int parent)
	{
		int temp = array[child];
		array[child] = array[parent];
		array[parent] = temp;
	}

}
