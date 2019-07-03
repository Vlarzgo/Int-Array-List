public class Main {

    public static void main(String[] args) {

        IntList myList = new IntArrayList();

        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        System.out.println("Add \n" + myList);

        myList.add(3, 55);
        System.out.println("Add 55 at index 3 \n" + myList);

        myList.clear();
        System.out.println("Clear \n" + myList);

        System.out.println("Is Empty\n" + myList.isEmpty());

        myList.add(7);
        myList.add(7);
        myList.add(7);
        myList.add(7);
        myList.add(7);
        myList.add(6);
        myList.add(5);
        myList.add(8);
        myList.add(7);
        myList.add(7);
        myList.add(5);
        myList.add(1);
        myList.add(7);
        myList.add(9);

        System.out.println("New Arr\n" + myList);

        System.out.println("Sub List from 4 to 12\n" + myList.subList(4, 12));

        myList.set(4, 55);
        System.out.println("Set 55 at index 4\n" + myList);

        myList.removeByValue(5);
        System.out.println("Remove by value 5\n" + myList);

        myList.removeAllValue(7);
        System.out.println("Remove All Value 7\n" + myList);

        myList.remove(2);
        System.out.println("Remove 2\n" + myList);

        System.out.println("Get 4\n" + myList.get(4));

        System.out.println("Size\n" + myList.size());
    }

}
