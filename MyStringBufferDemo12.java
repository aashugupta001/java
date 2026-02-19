import java.util.Scanner;

class MyStringBuffer {
    StringBuffer sb;

    MyStringBuffer(String s) {
        sb = new StringBuffer(s);
    }

    void reverse() {
        System.out.println("Reversed: " + sb.reverse());
    }

    void insert() {
        sb.insert(1, "X");
        System.out.println("After Insert: " + sb);
    }

    void delete() {
        if(sb.length()>2)
            sb.delete(1, 3);
        System.out.println("After Delete: " + sb);
    }

    void append() {
        sb.append("END");
        System.out.println("After Append: " + sb);
    }
}

public class MyStringBufferDemo12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        MyStringBuffer obj = new MyStringBuffer(sc.nextLine());

        int ch;
        do {
            System.out.println("\n1.Reverse 2.Insert 3.Delete 4.Append 5.Exit");
            ch = sc.nextInt();

            switch(ch) {
                case 1: obj.reverse(); break;
                case 2: obj.insert(); break;
                case 3: obj.delete(); break;
                case 4: obj.append(); break;
            }
        } while(ch!=5);

        sc.close();
    }
}
