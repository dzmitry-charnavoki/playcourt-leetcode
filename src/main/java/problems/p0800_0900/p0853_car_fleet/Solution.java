package problems.p0800_0900.p0853_car_fleet;

import java.util.Arrays;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int ans = 0;
        Car[] cars = new Car[position.length];
        for (int i = 0; i < position.length; i++) {
            cars[i] = new Car(position[i], (double) (target - position[i]) / speed[i]);
        }
        Arrays.sort(cars, (c1, c2) -> c2.pos - c1.pos);

        double maxTime = 0;

        for (Car car : cars) {
            if (car.time > maxTime) {
                maxTime = car.time;
                ++ans;
            }
        }

        return ans;
    }

    static class Car {
        public int pos;
        public double time;

        public Car(int pos, double time) {
            this.pos = pos;
            this.time = time;
        }
    }
}

