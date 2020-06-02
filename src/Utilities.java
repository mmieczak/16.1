import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;

public class Utilities {

    public static String readFromUser(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void showSeasonMonths(Season season){
        System.out.println("Months that are assigned to that season are:");
        System.out.println(Arrays.toString(season.getMonths()));
    }

    public static Optional<Season> getSeason(String userInput) {
        Season[] seasons = Season.getValues();
        for (Season season : seasons) {
            if (season.getDescription().equalsIgnoreCase(userInput))
                return Optional.of(season);
        }
        return Optional.empty();
    }

    public static void listMonthsForSeason(Optional<Season> season){
        try {
            if (season.isPresent()) {
                Utilities.showSeasonMonths(season.get());
            } else
                throw new NoSuchElementException("Season value out of collection");
        } catch (NoSuchElementException ex) {
            System.out.println("Incorrect value. Possible options are: " + Arrays.toString(Season.getValues()));
        }
    }
}
