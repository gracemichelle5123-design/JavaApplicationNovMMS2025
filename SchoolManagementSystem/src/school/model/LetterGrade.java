package school.model;

public enum LetterGrade {
    A(70, 100, 5.0, "Excellent"),
    B(60, 69.99, 4.0, "Very Good"),
    C(50, 59.99, 3.0, "Good"),
    D(45, 49.99, 2.0, "Fair"),
    E(40, 44.99, 1.0, "Pass"),
    F(0, 39.99, 0.0, "Fail");

    private final double minScore;
    private final double maxScore;
    private final double gradePoint;
    private final String remarks;

    LetterGrade(double minScore, double maxScore, double gradePoint, String remarks) {
        this.minScore = minScore;
        this.maxScore = maxScore;
        this.gradePoint = gradePoint;
        this.remarks = remarks;
    }

    public double getMinScore() { return minScore; }
    public double getMaxScore() { return maxScore; }
    public double getGradePoint() { return gradePoint; }
    public String getRemarks() { return remarks; }

    public static LetterGrade calculateGrade(double score) {
        if (score >= 70.0) return A;
        if (score >= 60.0) return B;
        if (score >= 50.0) return C;
        if (score >= 45.0) return D;
        if (score >= 40.0) return E;
        return F;
    }
}