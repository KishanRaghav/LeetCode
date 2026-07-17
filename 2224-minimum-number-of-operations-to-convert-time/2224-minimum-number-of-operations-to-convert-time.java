class Solution {

    public int convertTime(String current, String correct) {

        int currentMinutes = getMinutes(current);
        int correctMinutes = getMinutes(correct);

        int difference = correctMinutes - currentMinutes;

        int operations = 0;

        int[] values = {60, 15, 5, 1};

        for (int value : values) {
            operations += difference / value;
            difference %= value;
        }

        return operations;
    }

    private int getMinutes(String time) {

        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3));

        return hours * 60 + minutes;
    }
}