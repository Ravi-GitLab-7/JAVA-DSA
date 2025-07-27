package String;
public class returnMinimumString {
    public static void main(String[] args) {
        String[] arr = {"999", "998", "997", "-996", "995", "994", "993", "992", "991", "990"};  // string array
        int min = Integer.parseInt(arr[0]);{
            for (int i = 1; i < arr.length ; i++) {
                int n = Integer.parseInt(arr[i]);
                min = Math.min(min,n);
            }
            System.out.println(min);
        }
    }
}
