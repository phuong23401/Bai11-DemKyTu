public class CharacterCount {
    public static void characterCount(String str) {
        int [] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        int [] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == arr[j]){
                    flag++;
                }
            }
            if (flag == 1) {
                System.out.println("Số lần xuất hiện của " + str.charAt(i) + " trong chuỗi: " + count[str.charAt(i)]);
            }
        }
    }
}
