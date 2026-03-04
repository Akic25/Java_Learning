public class Teacher extends Person{
    private int numCourses;
    private Materie[]  materii;
    private static final int MAX_COURSES = 10;

    public Teacher(String name, String address){
        super(name,address);
        numCourses = 0;
        materii = new Materie[MAX_COURSES];
    }
    @Override
    public String toString(){
        return "Teacher: " + super.toString();
    }
    public boolean addCourse(Materie materie){
        for(int i = 0;i < numCourses; i++)
        {
            if(materii[i].getName().equals(materie.getName())) return false;
        }
        materii[numCourses] = materie;
        numCourses++;
        return true;
    }
    public boolean removeCourse(Materie materie ){
        int courseIndex = numCourses;
        for(int i = 0; i<numCourses;i++){
            if(materii[i].getName().equals(materie.getName())){
                courseIndex = i;
                break;
            }
        }
        if(courseIndex == numCourses){
            return false;
        }
        else {
            for (int i = courseIndex; i<numCourses-1;i++)
            {
                materii[i] = materii[i+1];
            }
            numCourses--;
            return true;
        }
    }
    public void printCourses(){
        System.out.println("Cursuri predate:");
        for(int i =0; i<numCourses;i++)
            System.out.println("-" + materii[i].getName());
    }
    public boolean addCourse(String course , String tip){
       String denumireCompleta = course + "(" + tip + ")";
       Materie materieNoua = new Materie (denumireCompleta, 5);
       return addCourse(materieNoua);
    }
}

