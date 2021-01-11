package chapter2.injection.dependency;

import java.util.Objects;

public class SpellChecker {
    private final Lexicon lexicon;

    //depency injection provides flexibility and testability
    public SpellChecker(Lexicon dictionary) {
        this.lexicon = Objects.requireNonNull(dictionary);
    }
}
