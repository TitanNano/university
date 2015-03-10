import Misc.Console;

public class Checker{

    public static void main(String[] args){
        Stack stack= new Stack();
        Console console= new Console();

        char[] testString= ("(A+B)*C+((A-E)+F)").toCharArray();

        for(int i= 0; i < testString.length(); i++){
            String c= testString[i];

            if(c == ''('){
                stack.push(true);
            }else if(c == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    console.log("ERROR", "TO MANY CLOSING BRACKETS");
                    return;
                }
            }
        }

        if(!stack.isEmpty()){
            console.log("ERROR", "TO MANY OPENING BRACKETS");
        }
    }

}
