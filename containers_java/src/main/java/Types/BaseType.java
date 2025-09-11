package Types;

abstract public class BaseType<T>{
    private T data;
    {
        data=null;
    }
    public T getData()
    {
        return this.data;
    }
    public void setData(T val)
    {
        this.data=val;
    }

    static public class BOOL extends BaseType<Boolean>{
        public BOOL(boolean val)
        {
            this.setData(val);
        }
    }
    static public class INT extends BaseType<Integer>{
        public INT(int val) {this.setData(val);}
    }
    static public class DOUBLE extends BaseType<Double>{
        public DOUBLE(double val)
        {
            this.setData(val);
        }
    }
    static public class FLOAT extends BaseType<Float>{
        public FLOAT(float val)
        {
            this.setData(val);
        }
    }
    static public class CHAR extends BaseType<Character>{
        public CHAR(char val)
        {
            this.setData(val);
        }
    }
    static public class STRING extends BaseType<String>{
        public STRING(String val)
        {
            this.setData(val);
        }
    }
}



