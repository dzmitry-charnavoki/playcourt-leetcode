package problems.p1400_1500.p1491_average_salary_excluding_the_minimum_and_maximum_salary;

import java.util.Arrays;

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double r = 0;
        int sum = 0;
        int min = salary[0];
        int max = salary[0];
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
            if (min > salary[i]) {
                min = salary[i];
            }
            if (max < salary[i]) {
                max = salary[i];
            }
        }
        r = (sum - min - max) / (salary.length - 2);

        return r;
    }
}
