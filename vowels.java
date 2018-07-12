package edu;

public class vowels {
    public static void main(String... args) throws Exception {
        String str = "abracadabra";
        int vowelsCount = 0;
        char[] vowels = {'a', 'o', 'u', 'i', 'e'};
        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = 0; j <= vowels.length - 1; j++) {
                if (str.toLowerCase().charAt(i) == vowels[j]) {
                    vowelsCount += 1;
                }
            }
        }
        System.out.println(vowelsCount);
    }
}
