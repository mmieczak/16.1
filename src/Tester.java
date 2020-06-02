import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Tester {

    public static void main(String[] args) {

        String userValue = Utilities.readFromUser();

        Optional<Season> season = Utilities.getSeason(userValue);

        Utilities.listMonthsForSeason(season);

    }
}
