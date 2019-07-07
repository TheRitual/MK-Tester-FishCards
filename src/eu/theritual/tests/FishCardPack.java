package eu.theritual.tests;

import java.util.List;

public class FishCardPack {
    private final List<FishCardDeck> decks;
    private final String name;
    private final String version; // X.A.C : X - version (10 > Alpha 0, 20 > Beta 0, 20 < version 1,  A - amount of Decks, C - Amount of changes (in general)

    FishCardPack (String name, String version, List<FishCardDeck> decks) {
        this.name = name;
        this.version = version;
        this.decks = decks;
    }
}
