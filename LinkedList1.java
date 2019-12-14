package DataStruture;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;

public class Introduction {

    public static void main(String[] args) {
        LinkedList<String> courseName = new LinkedList<String>();

        courseName.add("Introduction to Software Engineering");
        courseName.add("Discrete Mathematics");
        courseName.add("Probability and Statistics");
        courseName.add("Data Structure and Algorithm");

        System.out.println(courseName);
        courseName.remove("Probability and Statistics");
        courseName.remove("Artificial Intelligence");
        System.out.println(courseName);
courseName.removeLast();
courseName.removeFirst();
        System.out.println(courseName);
        courseName.addFirst("Applied Data Science");
        courseName.addLast("Software Maintainance");
        courseName.add("Probability and Statistics");
        System.out.println(courseName);


        courseName.add(4,"Physics");
        System.out.println(courseName);

        System.out.println("LinkedList Size :"+courseName.size());
        for(int i=4;i>=3;i--){
            courseName.remove(i);
        }
        System.out.println(courseName);
        int i=1;
for(String system : courseName){

    System.out.print("Course No "+i+": ");
    System.out.println(system);
    i++;
}


    }
}
