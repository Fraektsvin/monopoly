public abstract class GroupOwnebleField extends OwnebleField {
    FieldGroup group;


    protected GroupOwnebleField(String name, int number, int price) {
        super(name, number, price);
    }

    abstract int getGroupRent(int groupCount);

    @Override
    public void consequense(Player poorPlayer) {

    }

    public int getRent() {
        if (this.isPawned()) {
            return 0;
        } else if (this.getOwner() == null) {
            return 0;
        } else {
            int numSame = 0;
            for (OwnebleField field : getOwner().getOwnsList()) {
                if (field.getClass().equals(this.getClass())) {
                    numSame++;
                }
            }
            // istedet for at vælge en enkelt værdig så laves der et index der tager udgangspunkt i nedenstående mateamtisk formel.
            return getGroupRent(numSame);
        }
    }
}

