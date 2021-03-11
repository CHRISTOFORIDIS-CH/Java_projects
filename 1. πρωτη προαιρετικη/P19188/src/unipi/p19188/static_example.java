package unipi.p19188;

 class static_example {
private String first_name ;
private String last_name;
static int lab_members = 0;  //οταν αλλαζει αυτη η μεταβλητη αλλαζει για ολα τα αντικειμενα αν δεν ηταν static τοτε ο μετρητης καθως εβαζα ατομα θα πηγαινε μονιμα απο το 0 στο 1 και ξανα
public static_example (String fn,String ln){   //constructor που βάζει άτομα στο εργαστήριο
 first_name = fn;
 last_name = ln;
lab_members = lab_members + 1;
System.out.printf("New member is:,%s %sAnd all the members are: %d\n",first_name,last_name,lab_members); // αυτο το εψαξα online γιατι με τα ονοματα των μεταβλητων(System.out.println(...)) δεν εβγαινε

}
public static void lab_name(){
 System.out.println(" The name of the lab is: java lab");
 }

}
