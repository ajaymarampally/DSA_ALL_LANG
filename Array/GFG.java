class GFG{

	static class pair{
		int min;
		int max;
	}

	public static void main(String[] args){
		int arr[] = new int[5];
		fill(arr);
		printarr(arr);
		//printarr(reverse(arr));
		pair res = minmax(arr);
		System.out.print(res);
	}
	public static int[] reverse(int arr1[]){
		int temp;
		int start = 0;
		int end = (arr1.length) -1;
		while(start<end){
			temp = arr1[start];
			arr1[start]=arr1[end];
			start++;
			end--;
		}
		return arr1;
	}
	static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void fill(int arr[]){
		int len = arr.length;
		for(int i=0;i<len;i++){
			arr[i] = i;
			i++;
			System.out.println(arr);
		}
	}
	static pair minmax(int arr[]){

		pair mmax = new pair();
		int max = mmax.max;
		int min = mmax.min;
		if(arr.length==1){
			max = min = arr[0];
		}
		if(arr[0]>arr[1]){
			max = arr[0];
			min = arr[1];
		}
		else{
			max =arr[1];
			min = arr[0];
		}
		for(int i=2;i<arr.length;i++){
			if (arr[i]>max){
				max = arr[i];
				continue;
			}
			else if(arr[i]<min){
				min = arr[i];
			}	
			}
			return mmax;
		}
	}

