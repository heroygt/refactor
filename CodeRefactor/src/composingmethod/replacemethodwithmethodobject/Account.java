package composingmethod.replacemethodwithmethodobject;

/**
 * Created by apple on 5/5/14.
 */ //Replace Method with Method Object
class Account {
    int gamma (int inputVal, int quantity, int yearToDate) {
        int importantValue1 = (inputVal * quantity) + delta();
        int importantValue2 = (inputVal * yearToDate) + 100;
        if ((yearToDate - importantValue1) > 100)
            importantValue2 -= 20;
        int importantValue3 = importantValue2 * 7;
        // and so on...
        return importantValue3 - 2 * importantValue1;
    }

    private int delta() {
        return 0;
    }

    void xxx() {
        delta();
    }
}

