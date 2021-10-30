package Task12_15;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProgrammerBook programmerBook = (ProgrammerBook) o;
        return super.equals(o) && language.equals(programmerBook.language) && level == programmerBook.level;
    }

    public int hashCode() {
        return super.hashCode() + language.hashCode() / level;
    }

    public String toString() {
        return super.toString() + "; language: " + language + "; level: " + level;
    }

    public String getLanguage() {
        return language;
    }

    public int getLevel() {
        return level;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
