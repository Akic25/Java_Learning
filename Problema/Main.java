public class Main{
    public static void main(String[] args){
        Student s1 = new Student("George Ionescu","Stefan cel Mare nr3");
        Materie mate = new Materie("Matematica",6);
        Materie oop = new Materie("OOP",5);
        Materie rust = new Materie("Rust",4);
        s1.addCourseGrade(mate,9);
        s1.addCourseGrade(oop,4);
        s1.addCourseGrade(rust,8);
        s1.printGrades();
        System.out.println("Media este " + s1.getAverageGrade());
        if(s1.esteBursier())
            System.out.println(s1.getName() + " este bursier");
       else System.out.println(s1.getName() + " nu este bursier.");

      if( s1.aPromovat(oop))
          System.out.println(s1.getName() + "a promovat materia " + oop.getName());
      else
          System.out.println(s1.getName() + "nu a promovat materia" + oop.getName());


      Teacher t1 = new Teacher("Marian Popescu", "Traian nr6");
      System.out.println(t1);
      Materie logica = new Materie("Logica", 6);
      Materie fai = new Materie ("FAI", 5);
      Materie acso = new Materie ("ACSO",6);

     t1.addCourse(logica);
     t1.addCourse(fai);
     t1.addCourse(acso);
     t1.printCourses();
     t1.removeCourse(acso);
     t1.printCourses();

    }
}