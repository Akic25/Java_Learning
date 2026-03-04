public class Student extends Person implements Evaluare {
    private int numCourses;
    private Materie[] materii;
    private int[] grades;
    private static final int MAX_COURSES = 30;

    public Student(String name, String address)
    {
        super(name,address);
        numCourses = 0;
        materii = new Materie[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }
    @Override
    public String toString(){
        return "Student: "+ super.toString();
    }
    public void addCourseGrade(Materie materie , int grade){
        materii[numCourses] = materie ;
        grades[numCourses] = grade;
        ++numCourses;
    }
    public void printGrades(){
        System.out.print(this);
        for(int i = 0; i< numCourses;i++){
            System.out.print(" " + materii[i].getName() + ":" + grades[i]);
        }
        System.out.println();
    }
    public double getAverageGrade(){
        int sum=0;
        for(int i =0; i<numCourses;i++)
        {
            sum+=grades[i];
        }
        return (double)sum/numCourses;
    }
    @Override
    public boolean esteBursier(){ //sa zicem ca e bursier daca are media peste 9
        return getAverageGrade() >= 9.0;
    }
    @Override
    public boolean aPromovat(Materie materie){
        int courseIndex = numCourses;
        for(int i = 0; i<numCourses;i++){
            if(materii[i].getName().equals(materie.getName())){
                courseIndex = i;
                break;
            }
        }
        if(grades[courseIndex]>=5)
            return true;
        return false;
    }
}
