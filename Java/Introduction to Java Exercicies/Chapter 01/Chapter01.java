public class Chapter01 {
    public static void main(String[] args) {
        /*
        //1.8: Write a program that displays the area and perimeter of a circle that has a radius of 6.5 using the following formula: p = 3.14159; perimeter = 2 * radius * p; area = radius * radius * p

        double radius = 6.5;
        double p = 3.14159;

        double perimeter = 2 * radius * p;
        double area = radius * radius * p;

        System.out.println(perimeter);
        System.out.println(area);
        */

        /*
        //*1.10: Assume that a runner runs 15 kilometers in 50 minutes and 30 seconds. Write a program that displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)
        double miles = 15/1.6;
        double time = (50.0/60) + (30.0/3600);
        double speed = miles/time;

        System.out.println(speed);
        */

        /*
        //1.11: The U.S. Census Bureau projects population based on the following assumptions: - One birth every 7 seconds; - One death every 13 seconds; - One new immigrant every 45 seconds; Write a program to display the population for each of the next five years. Assume that the current population is 312,032,486, and one year has 365 days. Hint: In Java, if two integers perform division, the result is an integer. The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with the fractional part, one of the values involved in the division must be a number with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5

        int current_population = 312032486;

        int secondsInYear = 365 * 24 * 60 * 60;
        int birth_by_year = secondsInYear/7;
        int death_by_year = secondsInYear/13;
        int immigrant_by_year = secondsInYear/45;

        for(int x = 0; x < 5; x++){
            current_population = current_population + (birth_by_year + immigrant_by_year - death_by_year);
            System.out.println("Current population: " + current_population);
        }
        */

        /*
        //1.12: Assume that a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write a program that displays the average speed in kilometers per hour. (Note 1 mile is equal to 1.6 kilometer.)
        double kilometers = 24 * 1.6;
        double hours = 1 + (40.0/60) + (35.0/3600);
        double speed2 = kilometers/hours;

        System.out.println("Average speed in kilometers per hour: " + speed2);
        */

    }
}