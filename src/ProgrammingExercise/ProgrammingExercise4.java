package ProgrammingExercise;

public class ProgrammingExercise4 {
    public  static void main(String [] args){
        String [] names = {"Smith", "Ann","Clinton","Gerrard","otherPeople"};
        String son = "Smith";
        String identify = children(names,son);
        System.out.println(identify);
    }

    public  static String children( String[] items, String child){
        System.out.println("hello world");

        for (String name:items
             ) {
            if(name == child){
                System.out.println("You are my child, welcome. You can take any car from the garage");
            }else if(name=="otherPeople"){
                System.out.println("You are a stranger, please be informed that we don't let strangers into the garage");
            }

        }
return "this is a typical program";
    }
}

/*
I applied the following concepts:
1.variable
2. control flow.
3. Logical operator.
4. Conditional

 */
