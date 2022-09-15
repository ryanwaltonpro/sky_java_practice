public class Nesting {
    public static void main(String[] args){
        Nesting n = new Nesting();
        InnerClass i = n.new InnerClass();
        i.printSomethingInner();
        StaticInnerClass inner = new StaticInnerClass();
        inner.printSomethingStatic();
     }
private static int staticInt;
    private int i = 0;
    public void printSomethingOuter(){
        Nesting.StaticInnerClass x = new StaticInnerClass();
        x.printSomethingStatic();
    }

    class InnerClass{
        public void printSomethingInner(){
            System.out.println(i);
        }
    }

    static class StaticInnerClass{
        private int x = 0;
        public void printSomethingStatic(){
            Nesting n = new Nesting();
            System.out.println(staticInt);
        }
    }
}
