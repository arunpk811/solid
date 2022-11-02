package single_responsibility.bad;

public class Test {
    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.addJournal("I am bored now :(");
        journal.addJournal("I feel to have a cup of coffee !!! ");
        System.out.println(journal);

        journal.saveJournal("test.txt");
    }
}
