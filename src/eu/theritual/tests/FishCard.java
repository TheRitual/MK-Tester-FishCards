package eu.theritual.tests;

import javax.smartcardio.Card;

public class FishCard {
    private final CognitusTypes.Cards type;
    private final FishCardSide sideA;
    private final FishCardSide sideB;
    private final FishCardSide sideC;

    FishCard(FishCardSide sideA, FishCardSide sideB, FishCardSide sideC) {
        this.type = CognitusTypes.Cards.THREE_SIDES;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    FishCard(FishCardSide sideA, FishCardSide sideB) {
        this.type = CognitusTypes.Cards.TWO_SIDES;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = null;
    }
}
