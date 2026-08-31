package school.model;

public enum StudentLevel {
    ND1("National Diploma 1"),
    ND2("National Diploma 2"),
    HND1("Higher National Diploma 1"),
    HND2("Higher National Diploma 2"),
    LEVEL_100("100 Level"),
    LEVEL_200("200 Level"),
    LEVEL_300("300 Level"),
    LEVEL_400("400 Level");

    private final String description;

    StudentLevel(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static StudentLevel fromString(String text) {
        if (text == null) return LEVEL_100;
        for (StudentLevel l : StudentLevel.values()) {
            if (l.name().equalsIgnoreCase(text.trim()) || l.getDescription().equalsIgnoreCase(text.trim())) {
                return l;
            }
        }
        return LEVEL_100;
    }
}