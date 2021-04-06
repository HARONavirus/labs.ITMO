import Abstraction.That;
import Objects.Cars;
import Objects.Money;
import Abstraction.Skirmish;
import Objects.Suitcase;
import Persons.*;


public class Main {
    public static void main(String[] args) {
        That that = new That("Это");
        Cars cars = new Cars("автомашин");
        Skirmish skirmish = new Skirmish("перестрелка");
        Bandits bandit = new Bandits("Бандит");
        Police police = new Police("полиция");
        Money money = new Money("денег");
        Suitcase suitcase = new Suitcase("чемодан");
        Robbers robbers = new Robbers("грабители");
        They they = new They("они");

        Location Street = Location.STREET;
        if (Street == Location.STREET) {
            that.didntHelp();
            cars.joined(cars.getName(),2);
            skirmish.started();
            bandit.succeeded();
            police.used(true);
            bandit.arrested();
            money.thereWasNo(true);
            cars.wasSearched(true);
        }
        Location PoliceDepartment = Location.POLICE_DEPARTMENT;
        if (PoliceDepartment == Location.POLICE_DEPARTMENT) {
            suitcase.wasGone();
            robbers.denied(true);
            they.didntSee();
            they.said(true);
            they.didntKnow(true);
            they.think();
        }
    }
}