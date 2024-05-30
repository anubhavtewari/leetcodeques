public class GoalParserInterpretation {
        public String interpret(String command) {
            String str = "";
            for(int i = 0; i < command.length()-1; i++){
                char ch = command.charAt(i);
                char nextCh = command.charAt(i+1);
                if(ch == 'G'){
                    str = str + 'G';
                }
                else if(ch == '(' && nextCh == ')'){
                    str = str + 'o';
                }
                else if(ch == '(' && nextCh == 'a'){
                    str = str + "al";
                }
            }
            if(command.charAt(command.length()-1) == 'G'){
                str = str + 'G';
            }
            return str;
        }
}
