package unipi.p19188;

 final class final_exapmle {
   public class final_example implements students_info{
        @Override
        public String give_Name() {
            final String name = "CHARALAMPOS CHRISTOFORIDIS";  //βάζω όλες τις μεταβλητές final γιατί δεν θέλω ποτέ να αλλάξουν τα στοιχεία του φοιτητή
            return name;
        }

        @Override
        public int give_age() {
            final int age = 18;
            return age;
        }

        @Override
        public String give_address() {
            final String address = "Athens";
            return address;
        }

    }
}
