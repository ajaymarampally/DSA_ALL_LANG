public class neg{
    public static void repl(int arr[]){
        int j = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    static int[] fill(int arr[]){
        for(int i=0;i<arr.length;i++){
            int myRandomLong = (int)(Math.random() * 500 * (Math.random() > 0.5 ? 1 : -1));
            arr[i]=myRandomLong;
        }
        return arr;
    }
    static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
    public static void main(String[] args) {
        int arr[] = new int[20];
        fill(arr);
        printarr(arr);
        repl(arr);
        printarr(arr);
    }
}