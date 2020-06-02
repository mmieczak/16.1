import java.util.Optional;

public enum Season {
    SPRING("wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("lato", new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("jesień", new String[]{"wrzesień", "październik", "listopad"}),
    WINTER("zima", new String[]{"grudzień", "styczeń", "luty"});

    private String description;
    private String[] months;

    Season(String description, String[] months) {
        this.description = description;
        this.months = months;
    }

    public String getDescription() {
        return description;
    }

    public String[] getMonths() {
        return months;
    }

    public static Season[] getValues(){
        return values();
    }
}
