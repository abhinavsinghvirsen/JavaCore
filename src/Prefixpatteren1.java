/*{3,7,2,5,8}
result={3,10,12,17,25}*/

public class Prefixpatteren1 {
    public static void main(String[] args) {
        int arr[]={3,7,2,5,8};
        int value=0;
        for(int i=0;i<arr.length;i++){
            value=value+arr[i];
            System.out.println(value);

        }
    }
}
