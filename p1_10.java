public class p1_10 {

    p1_10(String a) {
        int l = a.length();
        char c[] = a.toCharArray();
        for (int i = 0; i < l; i++) {
            c[i] += 3;
            System.out.print(c[i] + " ");
        }
    }

}