public class TapeDeckTestDrive {
        public static void main(String[] args) {
            TapeDeck t = new TapeDeck();

            t.canRecord = true;
            t.playTape();

            if(t.canRecord){
                t.recordTape();

            TapeDeck t2 = new TapeDeck();
            t2.playTape();
            t2.canRecord = true; //this is unique for t2 object
            // but if the class members and methods of TapeDeck are static
            // then we can use it using ClassName.MethodName [e.g. TapeDeck.playTape()] (so obviously we don't have to make objects like t or t2)
            }
        }
    }

class TapeDeck{
        boolean canRecord = false;
        void playTape(){
            System.out.println("tape playing");
        }
        void recordTape(){
            System.out.println("tape recording");
        }
}

