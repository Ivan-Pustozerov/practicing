package Ultimate_Containers;
import Types.BaseType;
import Types.BaseType.*;


public class UltimateList {


    static public class Holder {
        public BaseType data;
        public UltimateList.Holder next;

        {
            data = null;
            next = null;
        }

        public Holder(BaseType val) {
            data = val;
        }

    }

    private Holder head;
    private int size;

    {
        size = 0;
    }

    public UltimateList(BaseType val) {
        head = new Holder(val);
        ++size;
    }

    public void pushBack(BaseType val) {
        UltimateList.Holder iter = head;
        if (head == null) {
            head = new Holder(val);
            ++size;
        } else {
            while (iter.next != null) {
                iter = iter.next;
            }
            iter.next = new Holder(val);
            ++size;
        }
    }


    public BaseType popBack() {
        Holder iter = head;
        BaseType res = null;
        if (iter == null) {
        } else if (iter.next == null) {
            res = iter.data;
            head = null;
            --size;
        } else {
            while (iter.next.next != null) {
                iter = iter.next;
            }
            res = iter.next.data;
            iter.next = null;
            --size;
        }
        return res;
    }

    public BaseType At(int index) {
        Holder iter = head;
        if (index < this.size) {
            while (index-- > 0) {
                iter = iter.next;
            }
            return iter.data;
        } else {
            return new INT(-1);//Error
        }
    }

    public void addAt(BaseType val, int index) {
        Holder iter = head;
        if (index < this.size) {
            while (--index > 0) {
                iter = iter.next;
            }
            Holder temp = iter.next;
            iter.next = new Holder(val);
            iter.next.next = temp;
        } else {
            this.pushBack(val);
        }
    }

    public BaseType delAt(int index) {
        Holder iter = head;
        BaseType res = null;
        if (index < this.size) {
            while (--index > 0) {
                iter = iter.next;
            }
            res = iter.next.data;
            iter.next = iter.next.next;
            return res;
        } else {
            return new INT(-1);//Error
        }
    }

    public BaseType findIndex(BaseType val) {
        Holder iter = head;
        while (iter.data != val || iter != null) {
            iter = iter.next;
        }
        return iter.data;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void clear() {
        Holder iter;
        while (head != null) {
            iter = head;
            head = head.next;
            iter = null;
            --this.size;
        }
    }
}
