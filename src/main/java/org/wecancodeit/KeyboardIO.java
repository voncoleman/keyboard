package org.wecancodeit;

import java.util.Scanner;

public class KeyboardIO {
    private Scanner input;

    public KeyboardIO() {
        input = new Scanner(System.in);

    }

    public KeyboardIO(Scanner input) {
        this.input = input;
    }

    public Integer getInteger() {
        Integer returnValue = 0;
        while (true) {

            String keys = "";
            try {
                System.out.println("Enter a Value: ");
                keys = input.nextLine();
                returnValue = Integer.parseInt(keys);
                break;

            } catch(NumberFormatException ne){
                System.out.println("Invalid Number");
            }
            catch (Exception ex) {
                throw ex;
            }

        }
        return returnValue;

    }
}
