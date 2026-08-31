package school.model;

public class Grade {
    private double score;
    private LetterGrade letterGrade;

    public Grade(double score) {
        this.score = score;
        this.letterGrade = LetterGrade.calculateGrade(score);
    }

    public double getScore() { return score; }
    public LetterGrade getLetterGrade() { return letterGrade; }
    public double getGradePoint() { return letterGrade.getGradePoint(); }
    public String getRemarks() { return letterGrade.getRemarks(); }

    @Override
    public String toString() {
        return "Score: " + score + " | Grade: " + letterGrade + " | GP: " + getGradePoint() + " | " + getRemarks();
    }
}