
```shell
 public String countAndSay(int n) {
        String result = "1";
        StringBuffer sb = new StringBuffer();

        while (--n > 0) {
            System.out.println("--"+result);
            int count = 0;
            char digit = result.charAt(0);
            for (int i=0;i<result.length();i++) {
                if (digit == result.charAt(i)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(digit);
                    digit = result.charAt(i);
                    count = 1;
                }
            }

            sb.append(count);
            sb.append(digit);

            result = sb.toString();
            sb.delete(0, sb.length());
        }

        return result;
    }
```