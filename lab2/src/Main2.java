import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int length = s.length();
        char[] symbols = s.toCharArray();
        boolean status = false;
        int currState;
        currState = 1;
        for (int i = 0; i < length; i++) {
            switch (currState) {
                case 1: {
                    switch (symbols[i]) {
                        case 'a': {
                            currState = 2;
                            break;
                        }
                        case 'b': {
                            currState = 3;
                            break;
                        }
                        case 'c': {
                            status = false;
                            i = length;
                            break;
                        }
                        case 'e': {
                            currState = 4;
                            if (i == length - 1) {
                                status = true;
                            }
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    switch (symbols[i]) {
                        case 'b':
                        case 'c': {
                            currState = 4;
                            if (i == length - 1) {
                                status = true;
                            }
                            break;
                        }
                        case 'a': {
                            status = false;
                            i = length;
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    switch (symbols[i]) {
                        case 'a':
                        case 'b': {
                            status = false;
                            i = length;
                            break;
                        }
                        case 'c': {
                            currState = 3;
                            if (i == length - 1) {
                                status = true;
                            }
                            break;
                        }
                    }
                    break;
                }

            }
        }

        System.out.println(status);
    }

}

