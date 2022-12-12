package problems.p1400_1500.p1491_average_salary_excluding_the_minimum_and_maximum_salary;

class Solution {
    public double average(int[] salary) {
        double r = 0;
        int sum = 0;
        int min = salary[0];
        int max = salary[0];
        for (int j : salary) {
            sum += j;
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;
            }
        }
        r = (double) (sum - min - max) / (salary.length - 2);

        return r;
    }
}
