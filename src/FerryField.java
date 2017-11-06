
public class FerryField extends GroupOwnebleField {
    private int[] rent = {500, 1000, 2000, 4000};

    protected FerryField(String name, int number, int price) {
        super(name, number, price);
    }

    @Override
    int getGroupRent(int groupCount) {
        return rent[groupCount-1];
    }

    @Override
    public void consequense(Player poorPlayer) {
        if (this.getOwner() != null && poorPlayer != getOwner()) {
            getGroupRent(this.getOwner().getFerryList());
        }
    }
}


