package single_responsibility.good;

public class Test {
    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.addJournal("I am bored now :(");
        journal.addJournal("I feel to have a cup of coffee !!! ");
        System.out.println(journal);

        Persistence persistence = new Persistence(journal.toString());
        persistence.saveFile("Text1.txt");
    }
}
