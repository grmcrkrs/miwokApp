public class ReportCard {
    private int engGrade;
    private int hisGrade;
    private int mathGrade;
    private int compGrade;
    private int sciGrade;

    @Override
    public String toString() {
        return "ReportCard{" +
                "English Grade=" + engGrade +
                ", History Grade=" + hisGrade +
                ", Math Grade=" + mathGrade +
                ", Computer Grade=" + compGrade +
                ", Science Grade=" + sciGrade +
                '}';
    }

    public int getEngGrade() {
        return engGrade;
    }

    public void setEngGrade(int engGrade) {
        this.engGrade = engGrade;
    }

    public int getHisGrade() {
        return hisGrade;
    }

    public void setHisGrade(int hisGrade) {
        this.hisGrade = hisGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getCompGrade() {
        return compGrade;
    }

    public void setCompGrade(int compGrade) {
        this.compGrade = compGrade;
    }

    public int getSciGrade() {
        return sciGrade;
    }

    public void setSciGrade(int sciGrade) {
        this.sciGrade = sciGrade;
    }
}

