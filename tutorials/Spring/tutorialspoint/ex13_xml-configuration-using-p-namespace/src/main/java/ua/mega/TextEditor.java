package ua.mega;

public class TextEditor {
    private SpellChecker spellChecker;
    private String textName;
    private int testPages;

    public void setTextName(String textName) {
        this.textName = textName;
    }

    public void setTestPages(int testPages) {
        this.testPages = testPages;
    }

    public String getTextName() {
        return textName;
    }

    public int getTestPages() {
        return testPages;
    }

    // a setter method to inject the dependency.
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker." );
        this.spellChecker = spellChecker;
    }
    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
        System.out.println(textName);
        System.out.println(testPages);
    }
}
