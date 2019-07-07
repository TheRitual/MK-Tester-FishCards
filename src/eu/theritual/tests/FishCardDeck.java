package eu.theritual.tests;

import java.util.List;

public class FishCardDeck {
    private final String version;   // 1.A.C : A - amount of Cards, C - Amount of changes (in general)
    private final String name;
    private final List<FishCard> cards;

    FishCardDeck(String name, String version, List<FishCard> cards){
        this.name = name;
        this.version = version;
        this.cards = cards;
    }
}
