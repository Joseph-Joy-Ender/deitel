package chapter8;

public enum Book {
    JHTP("Java how to program", "2018", "Dietel"),
    CHTP("C How to program", "2016", "Kent Beck"),
    IW3HTP("Internet & world wide web how to program", "2012", "Joseph"),
    VBHTP("Visual basic How to program", "2014", "Joy"),
    CSHARPHTP("Visual C# How to program", "2017", "Ender");
    private final String title;
    private final String copyrightYear;
    private final String owner;
    Book(String title, String copyrightYear, String owner){
        this.title = title;
        this.copyrightYear = copyrightYear;
        this.owner = owner;
    }

    public String returnTitle() {
        return title;
    }

    public String returnCopyrightYear() {
        return copyrightYear;
    }

    public String getOwner() {
        return owner;
    }

}
