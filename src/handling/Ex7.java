class BaseException extends Exception {}

class Base {
    Base() throws BaseException {
        throw new BaseException();
    }
}

class Derived extends Base {
    
    Derived() throws BaseException {
        super();
    }
}

public class Ex7 {
    public static void main(String[] args) {
        try {
            Derived d = new Derived();
    } catch(BaseException e) {
            System.out.println("BaseException caught in main()");
        }
            
    }
}