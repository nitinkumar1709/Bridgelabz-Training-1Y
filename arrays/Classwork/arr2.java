import java.util.*;
class arr2
{
	public static void main(String[] args)
	{
		int arr2[][] ={{1,2,3},{4,5,6},{7,8,9}};
		
		int rows = arr2.length;
		int col = arr2[0].length;
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++){
				System.out.print(arr2[i][j]+" ");
		}
		System.out.println();
	}
}
}