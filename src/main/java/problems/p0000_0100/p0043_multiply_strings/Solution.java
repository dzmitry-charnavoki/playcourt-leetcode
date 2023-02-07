package problems.p0000_0100.p0043_multiply_strings;

class Solution {
    public String multiply(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int[] digits = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            final int digit1 = (num1.charAt(i) - '0');
            for (int j = num2.length() - 1; j >= 0; j--) {
                final int digit2 = (num2.charAt(j) - '0');
                final int multiply = digit1 * digit2;
                int sum = multiply + digits[i + j + 1];
                digits[i + j] += sum / 10;
                digits[i + j + 1] = sum % 10;
            }
        }

        for (int i : digits) {
            if (i > 0 || sb.length() > 0) {
                sb.append(i);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

}
