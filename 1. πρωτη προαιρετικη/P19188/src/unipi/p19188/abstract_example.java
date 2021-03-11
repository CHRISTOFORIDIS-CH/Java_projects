package unipi.p19188;


 abstract class abstract_example {      //αυτή η τάξη και η υποτάξη της είναι υπευθυνη να ενημερώνει τον καθηγητη για το βαθμο του φοιτητη στο μαθημα οταν καλειται απο την main
    protected  double grade = 8 ;

     abstract  double learn_grades();
}

 class grades_info extends abstract_example{
     @Override    //δηλώνοντας την learn_grades στην πάνω πρέπει να τo γράψω εδώ ή σε άλλη υποτάξη
     double learn_grades() {
         return grade;
     }
 }