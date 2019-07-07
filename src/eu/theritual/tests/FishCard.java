package eu.theritual.tests;

public class FishCard {
    private final CognitusTypes.Cards type;
    private final String id;
    private final FishCardSide sideA;
    private final FishCardSide sideB;
    private final FishCardSide sideC;

    FishCard(FishCardSide sideA, FishCardSide sideB, FishCardSide sideC, String id) {
        this.type = CognitusTypes.Cards.THREE_SIDES;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.id = id;
    }

    FishCard(FishCardSide sideA, FishCardSide sideB, String id) {
        this.type = CognitusTypes.Cards.TWO_SIDES;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = null;
        this.id = id;
    }
}
