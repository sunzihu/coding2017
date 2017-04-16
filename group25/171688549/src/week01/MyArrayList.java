package week01;
import java.util.*;

public class MyArrayList<T> implements List {
	
	private int length = 0;//���Ա��е�ǰ������
	
	private Object[] elementData = new Object[100];

	private Object entry;
	
	public void add(Object o){
		if (isFull())
		
			doubleArray();
			Object newEntry = null;
			elementData[length]= newEntry;
			length++;
	

		if (!isFull())
		{
			//��Ԫ�ص�λ�ý��������б��е����һ��Ԫ��֮��Ҳ����˵������λ��length+1��
			//������Ӧ������������λ����1������������length
			elementData[length] = o;
			length++;
		}//end add
		        	
	}



private boolean isFull() {
	int in = ((List) entry).size();
	
	return length == in;
	}

	/*	* Task��Ϊһ����Ԫ����indexλ�ô��ڳ��ռ䡣
		* Precondition:1<=index<=length+1;
		*			length�����Ա��ڲ���ǰ�ĳ���*/
	private void makeRoom(int newInex)
		{
			int index=0;
			//��ÿ��Ԫ���ƶ�����һ����Ÿ��ߵ�λ�ã������Ա��ĩβ��ʼ��������ȥ��
			//ֱ��index����Ԫ�ر��ƶ�Ϊֹ
			for (int newIndex=length;newIndex>=index ;newIndex-- )
			{
				elementData[newIndex]  = elementData[newIndex-1];
			}
		}
		
		public boolean isEmpty()
	{
		return length==0;
	}//end isEmpty
	public void add(int index, Object o){
		
		if (!isFull()&&(index>1)&&(index<=length+1))
		{
			makeRoom(index);
			length++;
			elementData[index-1] = o;}
			
		}//end add	
	public Object get(int index){
		
		Object result = null;
		if ((index >=1)&&(index <=length))
		{
			assert !isEmpty();
			result = elementData[index];

		}
		return result;

	}//end getEntry
	
	public Object remove(int index){
		return null;//����ֵ

	}//end remove
/* * Task:����ɾ��Ԫ��֮���Ԫ��ƽ�Ƶ���һ�����͵�λ��
   * Precondition��1��=givenPosition<=length;length�����Ա���ɾ��ǰ�ĳ��ȣ�*/

   private void removeGap(int index)

	{
		assert(index >=1)&&(index <length);
		
		int lastIndex = length -1;
	
		for (int removeIndex = index -1;index <lastIndex ;index++ )
		{
			elementData[index] = elementData[index-1];
		}
	}// end removeGap
	
	public int size(){
	
		return this.length;

	}
	
	public Iterator iterator(){
		
		return null;
	}

	

	
	
	private void doubleArray()
	{
		Object[] list = null;
		T[] oldList = (T[]) list;//����ָ�����Ա�Ԫ���������
		int oldSize = oldList.length;//������������󳤶�
		elementData = new Object[2 *oldSize];//�����鳤�ȼӱ�

		for (int index = 0;index<oldSize ;index++ )
		{
			list[index] = oldList[index];
		}//end doubleArray

	
}

	

	
	
}

