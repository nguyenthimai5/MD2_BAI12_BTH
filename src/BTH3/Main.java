package BTH3;

import BTH1.Student1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class Main {

        public void main(String[] args) {

            Student student = new Student("kien",26,"Hn");
            Student student1 = new Student("Nam", 26, "HN");
            Student student2 = new Student("Anh", 38, "HT");
            Student student3 = new Student("Tung", 38, "HT");

            List<Student> lists = new ArrayList<Student>();
            lists.add(student);
            lists.add(student1);
            lists.add(student2);
            lists.add(student3);
            for (Student st : lists) {
                System.out.println(st.toString());
            }

            AgeComparator ageComparator = new AgeComparator();
            Collections.sort(lists, ageComparator);
            System.out.println("So sanh theo tuoi:");
            for (Student st : lists) {
                System.out.println(st.toString());
            }
        }

        public class AgeComparator implements Comparator<BTH3.Student> {

            @Override
            public int compare(BTH3.Student o1, BTH3.Student o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge().equals(o2.getAge())) {
                    return 0;
                } else {
                    return -1;
                }
            }
        }

    }
