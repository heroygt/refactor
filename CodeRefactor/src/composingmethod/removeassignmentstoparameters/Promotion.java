package composingmethod.removeassignmentstoparameters;

/**
 * Created by apple on 5/5/14.
 */
class Promotion {
    int discount (int inputVal, int quantity, int yearToDate) {
        if (inputVal > 50) inputVal -= 2;
        if (quantity > 100) inputVal -= 1;
        if (yearToDate > 10000) inputVal -= 4;
        return inputVal;
    }
}

