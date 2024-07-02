package learningjavabasic;
enum Grade {
    A(4.0,"Genius"), 
    B(3.0,"Very Good"), 
    C(2.0,"Good"), 
    D(1.0,"Not Bad"), 
    F(0.0,"Fail");

    private Grade(double p,String comment) {
        this.point = p;
        this.description=comment;
    }
    public final double point;
    public final String description;
}
public class Program {
    public static void main(String[] args) {
        Grade myGrade = Grade.F;
        System.out.println("Grade = "+myGrade+" , "+myGrade.point);
        System.out.println("Result = "+myGrade.description);
    }

}