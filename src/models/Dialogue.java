package models;

public class Dialogue {
    private int id;
    private Speaker[] speakers;
    private Decision decision;
    private boolean hasDecision = false;

    // id is in the order of room, grade(0-3),before/after(0,1), convo#(0,9)
    public Dialogue(Speaker[] speakers, int id) {
        this.speakers = speakers;
        this.id = id;
    }
    public Dialogue(Speaker[] speakers, int id, Decision decision) {
        this(speakers, id);
        hasDecision = true;
        this.decision = decision;
    }

}
