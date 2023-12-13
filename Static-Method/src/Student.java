    public class Student {
        private int rollno;
        private String name;
        private static String college = "BBDIT";

        //Khởi tạo contructor
        Student(int r, String n) {
            rollno = r;
            name = n;
        }

        // Phương thức tĩnh để thay đổi biến tĩnh
        static void change() {
            college = "CODEGYM";
        }

        //Phương thức hiển thị giá trị
        void display() {
            System.out.println(rollno + " " + name + " " + college);
        }
    }