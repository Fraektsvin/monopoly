public class ExtendableField extends OwnebleField {
    int houses;
    boolean hotel;
    int rent;
    int rentPerHouse;
    int houseCost;


    /*
    implementeret variabler således at antallet af huse samt hoteler bliver sat op, derudover skal der vides hvor meget det koster at lande på feltet
    og hvor det vil koste at lande på felterne med huse.
     */
    protected ExtendableField(String name, int number, int price, int rent, int rentPerHouse, int houseCost) {
        super(name, number, price);
        this.hotel = false;
        this.houses = 0;
        this.rent = rent;
        this.rentPerHouse = rentPerHouse;
        this.houseCost = houseCost;
    }

    public boolean hasHotel() {
        return hotel;
    }

    public void buyHouse() {
        if (this.getOwner()== null) {
            System.out.println( "Du skal eje " + this.getName() + " før du kan købe huse");
            return;
        }
        if (isPawned()) {
            System.out.println("Du kan ikke købe et hus hvis grunden er pantsat");
            return;
        }
        if (this.getOwner().getMoney() < houseCost){
            System.out.println("Du har ikke nok penge til at købe denne grund");
            return;
        }
        if (this.hasHotel()) {
            System.out.println("Du kan ikke købe flere huse på denne grund");
            return;
        }
        this.houses++;
        this.getOwner().pay(houseCost);
        if (this.houses >= 5 ){
            hotel = true;
            houses = 0;
        }
    }
    /*
    Hvis ejeren er != null så er der en ejer af grunden og dermed skal der betales.
     */
    @Override
    public void consequense(Player poorPlayer) {
        if (this.getOwner()!= null) {
            int totaltCost = this.rent + rentPerHouse * houses;
            poorPlayer.pay(totaltCost);
        }
    }
}
