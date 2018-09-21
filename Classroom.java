public class Classroom{

    public static void main(String[] args){
        Wilder who = new Wilder("Michel", true);
        System.out.println(who.whoAmI());
        Wilder she = new Wilder("Jeanine", false);
        System.out.println(she.whoAmI());
    }
}