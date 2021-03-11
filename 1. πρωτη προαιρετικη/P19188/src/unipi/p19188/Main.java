package unipi.p19188;    //και οι κλασεις και το interface ειναι ολα default για να εχεις access μονο μεσα στο package unipi.p191888

public class Main {
    static public void main(String args[]) {   //παραλλαγες το static public αντι για public static και το String args[] αντι για String[] args
        grades_info grade = new grades_info();
        System.out.println(grade.learn_grades()); //oυσιαστικα η learn_grade ειναι σαν getter
        /*εδω ηθελα να φτιαξω ενα αντικειμενο που κανει impliment την students info δοκίμασα τα εξεις αλλα κανενα δεν δουλευει:
        *πρώτο:
        * students_info get = new final_example();
        * get.give_address κ.λ.π
        *
        * δεύτερο:
        * final_example get = new final_example();
        * students_info get;
        * get.give_address κ.λ.π
        *
        *(σε ολα μου βγαζει error)
         */
    static_example student_1 = new static_example("charis","christoforidis"); //μαθητες που βαζω στο εργαστηριο
    static_example student_2 = new static_example("giorgos","papadopoulos");
    static_example.lab_name(); // αφου η μεθοδος αυτη ειναι static μπορω να την χρησιμοποιησω χωρις να χρειαζεται η δημιουργια αντικειμενου
        }

    }


