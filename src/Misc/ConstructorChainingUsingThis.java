public class ConstructorChainingUsingThis {
    String name;
    int empID;

    ConstructorChainingUsingThis(){
        this(20);
    }

    ConstructorChainingUsingThis(int empID){
        this("Anubhav", 10);
    }

    ConstructorChainingUsingThis(String name, int empID){
        this.name = name;
        this.empID = empID;
    }
}
