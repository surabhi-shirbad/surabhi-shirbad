class Test{
    int add(int a, int b){
        return a+b;
    }
    int sub(int a, int b){
        return a-b;
    }
}
class Main{
    public static void main( String[]args){
        Test obj= new Test();
System.out.println("the add is"+obj.add(1,3));
System.out.println("the sub is"+obj.sub(2,4));
    }
}