class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int balance = 0;
        int start = 0;

        // First pass: check whether the journey is possible
        for (int i = 0; i < gas.length; i++) {
            balance += gas[i] - cost[i];
        }

        if (balance < 0) {
            return -1;
        }

        // Second pass: find the starting station
        balance = 0;

        for (int i = 0; i < gas.length; i++) {
            balance += gas[i] - cost[i];

            if (balance < 0) {
                start = i + 1;
                balance = 0;
            }
        }

        return start;
    }
}