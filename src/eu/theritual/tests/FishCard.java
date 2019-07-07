package eu.theritual.tests;

import javax.smartcardio.Card;

public class FishCard {
    private final CognitusTypes.Cards type;
    private final  String sideA;
    private final String sideB;
    private final String sideC;

    FishCard(String sideA, String sideB, String sideC) {
        this.type = CognitusTypes.Cards.THREE_SIDES;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    FishCard(String sideA, String sideB) {
        this.type = CognitusTypes.Cards.TWO_SIDES;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = null;
    }
}
