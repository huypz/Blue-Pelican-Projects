import java.util.*;
import java.io.*;

public class ProjectL40 {
    public static void main(String[] args) {
        try {
            Scanner sf =  new Scanner(new File("C:\\Users\\hilic\\Documents\\IdeaProjects\\HpCodeWars\\Names_ages.txt"));
            //Count persons (lines)
            int numPersons = 0;
            while (sf.hasNextLine()) {
                numPersons++;
                sf.nextLine();
            }
            Person[] personsList = new Person[numPersons];
            sf = new Scanner(new File("C:\\Users\\hilic\\Documents\\IdeaProjects\\HpCodeWars\\Names_ages.txt"));
            int index = 0;
            while (sf.hasNextLine()) {
                String person = sf.nextLine();
                Scanner sc = new Scanner(person);
                sc.useDelimiter("\\s*\\d"); //Get name
                String name = sc.next();
                sc.useDelimiter("\\s+"); //Get age
                int age = sc.nextInt();
                personsList[index] = new Person(name, age);
                index++;
                sc.close();
            }
            sf.close();

            //Sort people
            Person.sort(personsList);
            for (Person p : personsList) {
                System.out.println(p);
            }
        }
        catch (IOException e) {
            System.out.println("IO ERROR: " + e);
        }
    }
}

class Person implements Comparable {
    private String name;
    private int age;

    public String getName() { return name; }
    public int getAge() { return age; }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;
    }

    public static Person[] sort(Person[] list) {
        Person min;
        int minIndex;
        for (int i = 0; i < list.length; i++) {
            min = list[i];
            minIndex = i;
            for (int k = i+1; k < list.length; k++) {
                if (list[k].compareTo(min) > 0) {
                    min = list[k];
                    minIndex = k;
                }
            }
            list[minIndex] = list[i]; //swap min with previous min
            list[i] =  min;
        }
        return list;
    }

    //Returns 1 (if this Person ascends), -1 (if this Person ascends), 0 (if equal)
    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        if (this.name.compareTo(p.name) < 0) {
            return 1;
        }
        else if (this.name.compareTo(p.name) > 0) {
            return -1;
        }
        else {
            if (this.age < p.age) {
                return 1;
            }
            else if (this.age > p.age) {
                return -1;
            }
            else {
                return 0;
            }
        }
    }
}