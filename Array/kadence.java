class kadence {
    static void fillarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            int rand = (int)(Math.random()*500*(Math.random()>0.5?1:-1));
            arr[i] = rand;
        }
    }
    static int maxsum(int arr[]){
        int m1 = 0 , m2 = 0;
        for(int c=0;c<arr.length;c++){
            m1 = m1+arr[c];
            if(m2<m1){
                m2 = m1;
            }
            if(m1<0){
                m1 = 0;
            }

        }
        return m2;
    }
    static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[20];
        fillarr(arr);
        printarr(arr);
        int max = maxsum(arr);
        System.out.println(max);
        neg.printarr(arr);
    }
}
