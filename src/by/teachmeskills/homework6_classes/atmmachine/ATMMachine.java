package by.teachmeskills.homework6_classes.atmmachine;

/*2. ATM machine
        ●	Создать класс, описывающий банкомат.
        ●	Набор купюр, находящихся в банкомате, должен задаваться тремя
        свойствами:
        ●	количеством купюр номиналом 20, 50 и 100.
        ●	Сделать метод для добавления денег в банкомат.

        ●	Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность выполнения операции. При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
        ●	Создать конструктор с тремя параметрами - количеством купюр каждого
        номинала.*/

public class ATMMachine {
    private int notesTwenty;
    private int notesFifty;
    private int notesHundred;

    public ATMMachine(int notesTwenty, int notesFifty, int notesHundred) {
        this.notesTwenty = notesTwenty;
        this.notesFifty = notesFifty;
        this.notesHundred = notesHundred;
    }

    public void addMoney(int twenty, int fifty, int hundred) {
        notesTwenty += twenty;
        notesFifty += fifty;
        notesHundred += hundred;
    }

    public boolean withdrawMoney(int amount) {
        boolean result = false;
        if (notesHundred * 100 + notesFifty * 50 + notesTwenty * 20 < amount) {
            System.out.println("There is not enough money");
        } else if (amount % 100 % 20 != 0 && amount % 50 % 20 != 0) {
            System.out.println("There are no suitable notes for this amount");
        } else {
            int counterForTwenty;
            int counterForHundred = 0;
            int counterForFifty = 0;
            while (amount >= 100 && notesHundred > 0) {
                amount -= 100;
                notesHundred--;
                counterForHundred++;
            }
            if (amount >= 50) {
                while (amount >= 50 && notesFifty > 0) {
                    amount -= 50;
                    notesFifty--;
                    counterForFifty++;
                }
            }
            counterForTwenty = amount / 20;
            notesTwenty -= counterForTwenty;
            if (amount % 20 == 0) {
                System.out.printf("Amount of 100 notes is %d, amount of 50 notes is %d, amount of 20 notes is %d\n", counterForHundred, counterForFifty, counterForTwenty);
                result = true;
            }
        }
        return result;
    }
}
