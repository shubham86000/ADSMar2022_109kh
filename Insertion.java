// Insertion
/*class Insertion
{
	public static void Insertion(int arr[])
	{
		int a = arr.length;
		for(int j=1; j<a;j++){
			int b =arr[j];
			int k = j-1;
			while((k>-1)&&(arr[k]>b)){
				arr[k+1]=arr[k];
				k--;
			}
			arr[k+1] = b;
		}
	}
	public static void main(String args[])
	{
		int arr[] = {1,2,4,5,3};
		System.out.println("Before Sorting...");
        for(int Z : arr){
			System.out.print(Z+" ");
		}
		System.out.println();
		Insertion(arr);
		System.out.println("After sorting...");
		for(int Z : arr){
			System.out.print(Z+" ");
		}
	}
}
*/
class Insertion
{
	 static void Insert(int arr[])
	{
		int low=0;
		int high = arr.length-1;
		int temp = arr[high];
		for(int i = arr.length-2;j>=low;i--){
			if(temp<arr[i]){
				int j=i;
				j==;
				arr[j] = arr[i];
				display(arr);
			}
			else{
				if(arr[i]<temp;
			}
			display(arr);
			break;
		}
	}
}
static void display(int arr[]){
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
public static void main(String args []){
	int arr[]={2,44,6,8,3};
	sort(arr);
}

