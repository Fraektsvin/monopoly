public class SodaField extends GroupOwnebleField {
    int rent = 200;


    protected SodaField(String name, int number, int price) {
        super(name, number, price);
    }

    @Override
    int getGroupRent(int groupCount) {
        return rent*Matador.dice.lastThrow()*groupCount;
    }
}
