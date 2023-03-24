package task2;


public class Main {
    public static void main(String[] args) {
        Phonebook myPhonebook = new Phonebook();
        myPhonebook.add("Alex Tvorogov", 123456789, 987654321, 123454321);
        myPhonebook.add("Masha Perepelkina",420874321,222222222 );
        myPhonebook.add("Alex Tvorogov", 333333333, 444444444);
        myPhonebook.add("Alex Tvorogov", 555555555, 666666666);
        myPhonebook.add("Alex Tvorogov", 777777777, 888888888);

        System.out.print("Find Masha Perepelkina in myPhonebook: ");
        System.out.println(myPhonebook.find("Masha Perepelkina"));

        System.out.print("Find Ivan Podbitui in myPhonebook: ");
        System.out.println(myPhonebook.find("Ivan Podbitui")); //null

        System.out.print("Find Mursik Murzikov in myPhonebook: ");
        System.out.println(myPhonebook.find("Mursik Murzikov"));

        System.out.print("FindAll Alex Tvorogov, Masha Perepelkina, Mursik Murzikov in myPhonebook: ");
        System.out.println(myPhonebook.findAll("Alex Tvorogov", "Masha Perepelkina", "Ivan Podbitui")); //null

        System.out.print("FindAll Mursik Murzikov, Prosto Gavrila, Ivan Podbitui in myPhonebook: ");
        System.out.println(myPhonebook.findAll("Mursik Murzikov", "Prosto Gavrila", "Ivan Podbitui"));

        System.out.print("FindAll Prosto Gavrila in myPhonebook: ");
        System.out.println(myPhonebook.findAll("Prosto Gavrila"));

    }
}
