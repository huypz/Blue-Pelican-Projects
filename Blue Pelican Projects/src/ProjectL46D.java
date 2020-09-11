import java.util.*;
import java.io.*;

public class ProjectL46D {
    public static void main(String[] args) {
        try {
            Scanner sf = new Scanner(new File("C:\\Users\\hilic\\Documents\\IdeaProjects\\HpCodeWars\\ProjectL46D.txt"));
            Scanner sc;

            Map students = new TreeMap();
            Set freshmen = new TreeSet();
            Set sophomore = new TreeSet();
            Set junior = new TreeSet();
            Set senior = new TreeSet();

            while (sf.hasNext()) {
                String studentData = sf.nextLine();
                sc = new Scanner(studentData);
                while (sc.hasNext()) {
                    String studentClass = sc.next();
                    String studentName = sc.next();
                    if (students.containsKey(studentClass)) {
                        switch (studentClass) {
                            case "Freshman":
                                freshmen.add(studentName);
                                break;
                            case "Sophomore":
                                sophomore.add(studentName);
                                break;
                            case "Junior":
                                junior.add(studentName);
                                break;
                            case "Senior":
                                senior.add(studentName);
                                break;
                        }
                    }
                    else {
                        switch (studentClass) {
                            case "Freshman":
                                students.put(studentClass, freshmen);
                                freshmen.add(studentName);
                                break;
                            case "Sophomore":
                                students.put(studentClass, sophomore);
                                sophomore.add(studentName);
                                break;
                            case "Junior":
                                students.put(studentClass, junior);
                                junior.add(studentName);
                                break;
                            case "Senior":
                                students.put(studentClass, senior);
                                senior.add(studentName);
                                break;
                        }
                    }
                }
                sc.close();
            }

            Set studentsSet = students.keySet();
            Iterator iter = studentsSet.iterator();

            while (iter.hasNext()) {
                Object key = iter.next();
                Set value = (TreeSet) students.get(key);
                System.out.printf("%s %s%n", (String) key, value);
            }

            sf.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

