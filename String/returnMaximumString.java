package String;
public class returnMaximumString {
    public static void main(String[] args) {
        String[] arr = {"999", "998", "997", "996", "995", "994", "993", "992", "991", "990"};  // string array
        int mx = Integer.parseInt(arr[0]);{
            for(int i= 1;i<arr.length;i++){
                int n = Integer.parseInt(arr[i]);  // convert in integer from string
                mx = Math.max(mx,n);
            }
            System.out.println(mx);
        }
    }
}
