package Persons;

import Moves.MovesInPolice;

public class They extends Person implements MovesInPolice {
    public They(String name) {
        super(name);
    }
    public void didntSee() {
        System.out.print("утверждая, что никакого чемодана " + getName() + " не видели, никакого банка не грабили и не думали даже грабить. ");
    }

    public void said(boolean police) {
        if (police){
            System.out.print("На вопрос полицейского комиссара Пшигля, зачем им понадобилось, в таком\nслучае, стрелять по полицейским машинам, " + getName() + " сказали, ");
        } else {
            System.out.print("На вопрос милицейского комиссара Пшигля, зачем им понадобилось, в таком\nслучае, стрелять по милицейским машинам, " + getName() + " сказали, ");
        }
    }

    public void didntKnow(boolean police) {
        if(police){
            System.out.print("будто не знали, что их приследуют полицейские, ");
        }
        else{
            System.out.print("будто не знали, что их приследуют милицейские, ");
        }
    }

    public void think() {
        System.out.print("а, наоборот, думали, что за ними гонятся бандиты.");
    }
}